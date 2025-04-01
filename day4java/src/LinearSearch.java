import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find:");
        int target = sc.nextInt();
        int cnt = 0;
        for (int j = 0; j<n; j++){
            if (arr[j] == target){
                System.out.println("The indexes element is present at:"+j);
                cnt++;
            }
        }
        System.out.println("The no. of times element is present in the array:"+cnt);
        int res[] = new int[cnt];
        int ind = 0;
        for (int k =0; k<n; k++){
            if (target == arr[k]){
                res[ind] = k;
                ind++;
            }

        }
        System.out.println("The index array is:"+ Arrays.toString(res));

        int mid = 0;
        if (res.length % 2 == 0) {
            mid = ((res.length)-1)/2;
        }else{
            mid = (res.length)/2;
        }
        System.out.println(mid);
        sc.close();
    }
}
