package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinDistanceBetweenArrayElements {
    public static void main(String[] args) {
        /*
        Input:
                Enter the No. of Elements: 6
                Arr = [1, 2, 3, 4, 5, 6]
                x = 2
                y = 5
        Output:
               Distance: 3
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Number:");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("X:");
        int x = sc.nextInt();

        System.out.print("Y:");
        int y = sc.nextInt();

        int start=0, end=0;
        for (int i = 0; i < n; i++) {
            if(x==arr[i]){
                start=i;
                break;
            }

        }

        for (int j = 0; j < n; j++) {
            if(y==arr[j]){
                end=j;
                break;
            }

        }
        int result = end-start;
        System.out.println("Distance:"+result);

        sc.close();
    }
}
