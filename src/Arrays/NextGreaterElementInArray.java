package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElementInArray {
    public static void main(String[] args) {
        /*
        Input:
            Enter the No. of Elements: 5
            Array: [2,3,7,8,1]
         Output:
            2 -> 3
            3 -> 7
            7 -> 8
            8 -> -1
            1 -> -1
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Elements:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            int next=-1;
            for (int j = i+1; j < n; j++) {
                if(a[j]>a[i]){
                    next=a[j];
                    break;
                }
            }
            System.out.println(a[i]+" -> "+next);
        }
    }
}
