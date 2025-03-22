package Lab_3;
import java.util.*;
    class box{
        int length,width,height;
        public box(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        int volume(int length,int width,int height){
            int v = length*width*height;
            return v;
        }
    }
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:- ");
        int length = sc.nextInt();
        System.out.println("Enter the width:- ");
        int width = sc.nextInt();
        System.out.println("Enter the height:- ");
        int height = sc.nextInt();
        box b = new box(length,width,height);
        System.out.println(b.volume(length,width,height));;
    }
}