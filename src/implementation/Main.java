package implementation;

import doublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtEnd(20);
        doublyLinkedList.insertAtEnd(30);
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.insertAtEnd(50);
        doublyLinkedList.insertAtEnd(60);
        doublyLinkedList.insertAtEnd(70);
        doublyLinkedList.traverse();
    }
}
