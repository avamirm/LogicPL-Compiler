package visitor.codeGenerator;

import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import visitor.Visitor;
import visitor.typeAnalyzer.ExpressionTypeChecker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import ast.node.Program;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.Expression;
import ast.node.expression.UnaryExpression;
import ast.node.expression.BinaryExpression;
import ast.node.expression.Variable;
import ast.node.expression.Identifier;
import ast.node.expression.values.*;
import ast.node.statement.AssignStmt;
import ast.node.statement.ReturnStmt;
import ast.node.statement.VarDecStmt;
import ast.type.Type;
import ast.type.primitiveType.IntType;
import symbolTable.SymbolTable;
import symbolTable.symbolTableItems.FunctionItem;
import ast.type.primitiveType.FloatType;
import ast.type.primitiveType.BooleanType;

public class CodeGenerator extends Visitor<String> {
    // private FileWriter mainFile;
    private ArrayList<String> slots = new ArrayList<>();
    private StringBuilder str = new StringBuilder();

    private String getVarType(Type type) {
        if (type instanceof IntType) {
            return "I";
        }
        return "V";
    }

    private int slotOf(String identifier) {
        for (int i = 0; i < slots.size(); i++)
            if (slots.get(i).equals(identifier))
                return i;
        slots.add(identifier);
        return slots.size() - 1;
    }

    public void addStaticMainMethod() {
        String command;
        command = ".class public Main\n";
        command += ".super java/lang/Object\n";
        command += ".method public <init>()V\n";
        command += "aload_0\n";
        command += "invokenonvirtual java/lang/Object/<init>()V\n";
        command += "return\n";
        command += ".end method\n";
        str.append(command).append('\n');
    }

    @Override
    public String visit(Program program) {
        addStaticMainMethod();
        str.append(program.getMain().accept(this)).append('\n');

        for (var funcDeclaration : program.getFuncs()) {
            slots.clear();
            str.append(funcDeclaration.accept(this)).append('\n');
        }

        return str.toString();
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        String command = ".method public static main([Ljava/lang/String;)V\n";
        command += ".limit stack 32\n";
        command += ".limit locals 32\n";

        slotOf("args");


        for (var stmt : mainDeclaration.getMainStatements()) {
            if (stmt instanceof VarDecStmt || stmt instanceof AssignStmt || stmt instanceof ReturnStmt)
                command += stmt.accept(this);
        }

        command += "return\n";
        command += ".end method\n";
        return command;
    }

    @Override
    public String visit(FuncDeclaration funcDeclaration) {
        String funcName = funcDeclaration.getName().getName();
        String command = ".method public static" + " " + funcName + "(";
        StringBuilder args = new StringBuilder();

        for (var arg : funcDeclaration.getArgs()) {
            args.append(getVarType(arg.getType()));
            slotOf(arg.getIdentifier().getName());
        }

        args.append(")");
        args.append(getVarType(funcDeclaration.getType()) + "\n");
        command += args.toString();
        command += ".limit stack 32\n";
        command += ".limit locals 32\n";

        for (var stmt : funcDeclaration.getStatements()) {
            if (stmt instanceof VarDecStmt || stmt instanceof AssignStmt || stmt instanceof ReturnStmt)
                command += stmt.accept(this);
        }

        command += "ireturn\n";
        command += ".end method\n";
        return command;
    }
    @Override
    public String visit(ReturnStmt returnStmt) {
        Expression returnValue = returnStmt.getExpression();
        String command = returnValue.accept(this);
        return command;
    }
    @Override
    public String visit(VarDecStmt varDecStmt) {
        Expression initExpr = varDecStmt.getInitialExpression();
        int slot = slotOf(varDecStmt.getIdentifier().getName());
        String command = "";

        if (initExpr != null) {
            command += initExpr.accept(this);
            command += "istore " + slot + "\n";
        } else {
            command += "iconst_0\n";
            command += "istore " + slot + "\n";
        }
        return command;
    }

    @Override
    public String visit(AssignStmt assignStmt) {
        Expression rhs = assignStmt.getRValue();
        int slot = slotOf(((Variable) assignStmt.getLValue()).getName());
        String command = rhs.accept(this);
        command += "istore " + slot + "\n";
        return command;
    }
    @Override
    public String visit(UnaryExpression unaryExpression) {
        Expression expr = unaryExpression.getOperand();
        String command = "";
        UnaryOperator op = unaryExpression.getUnaryOperator();
        if (op == UnaryOperator.minus)
            command += "ineg\n";
        else if (op == UnaryOperator.not)
            command += "iconst_1\nixor\n";
        return expr.accept(this) + command;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        Expression lhs = binaryExpression.getLeft();
        Expression rhs = binaryExpression.getRight();
        String command = "";
        BinaryOperator op = binaryExpression.getBinaryOperator();
        if (op == BinaryOperator.add)
            command += "iadd\n";
        else if (op == BinaryOperator.sub)
            command += "isub\n";
        else if (op == BinaryOperator.mult)
            command += "imul\n";
        else if (op == BinaryOperator.div)
            command += "idiv\n";
        else if (op == BinaryOperator.mod)
            command += "imod\n";
        return lhs.accept(this) + rhs.accept(this) + command;
    }

    @Override
    public String visit(Identifier identifier) {
        return "iload " + slotOf(identifier.getName()) + '\n';
    }

    @Override
    public String visit(IntValue intValue) {
        return "ldc " + intValue.getConstant() + '\n';
    }
}


