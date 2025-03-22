package Binary_Tree;
import java.util.*;
import Binary_Tree.Node.*;
 class Balanced{
     Node root;
     public Node insert(Node root,int data,Scanner sc){
         if (root==null){
             return new Node(data);
         }
         System.out.println("Enter L/l for left insertion or R/r for right insertion of data "+data+" for "+root.data);
         char ch = sc.next().charAt(0);
         if (ch=='L'||ch=='l'){
             root.left=insert(root.left,data,sc);
         } else if (ch=='R'||ch=='r') {
             root.right=insert(root.right,data,sc);
         }else{
             System.out.println("Wrong choice!!!");
         }
         return root;
     }
     public boolean balanced(Node root){
         if (root == null) return true;
         int height_Left=subtree(root.left);
         int height_Right=subtree(root.right);
         int diff = Math.abs(height_Left-height_Right);
         if (diff<=1&&balanced(root.left)&&balanced(root.right)){
             return true;
         }
         return false;
     }
     public int subtree(Node root){
         if (root == null){
             return 0;
         }
         int left_height=subtree(root.left);
         int right_height=subtree(root.right);
         return 1+Math.max(left_height,right_height);
     }
 }
public class Balanced_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Balanced b = new Balanced();
        while (true) {
            System.out.println("Pick up one choice:- ");
            System.out.println("1.)Insert");
            System.out.println("2.)Balanced");
            System.out.println("3.)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:- ");
                    int data = sc.nextInt();
                    b.root = b.insert(b.root, data, sc);
                    break;
                case 2:
                    System.out.println(b.balanced(b.root));
                    break;
                case 3:
                    System.out.println("Exiting....\nExited sucessfully");
                    return;
                default:
                    System.out.println("Invalid!!! Try again");
            }
        }
    }
}