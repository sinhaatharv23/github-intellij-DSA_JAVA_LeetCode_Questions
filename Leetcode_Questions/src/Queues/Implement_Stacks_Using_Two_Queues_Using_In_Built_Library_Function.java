/*Implement Stack using single Queue


Problem Statement: Implement a Stack using a two Queue.

Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.

Note: Queue is a data structure that follows the First In First Out (FIFO) rule.*/
package Queues;
import java.util.*;
import java.util.Queue;

class Stack_Using_Two_Queues{
    Queue<Integer>queue_1=new java.util.LinkedList<>();
    Queue<Integer>queue_2=new java.util.LinkedList<>();
    void push(int x){
        while (!queue_1.isEmpty())//loop until queue_1 is not empty
        {
            queue_2.add(queue_1.remove());
        }
        queue_1.add(x);
        while (!queue_2.isEmpty()){
            queue_1.add(queue_2.remove());
        }
    }
    void pop(){
        System.out.println("The popped element is:- "+queue_1.remove());
    }
    void top(){
        System.out.println("The topmost element is:- "+queue_1.peek());
    }
    void display(){
        System.out.println(queue_1);
    }
    void size(){
        System.out.println("The size of the queue is:- "+queue_1.size());
    }
}
public class Implement_Stacks_Using_Two_Queues_Using_In_Built_Library_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_Using_Two_Queues stq_2 = new Stack_Using_Two_Queues();
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
                    stq_2.push(x);
                    break;
                case 2:
                    stq_2.pop();
                    break;
                case 3:
                    stq_2.size();
                    break;
                case 4:
                    stq_2.top();
                    break;
                case 5:
                    stq_2.display();
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


/*1.)In a queue data structure, "offer" is generally considered a safer option compared to "add" because "offer"
returns a boolean value indicating whether the element was successfully added to the queue (returning false if the
queue is full), while "add" throws an exception if the queue is full when trying to add an element, making it more
suitable for handling potential capacity limitations in a bounded queue.
2.)In a queue data structure, "poll" and "remove" both retrieve and remove the element at the front of the queue,
but the key difference is that "poll" returns null if the queue is empty, while "remove" throws an exception
(like NoSuchElementException) in the same situation; essentially, "poll" is considered a safer option when dealing
 with potentially empty queues.
*/