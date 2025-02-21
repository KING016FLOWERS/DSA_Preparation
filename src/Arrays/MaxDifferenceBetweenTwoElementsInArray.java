package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifferenceBetweenTwoElementsInArray {
    public static void main(String[] args) {
        /*
        Input:
            Enter the No. of Elements: 6
            Arr = [-9,8,4,-1,5,0]
        Output:
            Difference: 17
            Elements: -9 and 8
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element:");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max=0;
        int x=arr[0];
        int y=arr[0];
        boolean s = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[j] - arr[i]);
                if (diff > max) {
                    max = diff;
                    x = arr[i];
                    y = arr[j];
                    s=true;
                }
            }
        }
        if(s){
            System.out.println("Difference is:" + max);
            System.out.println("Elements are: " + x + " and " + y);
        }
        else{
            System.out.println("Invalid values (All are Same Values):"+arr[0]);
        }
    }
}
