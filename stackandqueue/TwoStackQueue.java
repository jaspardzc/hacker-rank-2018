package main.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Create a Queue using two stacks
 * 
 * @author kevinzeng
 */
public class TwoStackQueue {
	
	static class MyQueue<Integer> {
		
		private Stack<Integer> forwardStack;
		private Stack<Integer> backwardStack;
		
		public MyQueue() {
			this.forwardStack = new Stack<Integer>();
			this.backwardStack = new Stack<Integer>();
		}
		
		public void enqueue(Integer element) {
			this.forwardStack.push(element);
		}
		
		public void dequeue() {
			if (this.backwardStack.isEmpty()) {
				while(!this.forwardStack.isEmpty()){
					this.backwardStack.push(this.forwardStack.pop());
				}
			}
			this.backwardStack.pop();
		}
		
		public Integer peek() {
			if (this.backwardStack.isEmpty()) {
				while(!this.forwardStack.isEmpty()){
					this.backwardStack.push(this.forwardStack.pop());
				}
			}
			return this.backwardStack.peek();
		}
	}

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
