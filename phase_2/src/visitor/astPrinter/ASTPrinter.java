package visitor.astPrinter;

import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.expression.*;
import ast.node.expression.values.*;
import ast.node.statement.*;
import visitor.Visitor;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (FuncDeclaration funcDeclaration : program.getFuncs())
            funcDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.toString());
        for (Statement statement: mainDeclaration.getMainStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        messagePrinter(argDeclaration.getLine(), argDeclaration.toString());
        if (argDeclaration.getIdentifier() != null)
            argDeclaration.getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        // ToDo
        messagePrinter(funcDeclaration.getLine(), funcDeclaration.toString());
        funcDeclaration.getName().accept(this);
        for (Identifier arg: funcDeclaration.getArgs())
            arg.accept(this);
        funcDeclaration.getStatements().accept(this);////////////////
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        // ToDo
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        // ToDo
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        // ToDo
        messagePrinter(identifier.getLine(), identifier.toString());
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess) {
        // ToDo
        messagePrinter(arrayAccess.getLine(), arrayAccess.toString());
        arrayAccess.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        // ToDo
        messagePrinter(functionCall.getLine(), functionCall.toString());
        functionCall.getUFuncName().accept(this);////////////////////
        for (Expression args: functionCall.getArgs())
            args.accept(this);
        return null;
    }

    @Override
    public Void visit(QueryExpression queryExpression) {
        // ToDo
        messagePrinter(queryExpression.getLine(), queryExpression.toString());
        queryExpression.getPredicateName().accept(this);
        queryExpression.getVar().accept(this);
        return null;
    }

    @Override
    public Void visit(IntValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(FloatValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(BooleanValue value) {
        // ToDo
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {//////////////////////
        // ToDo
        messagePrinter(arrayDecStmt.getLine(), arrayDecStmt.toString());
        arrayDecStmt.getType().accept(this);
        arrayDecStmt.getArrSize ().accept(this);
        arrayDecStmt.getIdentifier().accept(this);

        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {////////////////////////////////////////////////
        // ToDo
        messagePrinter(forloopStmt.getLine(), forloopStmt.toString());
        forloopStmt.getIterator().accept(this);
        forloopStmt.getArrayName().accept(this);
        forloopStmt.getStatements().accept(this);

        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {//////////////////////////////
        // ToDo
        messagePrinter(implicationStmt.getLine(), implicationStmt.toString());
        implicationStmt.getCondition().accept(this);
        implicationStmt.getStatements().accept(this);
        return null;
    }

    @Override
    public Void visit(PredicateStmt predicateStmt) {////////////////////////////////
        // ToDo
        messagePrinter(predicateStmt.getLine(), predicateStmt.toString());
        predicateStmt.getIdentifier().accept(this);
        predicateStmt.getVar().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        // ToDo
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        returnStmt.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {////////////////////////////
        // ToDo
        messagePrinter(varDecStmt.getLine(), varDecStmt.toString());
        varDecStmt.getType().accept();
        varDecStmt.getIdentifier.accept();
        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        // ToDo
        messagePrinter(printStmt.getLine(), printStmt.toString());
        printStmt.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        // ToDo
        messagePrinter(assignStmt.getLine(), assignStmt.toString());
        assignStmt.getLValue().accept(this);
        assignStmt.getRValue().accept(this);
        return null;
    }

}

