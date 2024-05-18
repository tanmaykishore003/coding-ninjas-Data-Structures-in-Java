import java.util.Scanner;

public class FindDuplicate {
    
    public static int duplicateElement(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i + 1]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(duplicateElement(arr));

        s.close();
    }
}
