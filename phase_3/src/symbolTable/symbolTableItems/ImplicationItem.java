package symbolTable.symbolTableItems;

import ast.node.statement.ForloopStmt;
import ast.node.statement.ImplicationStmt;
import symbolTable.SymbolTable;

public class ImplicationItem extends SymbolTableItem {
    protected SymbolTable implicationSymbolTable;
    protected ImplicationStmt implicationStmt;

    public static final String STARTKEY = "Implication_";
    private static int counter = 0;
    private int id;

    public ImplicationItem(String name) {
        this.name = name;
        this.id = counter++;
    }

    public ImplicationItem(ImplicationStmt implicationStmt) {
        this.id = counter++;
        implicationStmt.setId(this.id);
        this.name = implicationStmt.toString();
        this.implicationStmt = implicationStmt;
    }

    public SymbolTable getImplicationSymbolTable() {
        return this.implicationSymbolTable;
    }

    public void setImplicationSymbolTable(SymbolTable symbolTable) {
        this.implicationSymbolTable = symbolTable;
    }

    @Override
    public String getKey() {
        return ImplicationItem.STARTKEY + this.name + id;
    }
}