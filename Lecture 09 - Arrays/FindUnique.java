import java.util.Scanner;

public class FindUnique {

    public static int uniqueElement(int arr[]) {
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(uniqueElement(arr));
        s.close();
    }
}
