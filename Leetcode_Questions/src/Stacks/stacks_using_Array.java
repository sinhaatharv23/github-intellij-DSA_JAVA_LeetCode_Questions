/*Implement Stack using Array
        Problem statement: Implement a stack using an array.
        Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.


        Explanation:

push(): Insert the element in the stack.

pop(): Remove and return the topmost element of the stack.

top(): Return the topmost element of the stack

size(): Return the number of remaining elements in the stack.

*/
package Stacks;
import java.util.*;
class Stack{
    int top;
    int[]stack;
    public Stack(int n) {
        this.top = -1;
        this.stack = new int[n];
    }
    void push(int x,int n){
        if (top==n-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top]=x;
        return;
    }
    int pop(){
        if (top==-1){
            return top;
        }
        int x = stack[top];
        top--;
        System.out.println("The popped element was:- "+x);
        return x;
    }
    void size(int n){
        System.out.println("The size is:- "+(top+1));
        return;
    }
    void display(int n){
        if (top==-1){
            System.out.println("Empty stack...");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        return;
    }
    void top(){
        System.out.println("The topmost element of the stack is:- "+stack[top]);
        return;
    }
}
public class stacks_using_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        while (true){
            System.out.println("1.)Push");
            System.out.println("2.)Pop");
            System.out.println("3.)size");
            System.out.println("4.)display");
            System.out.println("5.)peek");
            System.out.println("6.)Exit");
            int option;
            System.out.println("Select an option:- ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the number you wanna push:- ");
                    int x = sc.nextInt();
                    st.push(x, n);
                    break;
                case 2:
                st.pop();
                break;
                case 3:
                    st.size(n);
                    break;
                case 4:
                    st.display(n);
                    break;
                case 5:
                    st.top();
                    break;
                case 6:
                    System.out.println("Exiting...\nExited Successfully.");
                    return;
                default:
                    System.out.println("Incorrect option!!");
                    break;
            }
        }
    }
}
