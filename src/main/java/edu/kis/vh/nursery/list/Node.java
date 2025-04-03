package edu.kis.vh.nursery.list;

public class Node {
    private final int value;
    private Node prev;
    private Node next;

    /**
     * Constructor for Node class
     * @param i
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Returns value from node
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns previous node
     * @return
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Assigns previous node
     * @param prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Returns next node
     * @return
     */
    public Node getNext() {
        return next;
    }

    /**
     * Assigns next node
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
