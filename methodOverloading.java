public class functionOverloading {

    public static void main(String[] args) {
        int result1 = sum(1, 1, 1, 1);
        System.out.println(result1);
        int result2 = sum(1, 1);
        System.out.println(result2);
        int result3 = sum(1, 1, 1);
        System.out.println(result3);
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    static int sum(int a, int b, int c, int d) {
        return (a + b + c + d);
    }
}
