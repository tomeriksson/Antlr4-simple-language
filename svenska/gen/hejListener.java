// Generated from /Users/tomeriksson/Downloads/svenska/src/grammar/hej.g4 by ANTLR 4.7.2

package svenska.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hejParser}.
 */
public interface hejListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hejParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(hejParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(hejParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#påstående}.
	 * @param ctx the parse tree
	 */
	void enterPåstående(hejParser.PåståendeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#påstående}.
	 * @param ctx the parse tree
	 */
	void exitPåstående(hejParser.PåståendeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#deklarering}.
	 * @param ctx the parse tree
	 */
	void enterDeklarering(hejParser.DeklareringContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#deklarering}.
	 * @param ctx the parse tree
	 */
	void exitDeklarering(hejParser.DeklareringContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#tilldelning}.
	 * @param ctx the parse tree
	 */
	void enterTilldelning(hejParser.TilldelningContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#tilldelning}.
	 * @param ctx the parse tree
	 */
	void exitTilldelning(hejParser.TilldelningContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#utskrift}.
	 * @param ctx the parse tree
	 */
	void enterUtskrift(hejParser.UtskriftContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#utskrift}.
	 * @param ctx the parse tree
	 */
	void exitUtskrift(hejParser.UtskriftContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#uttryck}.
	 * @param ctx the parse tree
	 */
	void enterUttryck(hejParser.UttryckContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#uttryck}.
	 * @param ctx the parse tree
	 */
	void exitUttryck(hejParser.UttryckContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(hejParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(hejParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#upprepning}.
	 * @param ctx the parse tree
	 */
	void enterUpprepning(hejParser.UpprepningContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#upprepning}.
	 * @param ctx the parse tree
	 */
	void exitUpprepning(hejParser.UpprepningContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#slut}.
	 * @param ctx the parse tree
	 */
	void enterSlut(hejParser.SlutContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#slut}.
	 * @param ctx the parse tree
	 */
	void exitSlut(hejParser.SlutContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#räkna}.
	 * @param ctx the parse tree
	 */
	void enterRäkna(hejParser.RäknaContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#räkna}.
	 * @param ctx the parse tree
	 */
	void exitRäkna(hejParser.RäknaContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#addera}.
	 * @param ctx the parse tree
	 */
	void enterAddera(hejParser.AdderaContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#addera}.
	 * @param ctx the parse tree
	 */
	void exitAddera(hejParser.AdderaContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#subtrahera}.
	 * @param ctx the parse tree
	 */
	void enterSubtrahera(hejParser.SubtraheraContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#subtrahera}.
	 * @param ctx the parse tree
	 */
	void exitSubtrahera(hejParser.SubtraheraContext ctx);
	/**
	 * Enter a parse tree produced by {@link hejParser#villkor}.
	 * @param ctx the parse tree
	 */
	void enterVillkor(hejParser.VillkorContext ctx);
	/**
	 * Exit a parse tree produced by {@link hejParser#villkor}.
	 * @param ctx the parse tree
	 */
	void exitVillkor(hejParser.VillkorContext ctx);
}