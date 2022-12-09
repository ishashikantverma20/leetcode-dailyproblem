public class Test_03 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node8 = new ListNode(8);

        node1.setNext(node2) ;
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        ListNode head = node1;

        ListNode res = oddEvenList(new ListNode());

        while (res != null) {
            System.out.println("res " + res.val);
            res = res.next;
        }

    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode oddList = null;

        ListNode evenList = null;

        int count = 1;

        //oddList = new ListNode();

        while(head != null) {

            if(count % 2 == 1) {
                oddList = insert(oddList, head.val);
            } else {
                evenList = insert(evenList, head.val);
            }

            head = head.next;
            count++;
        }

        ListNode ptr = oddList;
        while(ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = evenList;

        return oddList;
    }

    public static ListNode insert(ListNode root, int data) {

        if (root == null) {
            root = new ListNode(data);
        } else {
            ListNode ptr = root;

            while(ptr.next != null) {
                ptr = ptr.next;
            }

            ptr.next = new ListNode(data);
        }

        return root;
    }

}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public int getVal() {
         return val;
     }

     public void setVal(int val) {
         this.val = val;
     }

     public ListNode getNext() {
         return next;
     }

     public void setNext(ListNode next) {
         this.next = next;
     }
 }
