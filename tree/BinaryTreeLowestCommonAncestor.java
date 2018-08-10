package main.tree;

import java.util.Scanner;

/**
 * You are given pointer to the root of the binary search tree and two values  and . 
 * You need to return the lowest common ancestor (LCA) of  and  in the binary search tree.
 * @author kevinzeng
 */
public class BinaryTreeLowestCommonAncestor {
	
	static class Node {
	    Node left;
	    Node right;
	    int data;
	    
	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
	
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
		if (root == null) {
			return null;
		}
		if (root.data == v1 || root.data == v2) {
			return root;
		}
		
		Node leftNode = lca(root.left, v1, v2);
		Node rightNode = lca(root.right, v1, v2);
		
		// if v1 and v2 lies both on the left or right, then LCA is either left or right (whichever is not null)
		// otherwise LCA is root
		if (leftNode != null && rightNode != null) {
			return root;
		}
		
		return (leftNode != null) ? leftNode : rightNode;
    }
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}
