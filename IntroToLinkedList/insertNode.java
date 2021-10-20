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
        public void insertNode(int val,int pos)
        {
            if(pos==0)
            {
                Node x = new Node(); // new node
                x.val = val;
                x.next = head; // new node next --> previous head
                head = x; // head --> new node
                return;
            }
            Node pre = head;
            pos--;
            while(pre!=null && pos>0)
            {
                pre = pre.next;
                pos--;
            }

            Node cur = pre.next;
            Node x = new Node();
            x.val = val;
            pre.next = x;
            x.next = cur;
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

        int val = in.nextInt();
        int pos = in.nextInt();

        ll.insertNode(val, pos);
        ll.print();
    }
}