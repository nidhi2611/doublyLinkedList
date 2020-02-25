package node;

public class Node {
    private int data;
    private Node next;
    private Node previous;

    public Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

}
