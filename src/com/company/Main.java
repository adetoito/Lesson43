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

        System.out.print("OG contents of list: ");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            if (element.equals("C")) {
                System.out.print(element + " ");
            }
        }
    }
}
