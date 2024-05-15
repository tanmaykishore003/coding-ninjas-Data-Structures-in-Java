import java.util.Scanner;

public class Creating2D {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter element at "+ i + " row and "+ j + " column: ");
                input[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}