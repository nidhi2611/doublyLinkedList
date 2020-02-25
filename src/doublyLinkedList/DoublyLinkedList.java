package doublyLinkedList;
import node.Node;
public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            if (temp.getNext() != null) {
                temp = temp.getNext();
            }
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void insertAtBegin(int daata) {
        Node node = new Node(daata);
        if (head == null) {
            node.setNext(head);
            head = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }

    }

    public Node deleteFRomBegin() {
        Node response = null;
        if (head != null) {
            response = head;
            head = head.getNext();
            head.setPrevious(null);
        }
        return response;
    }

    public Node deleteFromLast() {
        Node response = null;
        if (head != null) {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            if (temp.getPrevious() != null) {
                response = temp;
                temp = temp.getPrevious();
                temp.setNext(null);
            } else {
                response = head;
                head = null;
            }
        }
        return response;
    }
}
