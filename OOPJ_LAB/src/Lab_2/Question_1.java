package Lab_2;
import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();

        if (a >= b && a >= c){
            System.out.printf("The %d is the largest",a);
        }else if (b >= a && b >= c){
            System.out.printf("The %d is the largest",b);
        }else {
            System.out.printf("The %d is the largest",c);
        }
        scanner.close();
    }
}
