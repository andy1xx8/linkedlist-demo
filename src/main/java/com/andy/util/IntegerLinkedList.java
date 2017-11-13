package com.andy.util;


/**
 * Created by tale (anhlt) on 14/11/2017.
 */
public class IntegerLinkedList extends LinkedList<Integer> {

    protected void removeNodeGt(int value) {
        Node<Integer> node = head;
        Node<Integer> prevNode = null;
        while (node != null) {
            if (node.getValue() > value) {
                Node<Integer> next = node.getNext();
                if (prevNode == null) {
                    node.setNext(null);
                    head = node = next;
                } else {
                    prevNode.setNext(next);
                    node.setNext(null);
                    node = next;
                }
            } else {
                prevNode = node;
                node = node.getNext();
            }
        }
    }
}
