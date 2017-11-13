package com.andy.util;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by tale (anhlt) on 14/11/2017.
 */
public class Test {


    @org.junit.Test
    public void test1() {
        IntegerLinkedList list = new IntegerLinkedList();

        list.append(2);
        list.append(20);
        list.append(82);
        list.append(7);
        list.append(22);

        list.removeLast();
        list.removeLast();

        list.append(20);
        list.append(-1);
        list.append(0);

        list.removeNodeGt(1);

        Assert.assertArrayEquals(new Integer[]{-1, 0}, list.toList().toArray(new Integer[0]));

    }

    @org.junit.Test
    public void testIterator() {
        IntegerLinkedList list = new IntegerLinkedList();

        list.append(2);
        list.append(20);
        list.append(82);
        list.append(7);
        list.append(22);

        List<Integer> data = new ArrayList<>();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            data.add(it.next());
        }

        Assert.assertArrayEquals(data.toArray(new Integer[0]), list.toList().toArray(new Integer[0]));

    }
}
