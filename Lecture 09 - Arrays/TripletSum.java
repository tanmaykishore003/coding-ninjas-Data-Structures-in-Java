import java.util.Scanner;

public class TripletSum {

    public static int findTriplet(int arr[], int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    if(arr[i] +arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int target = s.nextInt();

        System.out.println(findTriplet(arr, target));
        s.close();
    }
}
