//Given an integer i. Print the maximum number of nodes on level i of a binary tree.
//
//        Example 1:
//
//        Input: 5
//        Output: 16
//        Example 2:
//
//        Input: 1
//        Output: 1
package Binary_Tree;
import java.util.*;
public class Maximum_Number_Of_Nodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the levels:- ");
        int i = sc.nextInt();
        System.out.println("The maximum number of nodes on level "+i+" is:- "+Math.pow(2.0,(double)i-1));
    }
}
