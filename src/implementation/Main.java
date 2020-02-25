package implementation;

import doublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtEnd(20);
        doublyLinkedList.insertAtEnd(30);
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtEnd(50);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtBegin(10);
        doublyLinkedList.insertAtBegin(0);
        doublyLinkedList.traverse();
        doublyLinkedList.deleteFRomBegin();
        doublyLinkedList.deleteFromLast();
        doublyLinkedList.traverse();
    }
}
