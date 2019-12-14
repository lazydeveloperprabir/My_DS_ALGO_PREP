/**
 * 
 */
package dzone;

/**
 * @author prabirpadhy
 *
 */


public class Find_middle_element {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		n1.data = 1;
		n1.next = n2;
		n2.data = 2;
		n2.next = n3;
		n3.data = 3;
		n3.next =n4;
		n4.data = 4;
		n4.next = n5;
		n5.data = 5;
		n5.next = null;
		Node head = n1;
		int length = lengthOfLinkedlist(head);
		int middleIndex = 0;
		
		if(length%2 == 0) {
			middleIndex = length/2;
		}else {
			middleIndex = (length/2)+1;
		}
	
		int middleElement = getSinglyLinkedListNodeAtIndex(head,middleIndex);
		
		System.out.println(middleElement);
	}
	
	
	private static int lengthOfLinkedlist(Node head) {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		Node ptr = head;
		while(ptr != null) {
			ptr = ptr.next;
			count++;
		}
		return count;
	}
	
	private static int getSinglyLinkedListNodeAtIndex(Node head, int index) {
		if(head == null) {
			return 0;
		}
		Node ptr = head;

		
		for(int i =1;i<index;i++) {
			ptr = ptr.next;
		}
		
		return ptr.data;
	}

}
