package visitor.nameAnalyzer;

import ast.node.Program;
import ast.node.declaration.*;
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
    //
    private static int counter = 0;
    //
    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (FuncDeclaration functionDeclaration : program.getFuncs()) {
            functionDeclaration.accept(this);
        }

        for (var stmt : program.getMain().getMainStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
        }

        return null;
    }


    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);
        SymbolTable.push(functionSymbolTable);

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
//
        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }

        for (var stmt : funcDeclaration.getStatements()) {
            if(stmt instanceof VarDecStmt) {
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
//
        return null;
    }
}
