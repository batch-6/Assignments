import java.io.*;
import java.util.*;
public class Main {
    static class Node
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
        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int func(LinkedList second)
        {
            Node temp1 = head;
            Node temp2 = second.head;
            while(temp1!=null && temp2!=null)
            {
                if(temp1.val!=temp2.val)
                {
                    return 0;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            if(temp1==null && temp2==null)
            {
                return 1;
            }
            return 0;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            ll1.insert(x);
        }

        for(int i=0;i<m;i++)
        {
            int x = in.nextInt();
            ll2.insert(x);
        }

        int ans = ll1.func(ll2);
        System.out.println(ans);
    }
}