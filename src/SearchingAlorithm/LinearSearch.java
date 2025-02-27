package SearchingAlorithm;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to Search:");
        int target = sc.nextInt();
        int result = -1;
        for (int i = 0; i < n; i++) {
            if(a[i] == target){
                result = i;
                break;
            }
        }
        if(result!=-1){
            System.out.println("Element "+target+" found at: "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
