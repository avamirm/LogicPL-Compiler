package visitor.typeAnalyzer;

import ast.node.Program;
import ast.node.declaration.Declaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.Expression;
import ast.node.expression.FunctionCall;
import ast.node.expression.Identifier;
import ast.node.expression.QueryExpression;
import ast.node.expression.operators.BinaryOperator;
import ast.node.statement.*;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.LeftSideNotLValue;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.ConditionTypeNotBool;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.ForLoopItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.ImplicationItem;
import symbolTable.symbolTableItems.MainItem;
import visitor.Visitor;

import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        for(var functionDec : program.getFuncs()) {
            functionDec.accept(this);
        }

        program.getMain().accept(this);

        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        try {
            FunctionItem functionItem = (FunctionItem)  SymbolTable.root.get(FunctionItem.STARTKEY + funcDeclaration.getName().getName());
            SymbolTable.push((functionItem.getFunctionSymbolTable()));
        } catch (ItemNotFoundException e) {
            //unreachable
        }

        for(var stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainItemSymbolTable(mainSymbolTable);

        SymbolTable.push(mainItem.getMainItemSymbolTable());

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();

        return null;
    }
    @Override
    public Void visit(ForloopStmt forloopStmt) {
        try {
            ForLoopItem forLoopItem = (ForLoopItem) SymbolTable.root.get(ForLoopItem.STARTKEY + forloopStmt.toString() + forloopStmt.getForLoopId());
            SymbolTable.push(forLoopItem.getForLoopSymbolTable());
        } catch (ItemNotFoundException e) {
            // unreachable
        }

        for (var stmt : forloopStmt.getStatements()) {
            stmt.accept(this);
        }
        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);
        
        if (!expressionTypeChecker.sameType(tl, tr) && !(tl instanceof NoType) && !(tr instanceof NoType)) {
            typeErrors.add(new UnsupportedOperandType(assignStmt.getLine(), assignStmt.getLValue().toString()));
        }
        if (!expressionTypeChecker.isLvalue(assignStmt.getLValue())) {
            typeErrors.add(new LeftSideNotLValue(assignStmt.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        try {
                SymbolTable.root.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
        }
        catch (ItemNotFoundException e) {

        }
        functionCall.accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        printStmt.getArg().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ImplicationStmt impStmt){
        try {
            ImplicationItem implicationItem = (ImplicationItem) SymbolTable.root.get(ImplicationItem.STARTKEY + impStmt.toString() + impStmt.getImplicationId());
            SymbolTable.push(implicationItem.getImplicationSymbolTable());
        } catch (ItemNotFoundException e) {
            // unreachable
        }

        Type tl = impStmt.getCondition().accept(expressionTypeChecker);
        if (!(tl instanceof BooleanType)) {
            typeErrors.add(new ConditionTypeNotBool(impStmt.getLine()));
        }

        for (var stmt : impStmt.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        returnStmt.getExpression().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        int counter = 0;
        if (!arrayDecStmt.getInitialValues().isEmpty()) {
            for (var expression : arrayDecStmt.getInitialValues()) {
                Type tl = expression.accept(expressionTypeChecker);
                Type tr = arrayDecStmt.getType();
                if (!expressionTypeChecker.sameType(tl, tr) && !(tl instanceof NoType) && !(tr instanceof NoType)) {
                    counter++;
                }
            }
        }
        if (counter > 0) {
            typeErrors.add(new UnsupportedOperandType(arrayDecStmt.getLine(), BinaryOperator.assign.name()));
        }
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        if (varDecStmt.getInitialExpression() != null) {
            Type tl = varDecStmt.getInitialExpression().accept(expressionTypeChecker);
            Type tr = varDecStmt.getType();
            if (!expressionTypeChecker.sameType(tl, tr) && !(tl instanceof NoType) && !(tr instanceof NoType)) {
                typeErrors.add(new UnsupportedOperandType(varDecStmt.getLine(), BinaryOperator.assign.name()));
            }
        }
        return null;
    }
}
