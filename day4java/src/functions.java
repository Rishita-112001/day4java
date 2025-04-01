import java.util.Scanner;

public class functions {
    public static void main(String[] args){
        //tea();
       // coffee();
        //add(3,4,"seema");
       // add(4,9,"riya");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        square(n);

    }
    static void tea(){
        System.out.println("You're in the process of making tea");
    }
    static void coffee(){
        System.out.println("Process of making coffee");
    }
    static void add(int x, int y,String name){
        System.out.println(x+y);
        System.out.println(name);
    }
    static void square(int n){
        System.out.println(n*n);
    }
}
