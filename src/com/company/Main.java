package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("OG contents of list: \n");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        // Print out list backwards.

        ListIterator litr = al.listIterator(al.size());
        System.out.println("" + "\n");
        System.out.println("Next List:");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
    }
}
