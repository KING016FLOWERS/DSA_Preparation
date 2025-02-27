package SearchingAlorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the Element to search:");
        int target = sc.nextInt();

        int result = binary(a,0,n-1,target);

        if(result!=-1){
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int binary(int[] a, int left, int right, int target){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;

        if(a[mid] == target){
         return mid;
        }
        else if(target > a[mid]){
            return binary(a, mid+1, right, target);
        }
        else{
            return binary(a,left, mid-1, target);
        }
    }

}
