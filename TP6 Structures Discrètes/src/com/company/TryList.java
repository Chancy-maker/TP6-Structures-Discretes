package com.company;
import static java.lang.System.out;

public class TryList {

    static int sum(IntList l) {
        if (l.isEmpty()) return 0;
        return l.getHead() + sum(l.getTail());
    }
}

