package algoexpert;

public class Linked_List_construction {
	public DoubleNode head;
	public DoubleNode tail;
	
	public void setHead(DoubleNode node) {
		if(node == null) {
			head = null;
			tail = null;
			return;
		}
		insertBefore(head,node);
	}
	
	public void setTail(DoubleNode node) {
		
	}
	
	public void insertBefore(DoubleNode n,DoubleNode nodeToInsert) {
		if(nodeToInsert == head && nodeToInsert == tail) {
			return;
		}
		remove(nodeToInsert);
		nodeToInsert.prev = n.prev;
		nodeToInsert.next = n;
		
		
	}
	
	public void insertAfter(DoubleNode n, DoubleNode nodeToInsert) {
		
	}
	
	public void insertAtPostions(int positiom,DoubleNode nodeToInsert) {
		
	}
	
	public void removeNodesWithValue(int value) {
	      // Write your code here.
	    }

    public void remove(DoubleNode node) {
	      // Write your code here.
	    }

   public boolean containsNodeWithValue(int value) {
	      // Write your code here.
	   return false;
	    }
	
	
	public static void main(String[] args) {
		
	}
	
	

}
