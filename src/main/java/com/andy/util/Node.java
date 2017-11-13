package com.andy.util;

/**
 * Created by tale (anhlt) on 14/11/2017.
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T v){
        value = v;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
