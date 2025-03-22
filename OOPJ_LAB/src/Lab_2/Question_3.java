package Lab_2;
import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }System.out.println("Sorted Elements are :");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",arr[i]);
        }scanner.close();
    }
}
