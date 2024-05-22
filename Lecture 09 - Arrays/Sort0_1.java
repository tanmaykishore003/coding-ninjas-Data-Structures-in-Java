// Not completed

import java.util.Scanner;

public class Sort0_1 {

    public static void sortArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if(arr[i] < arr[j]) {
                i++;
                j--;
            }

            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            if(arr[i] == arr[j]) {
                j--;
            }
        }

        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        sortArray(arr);
        s.close();
    }
}
