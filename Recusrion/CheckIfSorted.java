import java.util.Scanner;

public class CheckIfSorted {

    public static boolean isSorted(int arr[]) {
        if(arr.length == 1) {
            return true;
        }

        int smallArray[] = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }

        boolean smallAns = isSorted(smallArray);
        if(!smallAns) {
            return false;
        }

        if(arr[0] <= arr[1]) {
            return true;
        }
        else {
            return false;
        }
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(isSorted(arr));
        s.close();
    }
}
