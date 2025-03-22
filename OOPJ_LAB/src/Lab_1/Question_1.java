package Lab_1;
import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.next();
        System.out.println("Enter the roll no:");
        int roll=sc.nextInt();
        System.out.println("Enter the section:");
        String section=sc.next();
        System.out.println("Enter the branch:");
        String branch=sc.next();

        System.out.println("Name:"+name);
        System.out.println("Roll no:"+roll);
        System.out.println("Section:"+section);
        System.out.println("Branch:"+branch);
    }
}