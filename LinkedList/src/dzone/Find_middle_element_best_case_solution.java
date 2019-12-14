package dzone;

public class Find_middle_element_best_case_solution {

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
		System.out.println(findMiddleNodeElement(head));
	}
	
	private static int findMiddleNodeElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next !=null) {
			fast = fast.next.next; 
			slow =  slow.next;
		}
		return slow.data;
	}

}
