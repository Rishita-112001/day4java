//if a = 5 is initialized outside the main class , it can be used in all the functions created in
// the main class and outside the main class.

public class scopeVariable {
    public static void main(String[] args){
        int a= 5;
        if (true){
            a = 10;
            System.out.println("Inside the if a ="+a);
        }
        System.out.println("Outside the if a = "+a);
    }
}
