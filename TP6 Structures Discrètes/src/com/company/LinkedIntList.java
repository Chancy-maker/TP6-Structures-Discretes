package com.company;

import java.util.ArrayList;

public class LinkedIntList implements IntList{


    // variable d'instance
    private Cell first;


    // Taille de la liste
    int size ;

    /**
     * Constructeur d'objets de la classe LinkedIntList
     * @return
     */
    public LinkedIntList(){
        //initialisation des variable d'instance
        first = null;
        this.size = 0;

    }

    /**
     * Accesseur de l'attribut first
     * @return
     */
    public Cell getFirst() {
        return first;
    }

    @Override
    public int getHead() {

        return this.first.getData();
    }


    @Override
    public IntList getTail() {
        IntList intList1 = new LinkedIntList();
        ArrayList<Integer> list1 = new ArrayList<>();
        if (!this.isEmpty()) {
            for (Integer integer : this.first.getList()) {
                list1.add(integer);
            }
            list1.remove(0);
            if (this.size > 0) {
                for (Integer ints : list1) {
                    intList1.cons(ints);
                }
            }
            return intList1;
        }
        return new LinkedIntList();
    }

    @Override
    public boolean isEmpty() {
        if (size<=0){
            return true;
        }
        return false;
    }

    @Override
    public IntList cons(int n) {
        if (this.first == null){
            this.first = new Cell(n);

            size += 1;
        }else {
            size +=1;
            this.first.addCell(n);
        }
        return this;
    }



    @Override
    public int length() {
        if (isEmpty()){
            return 0;
        }
        return size;
    }


    @Override
    public String toString(){
        String result = "[";
        if (this.first==null){
            result += "]";
            return result;
        }
        ArrayList<Integer> dataOfLinkedintList = this.first.getList();
        for (Integer ints : dataOfLinkedintList){
            result += ints + ",";
        }
        result += "]";
        return result;
    }

}
