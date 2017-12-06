class Test {
    public static void main(String[] args) {
        int a;
        int b;
        a = 156;
        b = 69;

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        return;
    }
}
