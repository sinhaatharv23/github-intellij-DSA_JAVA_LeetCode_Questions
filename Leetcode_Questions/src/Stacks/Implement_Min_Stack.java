package Stacks;
import java.util.*;
import java.util.Stack;
class Min_Stack{
    int top=-1;
    ArrayList<Integer>nums;
    public Min_Stack(){
        nums = new ArrayList<>();
    }
    void push(int x){
            top++;
            System.out.println(x+"is pushed into the stack");
            nums.add(x);
        return;
    }
    void pop(){
        if (top==-1){
            System.out.println("Empty");
        }else{
            System.out.println(nums.get(top));
            nums.remove(top);
            top--;
        }
    }
    int get_min(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <=top; i++) {
            min = Math.min(nums.get(i),min);
        }
        return min;
    }
    int top(){
        if (top==-1){
            System.out.println("Empty");
        }
        return nums.get(top);
    }
}
public class Implement_Min_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Min_Stack st = new Min_Stack();
        while (true){
            System.out.println("1.)Push");
            System.out.println("2.)Pop");
            System.out.println("3.)Top");
            System.out.println("4.)Get_Min");
            System.out.println("5.)Exit");
            System.out.println("Enter your option:- ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the element you wanna push:- ");
                    int x = sc.nextInt();
                    st.push(x);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.println(st.top());
                    break;
                case 4:
                    System.out.println(st.get_min());
                    break;
                case 5:
                    System.out.println("Exiting....\nExiting Successfully");
                    return;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        }
    }
}
