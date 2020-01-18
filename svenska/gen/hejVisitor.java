// Generated from /Users/tomeriksson/Downloads/svenska/src/grammar/hej.g4 by ANTLR 4.7.2

package svenska.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hejParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hejVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hejParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(hejParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#påstående}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPåstående(hejParser.PåståendeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#deklarering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklarering(hejParser.DeklareringContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#tilldelning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTilldelning(hejParser.TilldelningContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#utskrift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtskrift(hejParser.UtskriftContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#uttryck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUttryck(hejParser.UttryckContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(hejParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#upprepning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpprepning(hejParser.UpprepningContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#slut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlut(hejParser.SlutContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#räkna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRäkna(hejParser.RäknaContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#addera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddera(hejParser.AdderaContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#subtrahera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtrahera(hejParser.SubtraheraContext ctx);
	/**
	 * Visit a parse tree produced by {@link hejParser#villkor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVillkor(hejParser.VillkorContext ctx);
}