package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSmallestElementInArray {
    public static void main(String[] args) {
        /*
        Input:
                Enter the Number of Elements: 6
                Enter the Elements: 12 45 7 89 23 56
        Output:
                Second-Smallest Element: 12
                Second-Largest Element: 56
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Elements:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element:");
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        
        //Second Smallest
        int smallest = a[0], second_smallest=a[1];
        if(second_smallest<smallest){
            int temp = smallest;
            smallest=second_smallest;
            second_smallest=temp;
        }

        for (int i = 2; i < n; i++) {
            if(a[i]<smallest){
                second_smallest=smallest;
                smallest=a[i];
            } else if (a[i]<second_smallest && a[i]!=smallest) {
                second_smallest=a[i];
            }
        }

        //Second LARGEST
        int largest=a[0], second_largest=a[1];

        if(second_largest>largest){
            int temp = largest;
            largest = second_largest;
            second_largest=temp;
        }

        for (int i = 2; i < n; i++) {
            if(a[i]>largest){
                second_largest=largest;
                largest=a[i];
            } else if (a[i]>second_largest && a[i]!=largest) {
                second_largest=a[i];
            }
        }

        if(smallest==second_smallest){
            System.out.println("There is same element:"+smallest);
        }
        else {
            System.out.println("Second Smallest Element is:"+second_smallest);
        }

        if (largest == second_largest) {
            System.out.println("There is same Element:"+largest);
        }
        else {
            System.out.println("Second Largest Element is:"+second_largest);
        }
        
        

    }
}
