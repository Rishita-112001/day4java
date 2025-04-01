import java.util.Scanner;

public class sumOFdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        sum_Digit(num);
    }
    static void sum_Digit(int num){
        int sum = 0;
        int temp = 0;
        while (num!=0) {
            temp = num % 10;
            sum += temp;
            num=num/10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
