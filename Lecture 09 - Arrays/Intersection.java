import java.util.Scanner;

public class Intersection {

    public static void findIntersection(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr2[j] == arr1[i]) {
                    System.out.print(arr2[j]+" ");
                    arr1[i] = Integer.MIN_VALUE;
                    break;
                }
            }
        } 
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for(int i = 0; i < m; i++) {
            arr1[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        findIntersection(arr1, arr2);

        s.close();
    }
}
