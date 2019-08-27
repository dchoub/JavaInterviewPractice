package dummy;

import dummy.MergeTwoLinkList.Node;

public class PracticeLinkedList {
	
	static class Node{
		int data;
		Node next;
	}
	
	
	static Node newNode(int key) {
		Node temp = new Node();
		temp.data= key;
		temp.next = null;
		return temp;
		
	}
	
	
	static Node merge(Node h1, Node h2) {
		if(h1==null) return h2;
		if(h2==null) return h1;
		
		if(h1.data<h2.data) {
			return mergeUtility(h1,h2);
		
		}
		else {
			return mergeUtility(h2,h1);
		}
			
		
	}
	
	
	
	static Node mergeUtility(Node h1,Node h2) {
		//if just one node in first list
		//then point its head to secodn list
		if(h1.next==null) {
			h1.next = h2;
					return h2;
		}
		
		//current and next pointer for both the list
		
		Node curr1= h1;
		Node curr2= h2;
		Node next1= h1.next;
		Node next2= h2.next;
		
		while(next1 !=null && next2 !=null) {
			//if h2 is in between of h1's current and next then curr1 curr2 next1
			
			if((curr2.data) > (curr1.data) && (curr2.data) < (next1.data)) {
				next2= curr2.next;
				curr1.next= curr2;
				curr2.next=next1;
				
				
				//chnage the current pointer
				curr1=curr2;
				curr2=next2;
				
			}
			else {
				//if more nodes
				if (next1.next != null) { 
					next1 = next1.next; 
					curr1 = curr1.next; 
				}
				// else point the last node of first list 
				// to the remaining nodes of second list 
				else { 
					next1.next = curr2; 
					return h1; 
				} 
			}
			
		}
		return h1;
		
		
		
	}
	
	static void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create two linked list
		Node head1 = newNode(1); 
		head1.next = newNode(3); 
		head1.next.next = newNode(5); 

		// 1->3->5 LinkedList created 

		Node head2 = newNode(0); 
		head2.next = newNode(2); 
		head2.next.next = newNode(4); 

		// 0->2->4 LinkedList created 
		Node mergedhead = merge(head1, head2); 

		printList(mergedhead); 


	}

}
