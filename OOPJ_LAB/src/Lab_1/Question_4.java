package Lab_1;
import java.util.*;
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is Palindrome");
        }
        else {
            System.out.println(num+" is not Palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
        int originalNumber=num;
        int reversedNumber=0;
        while(num!=0){
            int digit =num%10;
            reversedNumber=reversedNumber*10+digit;
            num/=10;
        }
        return originalNumber==reversedNumber;
    }
}
