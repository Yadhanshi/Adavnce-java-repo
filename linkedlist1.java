import java.util.*;

public class linkedlist1 {
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


 
 
    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("list");
        list.printlist();

                list.addFirst("this");
        list.printlist();

    }
}
