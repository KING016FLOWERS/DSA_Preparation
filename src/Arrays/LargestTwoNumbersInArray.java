package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class LargestTwoNumbersInArray{
    public static void main(String[] args) {
        /*
        Input:
            Enter the Number of Elements: 6
            Enter the Elements: 12 45 7 89 23 56
        Output:
            First-Largest Element: 89
            Second-Largest Element: 56
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int first=a[0];
        int second=a[1];

        if (second>first){
                int temp=first;
                first = second;
                second = temp;
        }

        for (int i = 2; i < n; i++) {
            if (a[i]>first){
                second=first;
                first=a[i];
            } else if (a[i]>second && a[i]!=first) {
                second=a[i];
            }
        }

        if(first==second){
            System.out.println("There is same value:"+first);
        }
        else {
            System.out.println("First-Largest Element is:" + first);
            System.out.println("Second-Largest Element is:" + second);
        }
    }
}