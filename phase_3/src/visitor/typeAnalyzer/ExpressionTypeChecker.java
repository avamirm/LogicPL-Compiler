package visitor.typeAnalyzer;

import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
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
import symbolTable.itemException.ItemNotFoundException;
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
        //if (el1 instanceof ArrayAccess && el2 instanceof ArrayAccess)
        //    sameType(((ArrayAccess) el1).getType(), ((ArrayAccess) el2).getType());
        //TODO check the two type are same or not

        return false;
    }

    public boolean isLvalue(Expression expr){
        //TODO check the expr are lvalue or not
        if (expr instanceof Identifier)
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

            if ((tl instanceof NoType || tl instanceof BooleanType) &&
                    (tr instanceof BooleanType || tr instanceof NoType))
                return new NoType();
        }
        else if(operator.equals(BinaryOperator.eq) || operator.equals(BinaryOperator.neq)){

            if(!sameType(tl,tr)){
                UnsupportedOperandType exception = new UnsupportedOperandType(right.getLine(), operator.name());
                typeErrors.add(exception);
                return new NoType();
            }
            else {
                if(tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                else
                    return new BooleanType();
            }
        }
        else if(operator.equals(BinaryOperator.gt) || operator.equals(BinaryOperator.lt)){
            if (tl instanceof IntType && tr instanceof IntType)
                return new BooleanType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        else { // + - / *
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        UnsupportedOperandType exception = new UnsupportedOperandType(left.getLine(), operator.name());
        typeErrors.add(exception);
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VariableItem varItem = (VariableItem) (SymbolTable.top.get(VariableItem.STARTKEY + identifier.getName()));
            return varItem.getType();
        } catch (ItemNotFoundException e) {
            typeErrors.add(new VarNotDeclared(identifier.getLine(), identifier.getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        try {
            FunctionItem funcItem = (FunctionItem) (SymbolTable.top.get(FunctionItem.STARTKEY + functionCall.getUFuncName()));
            return funcItem.kkkkkkkkkkkkkkkkkkkkkk
        } catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getUFuncName().getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatType value) {
        return new FloatType();
    }

    @Override
    public Type visit(BooleanType value) {
        return new BooleanType();
    }
}
