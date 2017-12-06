import java.util.ArrayList;
import java.util.Stack;

public class CodeListener extends JavaBaseListener {

    private static ArrayList<String> code = new ArrayList<>();
    private int curMissedStrings = 0;
    private Stack<Integer> missedStrings = new Stack<>();

    public static ArrayList<String> getCode() {
        return code;
    }

    //assignment and initialization
    @Override
    public void exitAssignment(JavaParser.AssignmentContext ctx) {
        code.add("load " + ctx.name.getText() + "\n");
    }

    @Override
    public void exitInitialization(JavaParser.InitializationContext ctx) {
        code.add("init " + ctx.name.getText() + "\n");
    }

    //expression
    @Override
    public void exitExpression_atom(JavaParser.Expression_atomContext ctx) {
        if (ctx.getChildCount() == 1) {
            if (ctx.name != null) {
                code.add("push_var " + ctx.name.getText() + "\n");
            } else if (ctx.num != null) {
                code.add("push_num " + ctx.num.getText() + "\n");
            }
        }
    }

    @Override
    public void exitExpression_mul(JavaParser.Expression_mulContext ctx) {
        if (ctx.div != null) {
            code.add("div\n");
        } else if (ctx.mul != null) {
            code.add("mul\n");
        } else if (ctx.mod != null) {
            code.add("mod\n");
        }
    }

    @Override
    public void exitExpression_sum(JavaParser.Expression_sumContext ctx) {
        if (ctx.sum != null) {
            code.add("sum\n");
        } else if (ctx.sub != null) {
            code.add("sub\n");
        }
    }

    //condition
    @Override
    public void exitCondition_or(JavaParser.Condition_orContext ctx) {
        if (ctx.or != null) {
            code.add("or\n");
        }
    }

    @Override
    public void exitCondition_and(JavaParser.Condition_andContext ctx) {
        if (ctx.and != null) {
            code.add("and\n");
        }
    }

    @Override
    public void exitCondition_atom(JavaParser.Condition_atomContext ctx) {
        if (ctx.getChildCount() == 1) {
            code.add("bpush " + ctx.bconst.getText() + "\n");
        } else if (ctx.getChildCount() == 2) {
            code.add("not\n");
        } else if (ctx.getChildCount() == 3) {
            if (ctx.op != null) {
                switch (ctx.op.getText()) {
                    case ">":
                        code.add("gt\n");
                        break;
                    case "<":
                        code.add("ls\n");
                        break;
                    case ">=":
                        code.add("ge\n");
                        break;
                    case "<=":
                        code.add("le\n");
                        break;
                    case "!=":
                        code.add("ne\n");
                        break;
                    case "==":
                        code.add("eq\n");
                        break;
                }
            }
        }
    }

    // if and for
    @Override
    public void exitIfelse(JavaParser.IfelseContext ctx) {

        if (ctx.getChildCount() == 7) {
            int index = missedStrings.pop();
            code.set(index, "if " + code.size() + '\n');
        } else {
            int indexElse = missedStrings.pop();
            code.set(indexElse, "jump " + code.size() + '\n');
            int index = missedStrings.pop();
            code.set(index, "if " + (indexElse + 1) + '\n');
        }
    }

    @Override
    public void enterLoop(JavaParser.LoopContext ctx) {
        missedStrings.push(code.size());
    }

    @Override
    public void exitLoop(JavaParser.LoopContext ctx) {
        int index = missedStrings.pop();
        code.add("jump " + missedStrings.pop() + '\n');
        code.set(index, "if " + code.size() + '\n');
    }

    //code
    @Override
    public void enterCode(JavaParser.CodeContext ctx) {
        missedStrings.push(code.size());
        code.add("");
    }
}
