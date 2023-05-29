package visitor.typeAnalyzer;

import ast.node.declaration.ArgDeclaration;
import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.BooleanValue;
import ast.node.expression.values.FloatValue;
import ast.node.expression.values.IntValue;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.FloatType;
import ast.type.primitiveType.IntType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.VarNotDeclared;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.ArrayItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;
    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors){
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1, Type el2){
        if (el1 instanceof IntType && el2 instanceof IntType)
            return true;
        if (el1 instanceof FloatType && el2 instanceof FloatType)
            return true;
        if (el1 instanceof BooleanType && el2 instanceof BooleanType)
            return true;
        if (el1 instanceof NoType && el2 instanceof NoType)
            return true;
        return false;
    }

    public boolean isLvalue(Expression expr){
        //TODO check the expr are lvalue or not
        if (expr instanceof Variable)
            return true;
        return false;
    }


    @Override
    public Type visit(UnaryExpression unaryExpression) {

        Expression uExpr = unaryExpression.getOperand();
        Type expType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();

        //TODO check errors and return the type
        if(operator.equals(UnaryOperator.not)) {
            if (expType instanceof BooleanType) {
                return new BooleanType();
            }
            else if (expType instanceof NoType) {
                return new NoType();
            }
            else {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                return new NoType();
            }
        }
        else {
            if (expType instanceof IntType) {
                return new IntType();
            }
            else if (expType instanceof FloatType) {
                return new FloatType();
            }
            else if (expType instanceof NoType) {
                return new NoType();
            }
            else {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression left = binaryExpression.getLeft();
        Expression right = binaryExpression.getRight();
        Type tl = left.accept(this);
        Type tr = right.accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();

        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)){
            if (tl instanceof BooleanType && tr instanceof BooleanType)
                return new BooleanType();

            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();
        }
        else if (operator.equals(BinaryOperator.eq) || operator.equals(BinaryOperator.neq)){
            if (tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
            else if (sameType(tl, tr))
                return new BooleanType();

        }
        else if (operator.equals(BinaryOperator.gt) || operator.equals(BinaryOperator.lt) ||
                operator.equals(BinaryOperator.gte) || operator.equals(BinaryOperator.lte)){
            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();
            if (sameType(tl,tr))
                return new BooleanType();
        }

        else if ((operator.equals(BinaryOperator.add)) ||
                (operator.equals(BinaryOperator.sub)) ||
                (operator.equals(BinaryOperator.mult)) ||
                (operator.equals(BinaryOperator.div)) ||
                (operator.equals(BinaryOperator.mod)))
        {
            if (tl instanceof NoType && tr instanceof NoType)
                return new NoType();
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();
            if (tl instanceof FloatType && tr instanceof FloatType)
                return new FloatType();
            if ((tl instanceof NoType && (tr instanceof IntType || tr instanceof  FloatType)) ||
                    (tr instanceof NoType && (tl instanceof IntType || tl instanceof  FloatType)))
                return new NoType();
        }


        UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
        typeErrors.add(exception);
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VariableItem varItem = (VariableItem) (SymbolTable.top.get(VariableItem.STARTKEY + identifier.getName()));
            return varItem.getType();
        }
        catch (ItemNotFoundException e){
                typeErrors.add(new VarNotDeclared(identifier.getLine(), identifier.getName()));
                VariableItem varItem = new VariableItem(identifier.getName(), new NoType());
                try {
                    SymbolTable.top.put(varItem);
                } catch (ItemAlreadyExistsException itemAlreadyExistsException) {

                }
                return new NoType();
        }
    }


    @Override
    public Type visit(FunctionCall functionCall) {
        try {
            FunctionItem func = (FunctionItem) SymbolTable.top.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
            ArrayList<Expression> args = functionCall.getArgs();
            if (func.getHandlerDeclaration() != null) {
                ArrayList<ArgDeclaration> typeOfArgs = func.getHandlerDeclaration().getArgs();
                //    if (args.size() != typeOfArgs.size()) {
//                typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getFuncName().getName()));
                //      }
//            for (int i = 0; i < args.size(); i++) {
//                Type argType = args.get(i).accept(this);
//                Type argType2 = typeOfArgs.get(i).getType();
//                if (!sameType(argType, argType2)) {
//                    typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getFuncName().getName()));
//                }
//            }
                return func.getHandlerDeclaration().getType();
            }
            return new NoType();
        }
        catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getUFuncName().getName()));
            ArrayList<Type> arrList = new ArrayList<>();
            for (var arg : functionCall.getArgs()) {
                arrList.add(arg.getType());
            }
            try {
                SymbolTable.top.put(new FunctionItem(functionCall.getUFuncName().getName(), arrList));
            }
            catch (ItemAlreadyExistsException e1) {

            }
            return new NoType();
        }
    }

    @Override
    public Type visit(QueryExpression queryExpression) {
        var query = queryExpression.getVar();
        if (query == null) {
            return new NoType();
        }
        else {
            query.accept(this);
            return new BooleanType();
        }
    }

    @Override
    public Type visit(ArrayAccess arrayAccess){
        try {
            ArrayItem arrItem = (ArrayItem) (SymbolTable.top.get(ArrayItem.STARTKEY + arrayAccess.getName()));
            if (arrayAccess.getIndex().accept(this) instanceof IntType) {
                return arrItem.getType();
            }
            else {
               // typeErrors.add(new UnsupportedOperandType(arrayAccess.getLine(), "[]"));
                return new NoType();
            }
        }
        catch (ItemNotFoundException e){
            typeErrors.add(new VarNotDeclared(arrayAccess.getLine(), arrayAccess.getName()));
//            return new NoType();
            VariableItem varItem = new VariableItem(arrayAccess.getName(), new NoType());
            try {
                SymbolTable.top.put(varItem);
            }
            catch (ItemAlreadyExistsException e2) {

            }
            return new NoType();
        }
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatValue value) {
        return new FloatType();
    }

    @Override
    public Type visit(BooleanValue value) {
        return new BooleanType();
    }
}
