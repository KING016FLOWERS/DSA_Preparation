package SearchingAlorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the element to search:");
        int target = sc.nextInt();

        int low=0, high=a.length-1, mid=0,result=-1;
        while(low<=high){
            mid = low + (high-low)/2;

            if(a[mid]==target){
                result=mid;
                break;
            }
            else if(target>a[mid]){
                    low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(result!=-1){
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found");
        }


    }
}
