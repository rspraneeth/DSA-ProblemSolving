package Trees;

public class BinaryTree {
    Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        Node node = new Node(8);
        if (root==null) root = node;
        else if (data < root.data) root.left = insertRec(root.left, data);
        else root.right = insertRec(root.right, data);
        return root;
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
