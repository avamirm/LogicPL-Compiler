// Generated from D:/Term6/Complier/Cas/ca1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#logicPL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicPL(LogicPLParser.LogicPLContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(LogicPLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(LogicPLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(LogicPLParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LogicPLParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(LogicPLParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#argDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDec(LogicPLParser.ArgDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(LogicPLParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LogicPLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(LogicPLParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(LogicPLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#isNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpression(LogicPLParser.IsNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#ltgtExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtgtExpression(LogicPLParser.LtgtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(LogicPLParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(LogicPLParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildaNegOperator(LogicPLParser.TildaNegOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#factor_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_(LogicPLParser.Factor_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(LogicPLParser.ListTypeContext ctx);
}