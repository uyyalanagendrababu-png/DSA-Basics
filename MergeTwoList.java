import java.util.*;

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val= val;
		this.next = null;
	}
}


public class MergeTwoList {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next= list1;
        }
        else{
            current.next = list2;
        }

        return dummy.next;

    }
	
	public static void printList(ListNode List) {
		ListNode temp = List;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp= temp.next;
		}
		System.out.println( );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of nodes to insert:");
		int n = sc.nextInt();
		
		System.out.println("enter the Nodes to insert in head 1: ");
		ListNode head1 = null, tail1 = null;
		
		for(int i =0; i<n; i++) {
			int val = sc.nextInt();
			 ListNode node = new ListNode(val);
			 
			 if(head1 == null) {
				 head1 = node;
				 tail1 = node;
			 }
			 
			 else {
				 tail1.next = node; 
				 tail1 = node;
			 }
		}
		
		System.out.println("enter the Nodes to insert in head 2: ");
		ListNode head2 = null, tail2 = null;
		
		for(int i =0; i<n; i++) {
			int val = sc.nextInt();
			
			ListNode node = new ListNode(val);
			
			if(head2 == null) {
				head2 = node;
				tail2 = node;
			}
			else {
				tail2.next = node;
				tail2 = node;
			}
		}
		
		MergeTwoList obj = new MergeTwoList();
		ListNode mergedList = obj.mergeTwoLists(head1,head2);
		
		System.out.println("merged List are:");
		printList(mergedList);
		
		
	}

}
