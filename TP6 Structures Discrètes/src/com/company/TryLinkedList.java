package com.company;
import static com.company.TryList.printIntList;
import static  java.lang.System.out;

public class TryLinkedList {
    public static void main(String [] args) {
        LinkedIntList myList =  new LinkedIntList();

        myList.cons(3);
        myList.cons(2);
        myList.cons(1);

        printIntList(myList);

        myList.add(0);

        printIntList(myList);

        myList.remove();

        printIntList(myList);

       // LinkedIntList myNewList = myList.getTail();
        printIntList(myList);
        //myNewList.remove(2);
        printIntList(myList);
    }

}
