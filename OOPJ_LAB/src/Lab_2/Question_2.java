package Lab_2;
import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                even_count++;
            }else {
                odd_count++;}
        }
        System.out.printf("The even count is %d\nThe odd count is %d", even_count,odd_count);
        scanner.close();

    }
}
