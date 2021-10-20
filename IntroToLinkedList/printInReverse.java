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
        public void reverse()
        {
            Node pre = null;
            Node temp = head;
            while(temp!=null)
            {
                Node next = temp.next;
                temp.next = pre;
                pre = temp;
                temp = next;
            }
            head = pre;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        LinkedList ll = new LinkedList();

        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            ll.insert(x);
        }

        ll.reverse();
        ll.print();
    }
}