package Lab_3;
import java.util.*;
class input{
    int roll_number;
    String name;
    double CGPA;

    public input(int roll_number, String name, double CGPA) {
        this.roll_number = roll_number;
        this.name = name;
        this.CGPA = CGPA;
    }
    public String toString(){
        return "Roll_Number:- "+roll_number+", Name:- "+name+", CGPA:- "+CGPA;
    }
}
public class Question_3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:- ");
        int n = sc.nextInt();
        ArrayList<input>students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for students "+(i+1)+": ");
            System.out.println("Roll Number:- ");
            int roll_number = sc.nextInt();
            sc.nextLine();
            System.out.println("Name:- ");
            String name = sc.nextLine();
            System.out.println("CGPA:- ");
            double CGPA = sc.nextDouble();
            sc.nextLine();
            students.add(new input(roll_number,name,CGPA));
        }
        input lowestCGPA = students.get(0);
        for (input student: students){
            if (student.CGPA< lowestCGPA.CGPA){
                lowestCGPA=student;
            }
        }
        System.out.println("\nStudent with lowest CGPA:- ");
        System.out.println("Name:- "+lowestCGPA.name);
    }
}