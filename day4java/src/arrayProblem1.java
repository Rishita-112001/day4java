import java.util.Scanner;

public class arrayProblem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the array1:");
        for (int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the array2:");
        for (int j = 0; j<n2; j++){
            arr2[j] = sc.nextInt();
        }
        sameArray(arr1,arr2);
    }
    static void sameArray(int arr1[], int arr2[]){
        if (arr1.length == arr2.length){
            System.out.println("The length of two arrays are same."+arr1.length);
            for (int i =0;i<arr1.length;i++){
                if (arr1[i] == arr2[i]){
                    System.out.println("The two arrays have same values in same order");
                }
            }
        }else {
            System.out.println("Not equal.");
        }
    }
}
