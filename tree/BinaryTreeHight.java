package main.tree;

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTreeHight {

	public static int height(Node root) {
		// Write your code here.
		if (root == null) {
			return 0;
		}
		int leftDepth = height(root.left);
		int rightDepth = height(root.right);
		return Math.max(leftDepth, rightDepth) + 1;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
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
		System.out.println("Total Number of Tree Nodes: " + t);
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			System.out.println("Insert a new child node with data: " + data);
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println("Tree Hight: " + height);
	}
}