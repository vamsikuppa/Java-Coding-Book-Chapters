package coding.challenge;
 
import java.util.Random;

public final class SinglyLinkedList {

    private final class Node {

        private int data;
        private Node next;

        @Override
        public String toString() {
            return " " + data + " ";
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int data) {

        Node newNode = new Node();

        newNode.data = data;
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        size++;
    }

    //Iterative
    public void reverse() {

        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr!=null) {
           next = curr.next; //Save next node
            curr.next=prev; // reverse
            prev=curr; //save current node
            System.out.println(curr.data + "<-");
            curr=next; //move to next node
        }

    }
    public void print() {

        System.out.println("\nHead (" + head + ") ----------> Last (" + tail + "):");

        Node currentNode = head;
        for (int i = 0; i < size; i++) {

            System.out.print(currentNode);
            currentNode = currentNode.next;
        }

        System.out.println();
    }
}
