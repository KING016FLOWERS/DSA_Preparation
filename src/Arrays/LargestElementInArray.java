package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {

        /*
        Input:
            Enter the number of elements: 5
            Enter the elements: 10 25 40 15 30
        Output:
            Largest element in the array: 40
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(a));

        int v = a[0];
        for (int i = 1; i < n; i++) {
            if(a[i]>v){
                v=a[i];
            }
        }
        System.out.println("Largest Element in Array is:"+v);
        sc.close();
    }
}
