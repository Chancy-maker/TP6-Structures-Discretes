package com.company;
import static com.company.TryList.printIntList;
import static  java.lang.System.out;
import static java.lang.System.setOut;

public class TryLinkedList {
    public static void main(String [] args) {

            LinkedIntList myList = // [1,2,3]
                    new LinkedIntList()
                            .cons(3)
                            .cons(2)
                            .cons(1);
            printIntList(myList);
            myList.add(0);
            printIntList(myList);
            myList.remove();
            printIntList(myList);

        LinkedIntList myNewList = myList.getTail();
        printIntList(myList);
        myNewList.remove(2);
        printIntList(myList);




    }

}
