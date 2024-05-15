import java.util.Scanner;

public class RowWiseSum {

    public static void findSum(int[][] arr, int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            int sum = 0;
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = s.nextInt();

        int arr[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        findSum(arr, rows, cols);
        s.close();
    }
}
