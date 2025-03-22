package Lab_1;
import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Grade:");
        int grade= sc.nextInt();
        if (grade>90){
            System.out.println("The Grade is O");
        }
        else if (grade>80){
            System.out.println("The Grade is E");
        }
        else if(grade>70){
            System.out.println("The Grade is A");
        }
        else if(grade>60){
            System.out.println("The Grade is B");
        }
        else{
            System.out.println("The Grade is C");
 }
    }
}
