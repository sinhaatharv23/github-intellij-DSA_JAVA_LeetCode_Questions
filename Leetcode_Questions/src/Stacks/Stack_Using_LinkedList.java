package Stacks;
import java.util.*;
class LinkedList{
    int data;
    LinkedList next;
    LinkedList top = null;
    void push(int data){
        LinkedList newNode = new LinkedList();
        newNode.data=data;
        newNode.next=top;
        top = newNode;
    }
    int pop(){
        if (top!=null){
            System.out.println(top.data);
            top=top.next;
        }
        return -1;
    }
    int peek(){
        if (top!=null){
            System.out.println(top.data);
        }
        return -1;
    }
    void display(){
        LinkedList temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Stack_Using_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true){
            while (true){
                System.out.println("1.)Push");
                System.out.println("2.)Pop");
                System.out.println("3.)top");
                System.out.println("4.)display");
                System.out.println("5.)Exit");
                System.out.println("Enter your option:- ");
                int option= sc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Enter the element you wanna push");
                        int x = sc.nextInt();
                        list.push(x);
                        break;
                    case 2:
                        list.pop();
                        break;
                    case 3:
                        list.peek();
                        break;
                    case 4:
                        list.display();
                        break;
                    case 5:
                        System.out.println("Exiting....\nExited Successfully.");
                        return;
                    default:
                        System.out.println("Wrong option!!");
                        break;
                }
            }
        }
    }
}