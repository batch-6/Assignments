static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode h1 = head1;
    SinglyLinkedListNode h2 = head2;

    while(h1!=null && h2!=null)
    {
        if(h1.next==null)
        {
            h1 = head2;
        }
        else
        {
            h1 = h1.next;
        }

        if(h2.next==null)
        {
            h2 = head1;
        }
        else
        {
            h2 = h2.next;
        }

        if(h1==h2)
        {
            return h1;
        }
    }

    return null;
}