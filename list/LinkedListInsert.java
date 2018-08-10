package main.list;

/**
 * Insert a new node with data at a specific position in a linked list
 * 
 * @author kevinzeng
 */
public class LinkedListInsert {
	
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    	
    	if (head == null) {
    		head = new SinglyLinkedListNode(data);
    		return head;
    	}
    	if (position < 0) {
    		return null;
    	}
    	if (position == 0) {
    		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    		newNode.next = head;
    		return newNode;
    	}
    	SinglyLinkedListNode frontNodeTracker = head;
    	while(frontNodeTracker.next != null && position > 1) {
    		frontNodeTracker = frontNodeTracker.next;
    		position--;
    	}
    	SinglyLinkedListNode originNextNode = frontNodeTracker.next;
    	SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    	frontNodeTracker.next = newNode;
    	newNode.next = originNextNode;
    	return head;
    }
}
