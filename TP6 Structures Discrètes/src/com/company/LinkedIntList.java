package com.company;

public class LinkedIntList implements IntList{
    // variable d'instance
    private Cell first;

    /**
     * Constructeur d'objets de la classe LinkedIntList
     * @return
     */
    public LinkedIntList(){
        //initialisation des variable d'instance
        first = null;
    }

    @Override
    public int getHead() {
        return 0;
    }

    @Override
    public IntList getTail() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntList cons(int n) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
}
