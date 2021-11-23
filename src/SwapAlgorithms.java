public class Test {
    public static void main(String[] args) {
        swap(1, 2);
        swap(-1, 2);
        swap(-1, -2);
    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + ":" + b);
    }
}