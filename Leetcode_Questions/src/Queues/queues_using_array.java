/*Implement Queue Using Array

Problem Statement: Implement Queue Data Structure using Array with all functions like pop, push, top, size, etc.

Example:

Input: push(4)
       push(14)
       push(24)
       push(34)
       top()
       size()
       pop()

Output:

The element pushed is 4
The element pushed is 14
The element pushed is 24
The element pushed is 34
The peek of the queue before deleting any element 4
The size of the queue before deletion 4
The first element to be deleted 4
The peek of the queue after deleting an element 14
The size of the queue after deleting an element 3
*/
package Queues;
import java.util.*;
class Queue {
    int front, rear;
    int[] nums;
    int current_Size;
    public Queue(int n) {
        this.front = -1;
        this.rear = -1;
        this.nums = new int[n];
        current_Size=0;
    }
    void push(int x,int n) {
        if (front == -1) {
            front++;
        }else if (current_Size==n) {
            System.out.println("Queue is full");
            return;
        }
            rear++;
            nums[rear] = x;
            current_Size++;
    }
    void pop(){
        if (front==-1){
            System.out.println("Queue is empty");
            return;
        }
        else if (front == rear){
            int x = nums[front];
            System.out.println("The popped element is:- "+x);
            front = rear =-1;
            current_Size--;
        }
        else{
            int x=nums[front];
            System.out.println("The popped element is:- "+x);
            front++;
            current_Size--;
        }
        return;
    }
    void display(){
        if (front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear ; i++) {
            System.out.println(nums[i]+" ");
        }
        return;
    }
    void size(){
        System.out.println("The size of the queue is:- "+current_Size);
        return;
    }
    void top(){
        if (front ==-1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("The topmost element is:- "+(nums[front]));
        return;
    }
}
public class queues_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int n = sc.nextInt();
        Queue queue = new Queue(n);
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
                    queue.push(x, n);
                    break;
                case 2:
                    queue.pop();
                    break;
                case 3:
                    queue.size();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    queue.top();
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
