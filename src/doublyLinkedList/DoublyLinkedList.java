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
}
