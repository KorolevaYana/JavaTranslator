// Generated from /home/fox/IdeaProjects/MT3/src/Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(JavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(JavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(JavaParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(JavaParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(JavaParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(JavaParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#code_return}.
	 * @param ctx the parse tree
	 */
	void enterCode_return(JavaParser.Code_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#code_return}.
	 * @param ctx the parse tree
	 */
	void exitCode_return(JavaParser.Code_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(JavaParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(JavaParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression_sum}.
	 * @param ctx the parse tree
	 */
	void enterExpression_sum(JavaParser.Expression_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression_sum}.
	 * @param ctx the parse tree
	 */
	void exitExpression_sum(JavaParser.Expression_sumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression_mul}.
	 * @param ctx the parse tree
	 */
	void enterExpression_mul(JavaParser.Expression_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression_mul}.
	 * @param ctx the parse tree
	 */
	void exitExpression_mul(JavaParser.Expression_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpression_atom(JavaParser.Expression_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpression_atom(JavaParser.Expression_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(JavaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(JavaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void enterCondition_or(JavaParser.Condition_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void exitCondition_or(JavaParser.Condition_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(JavaParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(JavaParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#condition_atom}.
	 * @param ctx the parse tree
	 */
	void enterCondition_atom(JavaParser.Condition_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#condition_atom}.
	 * @param ctx the parse tree
	 */
	void exitCondition_atom(JavaParser.Condition_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(JavaParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(JavaParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#int_op}.
	 * @param ctx the parse tree
	 */
	void enterInt_op(JavaParser.Int_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#int_op}.
	 * @param ctx the parse tree
	 */
	void exitInt_op(JavaParser.Int_opContext ctx);
}