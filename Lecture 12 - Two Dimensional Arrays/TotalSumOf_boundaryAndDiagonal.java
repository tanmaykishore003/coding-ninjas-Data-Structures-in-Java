import java.util.Scanner;

public class TotalSumOf_boundaryAndDiagonal {

    public static int sum(int arr[][]) {
        int N = arr.length;

        int sum = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    sum += arr[i][j];
                }
                else if(i == j || (i + j) == N - 1) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int arr[][] = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println(sum(arr));

        s.close();
    }
}
