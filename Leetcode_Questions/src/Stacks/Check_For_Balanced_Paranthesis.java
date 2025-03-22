package Stacks;
import java.util.*;
class paranthesis{
    int top =-1;
    char [] arr;
    int n;
    public paranthesis(int n){
        arr = new char[n];
        this.n=n;
    }
    void push(char x){
        if (top==n-1){
            System.out.println("Full");
        }else{
            top++;
            arr[top]=x;
        }
    }
    char pop(){
        if (top==-1){
            return '\0';
        }else{
            return arr[top--];
        }
    }
    boolean isBalanced(String x){
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch=='('||ch=='['||ch=='{'){
                push(ch);
            } else if (ch==')'||ch==']'||ch=='}') {
                if (top==-1){
                    return false;
                }
                char popped = pop();
                if (popped=='\0'||!isMatching(popped,ch)){
                    return false;
                }
            }
        }
        return top==-1;
    }
    boolean isMatching(char open,char close){
        return(open=='('&&close==')')||(open=='['&&close==']')||(open=='{'&&close=='}');
    }
    }
public class Check_For_Balanced_Paranthesis {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String nums = sc.next();
        paranthesis pt = new paranthesis(nums.length());
        if (pt.isBalanced(nums)){
            System.out.println("Paranthesis is balanced");
        }else{
            System.out.println("Paranthesis is not balanced");
        }
    }
    }
