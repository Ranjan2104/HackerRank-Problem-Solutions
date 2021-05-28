    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    } // Contributed by Amresh Ranjan.

