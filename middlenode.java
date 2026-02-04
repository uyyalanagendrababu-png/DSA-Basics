class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class middlenode {
    public ListNode middleNode(ListNode head) {
        if(head == null && head.next == null){
            return head;
        }
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        middlenode sol = new middlenode();
        ListNode res = (sol.middleNode(head));

        while(res != null) {
        	System.out.print(res.val+", ");
        	res = res.next;
        }
    }
}