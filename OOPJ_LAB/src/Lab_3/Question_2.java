package Lab_3;
import java.util.*;
class rectangle{
    int length,breadth;
void read(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
}
int area(int length,int breadth){
    return length*breadth;
}
int perimeter(int length,int breadth){
    return 2*(length+breadth);
}
void display(){
    System.out.println("Area is:- "+area(length,breadth));
    System.out.println("Perimeter is:- "+perimeter(length,breadth));
}
}
public class Question_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    rectangle rec = new rectangle();
        System.out.println("Enter the length:- ");
        int length= sc.nextInt();
        System.out.println("Enter the breadth:- ");
        int breadth=sc.nextInt();
    rec.read(length,breadth);
    rec.area(length,breadth);
    rec.perimeter(length,breadth);
    }
}
