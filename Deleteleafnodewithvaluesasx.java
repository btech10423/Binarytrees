import java.util.*;

public class Deleteleafnodewithvaluesasx {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public static Node deleteleaves(Node root, int x){
    if(root==null){
        return null;
    }
    root.left=deleteleaves(root.left,x);
    root.right=deleteleaves(root.right,x);
    if(root.data==x && root.left==null && root.right==null){
        return null;
    }
    return root;
}
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        deleteleaves(root,3);
        System.out.println("inorder after traversal");
        inorder(root);
    }
}