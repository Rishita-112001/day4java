import java.util.Scanner;

public class commonElement {
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
        System.out.println("common Elements :");
        int cnt =0;
        int[] res = new int[(n1<n2)?n1:n2];
        for (int i =0; i<n1; i++){
            for (int j=0; j<n2;j++){
                if (arr1[i] == arr2[j]){
                    res[cnt++] = arr1[i];
                   // System.out.println(arr1[i]);
                }
            }
        }
        for (int i =0; i<cnt; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}
