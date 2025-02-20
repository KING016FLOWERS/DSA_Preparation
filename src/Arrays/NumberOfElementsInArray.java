package Arrays;

import java.util.Scanner;

public class NumberOfElementsInArray {
    public static void main(String[] args) {
    /*
   Input:
        10 20 30 40 50
    Output:
        Number of elements in the array: 5
     */
        int a[] = {10, 20, 30, 40, 50};
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count=count+1;
        }
        System.out.println("Number of Elements in an Array:" +count);
    }

}
