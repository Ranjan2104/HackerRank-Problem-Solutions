    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if (head != null) {
            reversePrint(head.next);
            System.out.println(head.data); 
}

    } // Contributed by Amresh Ranjan.