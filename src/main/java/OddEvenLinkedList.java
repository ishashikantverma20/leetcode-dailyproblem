
/**
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 *
 * The first node is considered odd, and the second node is even, and so on.
 *
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 *
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [1,3,5,2,4]
 *
 * Example 2:
 * Input: head = [2,1,3,5,6,4,7]
 * Output: [2,3,6,7,1,5,4]
 */
public  class OddEvenLinkedList {

    public  void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
       

        node1.setNext(node2) ;
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        ListNode head = node1;

        ListNode res = oddEvenList(head);

        while (res != null) {
            System.out.println("res " + res.val);
            res = res.next;
        }

    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode oddList = null;

        ListNode evenList = null;

        int count = 1;

       if (head == null) {
           return null;
       }

        while(head != null) {

            if(count % 2 == 1) {
                oddList = insert(oddList, head.val);
            } else {
                evenList = insert(evenList, head.val);
            }

            head = head.next;
            count++;
        }

        // will iterate till oddlist end
        ListNode ptr = oddList;
        while(ptr.next != null) {
            ptr = ptr.next;
        }

        // append evenlist in the end of oddlist
        ptr.next = evenList;

        return oddList;
    }

    // this method will insert element is last of list
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
