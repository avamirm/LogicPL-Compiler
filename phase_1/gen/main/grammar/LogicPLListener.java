// Generated from D:/Term6/Complier/Cas/ca1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LogicPLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LogicPLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(LogicPLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(LogicPLParser.ArgListContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#argDec}.
	 * @param ctx the parse tree
	 */
	void enterArgDec(LogicPLParser.ArgDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#argDec}.
	 * @param ctx the parse tree
	 */
	void exitArgDec(LogicPLParser.ArgDecContext ctx);
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
	 * Enter a parse tree produced by {@link LogicPLParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(LogicPLParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(LogicPLParser.ListTypeContext ctx);
}