import java.util.*;
public class linkedlist2 {
 Node head;

    class Node{
    String data;
    Node next;

    Node(String data)
    {
        this.data =data;
        this.next = null;

    }
 }
 //add first and last
 public void addFirst(String data)
 {
    Node newNode = new Node(data);
    if(head == null)
    {
        head = newNode;
        return;

    }
    newNode.next = head;
    head = newNode;
 }

 public void addLast(String data)
 {
     Node newNode = new Node(data);
    if(head == null)
    {
        head = newNode;
        return;

    }
    Node currNode =head;
    while(currNode.next != null)
    {
        currNode = currNode.next;
    }
    currNode.next = newNode;
 }
//print

public void printlist()
{
    if(head == null)
    {
        System.out.println("list is empty");
        return;
    }

    Node currNode = head;
     while(currNode.next != null)
    {
        System.out.print(currNode.data+ " -> ");
        currNode = currNode.next;
    }
System.out.println("NULL");
}


int size;

    public int getSize(){
        return size;
    }

    public void reverseIterator(){

        if(head == null || head.next == null)
        {return;

        }
        Node preNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = preNode;
        
            //update;
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
    head = preNode;
    }

    public Node reverseRecursive(Node head)
    {
        if(head == null|| head.next==null)
        {
            return head;

        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        linkedlist2 list = new linkedlist2();
        list.addLast("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printlist();
        list.head =list.reverseRecursive(list.head);
        list.printlist();
    }
}
