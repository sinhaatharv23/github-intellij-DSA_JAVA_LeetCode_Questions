package Queues;
import java.util.*;
class LinkedList{
    LinkedList f = null;
    LinkedList r = null;
    LinkedList next;
    int data;
    void push(int x){
        LinkedList newNode = new LinkedList();
        newNode.data=x;
        newNode.next=null;
        if (f==null){
            f=r=newNode;
        }else{
            r.next=newNode;
            r=newNode;
        }
    }
    int pop(){
        int popped = -1;
        if (f==r){
            popped = f.data;
            f=r=null;
        }else{
            popped = f.data;
            f=f.next;
        }
        return popped;
    }
    int peek(){
        if (f!=null){
            System.out.println(f.data);
        }
        return -1;
    }
    void display(){
        LinkedList temp = f;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
public class Queue_Using_LinkedList {
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
