import java.util.Scanner;

public class LargestRowOrCol {

    public static void findLargest(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int largestRow = Integer.MIN_VALUE;
        int largestCol = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            if (sum > largestRow) {
                largestRow = sum;
                rowIndex = i;
            }
        }

        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            if (sum > largestCol) {
                largestCol = sum;
                colIndex = i;
            }
        }

        if(largestCol > largestRow) {
            System.out.println("Col "+ colIndex +": "+ largestCol);
        }
        else {
            System.out.println("Row "+ rowIndex +": "+ largestRow);
        }
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Calling Function");

        findLargest(arr);
        s.close();
    }
}
