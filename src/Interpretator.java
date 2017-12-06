import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Interpretator {
    private static ArrayList<String> code = new ArrayList<>();
    private static HashSet<String> variables = new HashSet<>();
    private static HashMap<String, Integer> values = new HashMap<>();

    private static Stack<Integer> iStack = new Stack<>();
    private static Stack<Boolean> bStack = new Stack<>();

    public static void interpret(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                code.add(s);
            }

            int cur = 0;
            int a, b;
            boolean ba, bb;
            while (cur < code.size()) {
                String[] op = code.get(cur).split(" ");
                switch(op[0]) {
                    //variables and int stack
                    case "init":
                        variables.add(op[1]);
                        values.put(op[1], 0);
                        break;
                    case "load":
                        values.put(op[1], iStack.pop());
                        break;
                    case "push_var":
                        iStack.push(values.get(op[1]));
                        break;
                    case "push_num":
                        iStack.push(Integer.valueOf(op[1]));
                        break;

                    //int operations
                    case "sum":
                        b = iStack.pop();
                        a = iStack.pop();
                        iStack.push(a + b);
                        break;
                    case "sub":
                        b = iStack.pop();
                        a = iStack.pop();
                        iStack.push(a - b);
                        break;
                    case "mul":
                        b = iStack.pop();
                        a = iStack.pop();
                        iStack.push(a * b);
                        break;
                    case "div":
                        b = iStack.pop();
                        a = iStack.pop();
                        iStack.push(a / b);
                        break;
                    case "mod":
                        b = iStack.pop();
                        a = iStack.pop();
                        iStack.push(a % b);
                        break;

                    //bool stack
                    case "bpush":
                        bStack.push(Boolean.valueOf(op[1]));
                        break;
                    case "not":
                        bStack.push(!bStack.pop());
                        break;

                    //bool operations
                    case "or":
                        bb = bStack.pop();
                        ba = bStack.pop();
                        bStack.push(ba || bb);
                        break;
                    case "and":
                        bb = bStack.pop();
                        ba = bStack.pop();
                        bStack.push(ba && bb);
                        break;

                    //(int,int) -> bool operations
                    case "gt":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a > b);
                        break;
                    case "ls":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a < b);
                        break;
                    case "ge":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a >= b);
                        break;
                    case "le":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a <= b);
                        break;
                    case "ne":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a != b);
                        break;
                    case "eq":
                        b = iStack.pop();
                        a = iStack.pop();
                        bStack.push(a == b);
                        break;

                    //conditions and jumps
                    case "if":
                        if (!bStack.pop()) {
                            cur = Integer.valueOf(op[1]) - 1;
                        }
                        break;
                    case "jump":
                        cur = Integer.valueOf(op[1]) - 1;
                        break;

                    default:
                        System.out.println("Undefined operation");
                        break;
                }
                cur++;
            }

            for (String var : variables) {
                System.out.println(var + ": " + values.get(var));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
