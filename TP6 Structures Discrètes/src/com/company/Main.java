package com.company;

import static com.company.TryList.*;

public class Main {

    public static void main(String[] args) {
	LinkedIntList list = new LinkedIntList();
        list.cons(12);
        list.cons(20);
        list.cons(36);
        list.cons(45);
        list.cons(55);

        printIntList(list);
        list.add(3,5);
        printIntList(list);
        System.out.println(list.size);







    }
}
