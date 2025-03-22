package Binary_Tree;
import Binary_Tree.Node;
import java.util.*;
class Binary{
    Node root;
    public Node insert(Node root,int data){
        if (root==null){
            return new Node(data);
        }
        System.out.println("Insert "+data+" to the left(L/l) or to the right (R/r) of "+root.data+" ?");
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if (s=='L'||s=='l'){
            root.left=insert(root.left,data);
        } else if (s=='R'||s=='r') {
            root.right=insert(root.right,data);
        }else{
            System.out.println("wrong choice!!! Enter again");
        }
        return root;
    }
    public void inorder_Traversal(Node root){
        if (root!=null){
            inorder_Traversal(root.left);
            System.out.println(root.data);
            inorder_Traversal(root.right);
        }
    }
    public void preorder_Traversal(Node root){
        if (root!=null){
            System.out.println(root.data);
            inorder_Traversal(root.left);
            inorder_Traversal(root.right);
        }
    }
    public void postorder_Traversal(Node root){
        if (root!=null){
            inorder_Traversal(root.left);
            inorder_Traversal(root.right);
            System.out.println(root.data);
        }
    }
}
public class Intro_To_Binary_Tree {
    public static void main(String[] args) {
        Binary tree = new Binary();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Pick up one choice:- ");
            System.out.println("1.)Insert");
            System.out.println("2.)Traverse inorder");
            System.out.println("3.)Traverse preorder");
            System.out.println("4.)Traverse postorder");
            System.out.println("5.)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:- ");
                    int data = sc.nextInt();
                    tree.root=tree.insert(tree.root,data);
                    break;
                case 2:
                    if (tree.root==null){
                        System.out.println("Tree is empty");
                    }else {
                        tree.inorder_Traversal(tree.root);
                    }
                    break;
                case 3:
                    if (tree.root==null){
                        System.out.println("Tree is empty");
                    }else {
                        tree.preorder_Traversal(tree.root);
                    }
                    break;
                case 4:
                    if (tree.root==null){
                        System.out.println("Tree is empty");
                    }else {
                        tree.postorder_Traversal(tree.root);
                    }
                    break;
                case 5:
                    System.out.println("Exiting....\n Exited sucdessfully");
                    return;
                default:
                    System.out.println("Invalid!!! Try again");
            }
        }
    }
}