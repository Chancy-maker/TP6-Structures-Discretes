package com.company;

import static com.company.TryList.sum;

public class Main {

    public static void main(String[] args) {
	LinkedIntList list = new LinkedIntList();
        list.cons(12);
        list.cons(20);
        list.cons(36);
        list.cons(45);
        list.cons(55);
        list.cons(43765);
        list.cons(4387655);
        list.cons(43987665);
        list.cons(4398766);
        list.cons(4387655);
        IntIterator intIterator = list.iterator();
        while (intIterator.hasNext()){
            System.out.println(intIterator.next());
        }





    }
}
