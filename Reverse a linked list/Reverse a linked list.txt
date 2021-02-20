    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    if (head == null || head.next == null) return head;
    SinglyLinkedListNode remaing = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return remaing;
    } // Contributed by Amresh Ranjan.