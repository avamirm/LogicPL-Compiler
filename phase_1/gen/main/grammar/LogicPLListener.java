// Generated from D:/Compiler/CA/LogicPL-Compiler/phase_1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicPLParser}.
 */
public interface LogicPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 */
	void enterLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 */
	void exitLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LogicPLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LogicPLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LogicPLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LogicPLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LogicPLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LogicPLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#query1}.
	 * @param ctx the parse tree
	 */
	void enterQuery1(LogicPLParser.Query1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#query1}.
	 * @param ctx the parse tree
	 */
	void exitQuery1(LogicPLParser.Query1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#query2}.
	 * @param ctx the parse tree
	 */
	void enterQuery2(LogicPLParser.Query2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#query2}.
	 * @param ctx the parse tree
	 */
	void exitQuery2(LogicPLParser.Query2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LogicPLParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LogicPLParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(LogicPLParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(LogicPLParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(LogicPLParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(LogicPLParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStmt(LogicPLParser.FuncCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStmt(LogicPLParser.FuncCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(LogicPLParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(LogicPLParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(LogicPLParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(LogicPLParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(LogicPLParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(LogicPLParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(LogicPLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(LogicPLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#rightImplicateStatement}.
	 * @param ctx the parse tree
	 */
	void enterRightImplicateStatement(LogicPLParser.RightImplicateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#rightImplicateStatement}.
	 * @param ctx the parse tree
	 */
	void exitRightImplicateStatement(LogicPLParser.RightImplicateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LogicPLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LogicPLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogicPLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogicPLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(LogicPLParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(LogicPLParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(LogicPLParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(LogicPLParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#isNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(LogicPLParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#isNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(LogicPLParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#ltgtExpression}.
	 * @param ctx the parse tree
	 */
	void enterLtgtExpression(LogicPLParser.LtgtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#ltgtExpression}.
	 * @param ctx the parse tree
	 */
	void exitLtgtExpression(LogicPLParser.LtgtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(LogicPLParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(LogicPLParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(LogicPLParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(LogicPLParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 */
	void enterTildaNegOperator(LogicPLParser.TildaNegOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 */
	void exitTildaNegOperator(LogicPLParser.TildaNegOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#factor_}.
	 * @param ctx the parse tree
	 */
	void enterFactor_(LogicPLParser.Factor_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#factor_}.
	 * @param ctx the parse tree
	 */
	void exitFactor_(LogicPLParser.Factor_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LogicPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LogicPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(LogicPLParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(LogicPLParser.ArrayTypeContext ctx);
}