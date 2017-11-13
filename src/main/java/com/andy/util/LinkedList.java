package com.andy.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by tale (anhlt) on 14/11/2017.
 */
public class LinkedList<T> implements Iterable<T> {
    protected Node<T> head;

    public LinkedList() {
        //Do nothing
    }


    public void append(T value) {
        Node<T> newNode = createNode(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> node = head;
            while (node.getNext() != null)
                node = node.getNext();
            node.setNext(newNode);
        }
    }

    public void removeLast() {
        Node<T> node = head;
        Node<T> prevNode;
        if (head != null) {
            if (head.getNext() == null) {
                head = null;
            } else {
                prevNode = node;
                while (node != null && node.getNext() != null) {
                    prevNode = node;
                    node = node.getNext();
                }
                prevNode.setNext(null);
            }
        }
    }

    public List<T> toList(){
        List<T> list = new ArrayList<>();
        Node<T> node = head;
        while (node != null) {
            list.add(node.getValue());
            node = node.getNext();
        }
        return list;
    }

    protected void removeNode(Node target) {
        Node<T> node = findPrevNode(target);
        if (node == null) {
            head = null;
        } else {
            node.setNext(target != null ? target.getNext() : null);
            if (target != null)
                target.setNext(null);
        }
    }

    protected Node<T> findPrevNode(Node target) {
        Node<T> node = head;
        while (node != null && node.getNext() != target) {
            node = node.getNext();
        }
        return node;
    }

    private Node<T> createNode(T value) {
        return new Node<T>(value);
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }


    class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        public boolean hasNext() {
            if (current != null) {
                return true;
            } else {
                return false;
            }
        }


        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node<T> node = current;
            current = current.getNext();
            return node.getValue();
        }
    }
}
