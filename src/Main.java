public class Main {
    public static void main(String[] args) {
        Compiler.compile("resources/Test.java", "resources/Test.fox");
        Interpretator.interpret("resources/Test.fox");
    }
}
