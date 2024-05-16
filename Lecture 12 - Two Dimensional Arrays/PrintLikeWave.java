import java.util.Scanner;

public class PrintLikeWave {

    public static void print(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int c = col - 1;

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(i % 2 != 0) {
                    System.out.print(arr[c][i]+" ");
                    c--;
                }
                else {
                    c = col - 1;
                    System.out.print(arr[j][i]+" ");
                }
            }
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

        print(arr);
        s.close();
    }
}
