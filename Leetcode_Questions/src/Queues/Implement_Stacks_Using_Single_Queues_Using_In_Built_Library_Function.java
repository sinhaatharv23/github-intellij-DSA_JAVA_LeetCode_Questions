/*Implement Stack using single Queue


Problem Statement: Implement a Stack using a single Queue.

Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.

Note: Queue is a data structure that follows the First In First Out (FIFO) rule.*/
package Queues;
import java.util.*;
import java.util.Queue;

class Stacks_Using_Queues{
Queue<Integer>queue= new java.util.LinkedList<>();//Built-in Library function created
void push(int x){
    queue.add(x);//here add means push in build-in library function
    for (int i = 0; i < queue.size()-1; i++) {
        queue.add(queue.remove());//here remove meaning pop in built-in library function
    }
}
void pop(){
    System.out.println("The popped element is:- "+queue.remove());
}
void size(){
    System.out.println("The size of the queue is:- "+queue.size());
}
void top(){
    System.out.println("The topmost element is:- "+queue.peek());
}
void display(){
    System.out.println(queue);
    /*   Why ??cant we do like this :-
    for (int i = 0; i < queue.size(); i++) {
         System.out.println(queue);
    }
ChatGPT said:
You can't directly use System.out.println(queue) inside a loop in this context because:

Redundant Iteration:

Using queue.size() inside the loop implies that you're iterating queue.size() times.
Each iteration will simply print the entire queue, not individual elements.
Unnecessary Repetition:

The queue is already a collection, and printing it directly once (e.g., System.out.println(queue)) would display all its elements as a single string in a standard queue format (e.g., [element1, element2, element3]).
Repeating this queue.size() times would just print the same output multiple times, which is inefficient and not the desired behavior.
Correct Use Case for System.out.println(queue):
If you want to print all elements of the queue at once, you can directly call:

void display() {
    System.out.println("The elements in the stack are: " + queue);
}
This approach works because Java's Queue has an overridden toString() method that displays its contents as a list. No iteration is needed.

*/
}
}
public class Implement_Stacks_Using_Single_Queues_Using_In_Built_Library_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks_Using_Queues stq = new Stacks_Using_Queues();
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
                    stq.push(x);
                    break;
                case 2:
                    stq.pop();
                    break;
                case 3:
                    stq.size();
                    break;
                case 4:
                    stq.top();
                    break;
                case 5:
                    stq.display();
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