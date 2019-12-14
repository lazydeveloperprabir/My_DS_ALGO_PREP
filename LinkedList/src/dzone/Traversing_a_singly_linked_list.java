/**
 * 
 */
package dzone;

/**
 * @author prabirpadhy
 * Traverse a single linked list & return the length of the linked list
 *
 */


public class Traversing_a_singly_linked_list {

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
		n3.next = n4;
		n4.data = 4;
		n4.next = n5;
		n5.data = 5;
		n5.next = null;
		
		Node head = n1;
		
		System.out.println(findLengthOfLinkedList(head));
		
		

	}
	
	private static int findLengthOfLinkedList(Node head) {
		int count =0;
		Node ptr =head;
	
		if(head == null) {
			return count;
		}
		
		while(ptr != null) {
			ptr = ptr.next;
			count+=1;
		}
		return count;
	}

}
