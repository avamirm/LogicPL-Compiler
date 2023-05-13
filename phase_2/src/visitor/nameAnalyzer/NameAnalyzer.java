package visitor.nameAnalyzer;

import ast.node.Program;
import ast.node.declaration.*;
import ast.node.statement.ArrayDecStmt;
import ast.node.statement.ForloopStmt;
import ast.node.statement.ImplicationStmt;
import ast.node.statement.VarDecStmt;
import compileError.*;
import compileError.Name.*;
import symbolTable.SymbolTable;
import symbolTable.symbolTableItems.*;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    private static int counter = 0;

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (FuncDeclaration functionDeclaration : program.getFuncs())
        {
            functionDeclaration.accept(this);
        }

        for (var stmt : program.getMain().getMainStatements())
        {
            if(stmt instanceof VarDecStmt || stmt instanceof ArrayDecStmt ||
                    stmt instanceof ForloopStmt || stmt instanceof ImplicationStmt)
            {
                stmt.accept(this);
            }
        }

        return null;
    }


    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        // ToDo
        boolean isFinished = false;
        while (!isFinished)
        {
            try
            {
                SymbolTable.top.put(functionItem);
                isFinished = true;
            }
            catch (ItemAlreadyExistsException itemAlreadyExistsException)
            {
                FunctionRedefinition errorFunctionRedefinition = new FunctionRedefinition(funcDeclaration.getLine(), funcDeclaration.getName().getName());
                this.nameErrors.add(errorFunctionRedefinition);
                functionItem.setName(funcDeclaration.getName().getName() + "$%:)" + counter);
            }
            counter += 1;
        }
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);
        SymbolTable.push(functionSymbolTable);
        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs())
        {
            varDeclaration.accept(this);
        }

        for (var stmt : funcDeclaration.getStatements())
        {
            if(stmt instanceof VarDecStmt || stmt instanceof ArrayDecStmt ||
               stmt instanceof ForloopStmt || stmt instanceof ImplicationStmt)
            {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDeclaration) {
        var variableItem = new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType());

        // ToDo
        try
        {
            SymbolTable.top.put(variableItem);
        }
        catch (ItemAlreadyExistsException itemAlreadyExistsException)
        {
            VariableRedefinition errorVariableRedefinition = new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName());
            this.nameErrors.add(errorVariableRedefinition);
        }
        return null;
    }
    @Override
    public Void visit(ForloopStmt forLoop) {
        var forIt = new VariableItem(forLoop.getIterator().getName(), forLoop.getIterator().getType());
        // ToDo
        try
        {
            SymbolTable.top.put(forIt);
        }
        catch (ItemAlreadyExistsException itemAlreadyExistsException)
        {
            VariableRedefinition errorValRed = new VariableRedefinition(forLoop.getLine(), forLoop.getIterator().getName());
            this.nameErrors.add(errorValRed);
        }

        var loopSymbolTable = new SymbolTable(SymbolTable.top, forLoop.getArrayName().getName());
        SymbolTable.push(loopSymbolTable);
        for (var stmt : forLoop.getStatements())
        {
            if(stmt instanceof VarDecStmt || stmt instanceof ArrayDecStmt ||
               stmt instanceof ForloopStmt || stmt instanceof ImplicationStmt)
            {
                stmt.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
}
    public Void visit(ArrayDecStmt arrDecStmt) {
        var varItem = new VariableItem(arrDecStmt.getIdentifier().getName(), arrDecStmt.getType());

        // ToDo
        try
        {
            SymbolTable.top.put(varItem);
        }
        catch (ItemAlreadyExistsException alreadyExistsException)
        {
            VariableRedefinition errorArrRedefinition = new VariableRedefinition(arrDecStmt.getLine(), arrDecStmt.getIdentifier().getName());
            this.nameErrors.add(errorArrRedefinition);
        }
        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        var variableItem = new VariableItem(argDeclaration.getIdentifier().getName(), argDeclaration.getType());

        // ToDo
        try
        {
            SymbolTable.top.put(variableItem);
        }
        catch (ItemAlreadyExistsException itemAlreadyExistsException)
        {
            VariableRedefinition errorVariableRedefinition = new VariableRedefinition(argDeclaration.getLine(), argDeclaration.getIdentifier().getName());
            this.nameErrors.add(errorVariableRedefinition);
        }
        return null;
    }

    @Override
    public Void visit(ImplicationStmt impStmt) {
        var impSymbolTable = new SymbolTable(SymbolTable.top, "Implication Statement");
        SymbolTable.push(impSymbolTable);


        for (var stmt : impStmt.getStatements())
        {
            if (stmt instanceof VarDecStmt || stmt instanceof ArrayDecStmt ||
                stmt instanceof ForloopStmt || stmt instanceof ImplicationStmt)
            {
                stmt.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
    }
}
