package com.company;

public class Main {

    public static void main(String[] args) {
	LinkedIntList list = new LinkedIntList();
        System.out.println(list);
        list.cons(12);
        list.cons(20);
        list.cons(36);
        list.cons(45);
        list.cons(55);
        list.cons(43);

        System.out.println(list);
        System.out.println(list.getTail());
        System.out.println(list.getTail().length());


    }
}
