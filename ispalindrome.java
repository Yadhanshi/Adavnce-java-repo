class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ispalindrome {

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head)
    {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;

    }
    public boolean solution(ListNode head)
    {
        if(head == null ||head.next == null)
        {
            return true;
        
        }
 ListNode middle = findMiddle(head);
 ListNode secondhalf = reverse(middle.next);

 ListNode firsthalf = head;
 while(secondhalf != null)
 {
    if(firsthalf.val != secondhalf.val){
        return false;
    }

    firsthalf = firsthalf.next;
    secondhalf = secondhalf.next;
 }
 return true;

 
 
    }
    public static void main(String[] args) {
    ispalindrome  obj = new ispalindrome();

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    System.out.println(obj.solution(head));
}

}
