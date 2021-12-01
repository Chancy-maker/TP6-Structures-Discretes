package com.company;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class TryList {


    /**
     * La méthode sum(IntList l) permet de calculer la somme des élément d'une
     * IntList à l'aide des méthodes getHead() et getTail().
     * @param l
     * @return
     */
    static int sum(IntList l) {
        if (l.isEmpty()) return 0;
        return l.getHead() + sum(l.getTail());
    }

    /**
     * La méthode sumIterator(LinkedIntList list) permet de calculer la liste des entier se trouvant dans une
     * LinkedList.
     * @param list
     * @return
     */
    static int sumIterator(LinkedIntList list){
        int result = 0;
        IntIterator iterator = list.iterator();
        while (iterator.hasNext()){
            result += iterator.next();
        }
        return result;
    }

    /**
     * La méthode printIntList(LinkedIntList list) permet d'afficher une LinkedIntList
     * @param list
     */
    static void printIntList(LinkedIntList list){
        String liste = "[";
        IntIterator iterator = list.iterator();
        while (iterator.hasNext()){
            liste += iterator.next() + ",";
        }
        liste += "]";
        out.println(liste);

    }
}

