package Stacks;
import java.util.*;
import java.util.Stack;

class Queue_Using_Stack {
    Stack<Integer> st_1 = new Stack<>();
    Stack<Integer> st_2 = new Stack<>();

    void push(int x) {
        System.out.println("The element pushed is:- "+x);
        st_1.push(x);
    }

    int pop() {
        if (st_2.isEmpty()){
            while (!st_1.isEmpty()){
                st_2.push(st_1.pop());
            }
        } if (!st_2.isEmpty()) {
            return st_2.pop();
        }
            System.out.println("Queue is empty");
            return -1;
    }
    int peek(){
        if (st_2.isEmpty()){
            while (!st_1.isEmpty()){
                st_2.push(st_1.pop());
            }
        }
        if (!st_2.isEmpty()) {
            return st_2.peek();
        }
        System.out.println("Queue is empty");
        return -1;
    }
    void display(){
        Stack<Integer>tempStack=new Stack<>();
            if (!st_2.isEmpty()){
                while (!st_2.isEmpty()){
                 tempStack.push(st_2.pop());
                }
            } if (!st_1.isEmpty()) {
            for (int i = st_1.size() - 1; i >= 0; i--) {
                tempStack.push(st_1.get(i));
            }
        }
                System.out.println(tempStack);
                while (!tempStack.isEmpty()){
                    st_2.push(tempStack.pop());
                }
            }
    int size(){
        return (st_1.size()+st_2.size());
    }
}
public class Implement_Queues_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_Using_Stack st = new Queue_Using_Stack();
        while (true){
            System.out.println("1.)Push");
            System.out.println("2.)Pop");
            System.out.println("3.)size");
            System.out.println("4.)top");
            System.out.println("5.)display");
            System.out.println("6.)Exit");
            System.out.println("Enter your option:- ");
            int option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the element you wanna push");
                    int x = sc.nextInt();
                    st.push(x);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.println("The size of the queue is:- "+st.size());
                    break;
                case 4:
                    System.out.println("The topmost element of the queue is:- "+st.peek());
                    break;
                case 5:
                    st.display();
                    break;
                case 6:
                    System.out.println("Exiting....\nExited Successfully.");
                    return;
                default:
                    System.out.println("Wrong option!!");
                    break;
            }
        }
    }
}
