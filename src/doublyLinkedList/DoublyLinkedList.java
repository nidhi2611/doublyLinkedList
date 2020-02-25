package doublyLinkedList;
import node.Node;
public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList(Node h) {
        head = h;
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

}
