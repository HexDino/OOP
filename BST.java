import java.util.*;

public class BST {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class BST {
        Node root;

        BST() {
            root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key == root.key) {
                return root;
            }

            if (key < root.key) {
                root.left = insertRec(root.left, key);
            } else {
                root.right = insertRec(root.right, key);
            }

            return root;
        }

        void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.key + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("#")) {
                break;
            }

            String[] parts = line.split(" ");
            if (parts[0].equals("insert")) {
                int key = Integer.parseInt(parts[1]);
                tree.insert(key);
            }
        }

        tree.preorderTraversal(tree.root);
        scanner.close();
    }
}