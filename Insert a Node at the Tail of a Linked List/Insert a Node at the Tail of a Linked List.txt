    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        if(head == null) {
            return insertNode;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next  = insertNode;
        insertNode.next = null;

        return head;

    } // Contributed by Amresh Ranjan.