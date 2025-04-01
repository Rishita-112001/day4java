public class callStackExample {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }
    public static void methodC() {
        System.out.println("Inside methodC");
    }
}
