import java.util.*;

public class Univaluedornot {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean univaluedornot(Node root) {
        if(root == null){
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return univaluedornot(root.left)&&univaluedornot(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(5);
        root.left.right = new Node(5);
        System.out.println(univaluedornot(root));
    }
}