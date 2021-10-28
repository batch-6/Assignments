import java.io.*;
import java.util.*;
public class Main {

    public static class Node
    {
        int val;
        Node next;
    }
    public static class LinkedList {
        Node head;
        int size;
        public void insert(int x){
            size++;
            Node n = new Node();
            n.val = x;
            n.next = null;
            if(head == null){
                head = n;
                return;
            }
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = n;
            return;
        }
        public void print(Node head1){
            Node temp = head1;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public Node merge(Node head1, Node head2)
        {
            if(head1==null && head2==null)
            {
                return null;
            }
            if(head1==null)
            {
                return head2;
            }
            if(head2==null)
            {
                return head1;
            }

            if(head1.val <= head2.val)
            {
                head1.next = merge(head1.next, head2);
                return head1;
            }

            head2.next = merge(head1, head2.next);
            return head2;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            ll1.insert(x);
        }

        int m = in.nextInt();
        for(int i=0;i<m;i++)
        {
            int x = in.nextInt();
            ll2.insert(x);
        }

        Node ans = ll1.merge(ll1.head, ll2.head);
        ll1.print(ans);
    }
}
