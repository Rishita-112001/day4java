import java.util.Scanner;

public class squareFunc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        square(n);
    }
    static void square(int n){
        System.out.println(n*n);
    }
}
