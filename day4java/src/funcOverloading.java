public class funcOverloading {
    public static void main(String[] args) {
        System.out.println(add(23, 34));
        System.out.println(add(22, 78));
        System.out.println(add(34));
        System.out.println(add(77));
        int val = add(12, 4, 23, 45, 22, 11);
        System.out.println(val);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int n) {
        return n;
    }

    static int add(int... num) {
        for (int val : num) {
            System.out.println(val);
        }
        return 0;
    }
}
