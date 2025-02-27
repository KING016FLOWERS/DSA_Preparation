package SearchingAlorithm;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int result = Linear(a,0,9);
        if(result!=-1){
            System.out.println("Element found at index:"+result);
        }

        else{
            System.out.println("Element not found");
        }
    }
    public static int Linear(int[] arr, int index, int target){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return Linear(arr, index+1, target);
    }
}
