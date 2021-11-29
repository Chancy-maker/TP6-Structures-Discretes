package com.company;

import java.util.ArrayList;

public class LinkedIntList implements IntList{
    // variable d'instance
    private Cell first;

    // Listes des entier d'une Linkedlist
    ArrayList<Integer> list = new ArrayList<>();

    // Taille de la liste
    int size = 0;

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

        return this.first.getData();
    }


    @Override
    public IntList getTail() {
        IntList intList = new LinkedIntList();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer integer :  list){
            list1.add(integer);
        }
        list1.remove(0);
        if (this.size>0){
            for (Integer ints : list1){
                intList.cons(ints);
            }
        }
        return intList;
    }

    @Override
    public boolean isEmpty() {

        if (this.first == null){
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

    /**
     * La méthode getDataOfLinkedintList(Celle cell) permet de récupérer la liste des entier d'une liste
     * @param cell
     * @return
     */
       public ArrayList<Integer> getDataOfLinkedintList(Cell cell){
        list.add(cell.getData());


        if (cell.getNextCell()==null){
            return list;
        }


        getDataOfLinkedintList(cell.getNextCell());


        return list;
    }

    @Override
    public String toString(){
        String result = "[";
        if (this.first==null){
            result += "]";
            return result;
        }
        ArrayList<Integer> dataOfLinkedintList = getDataOfLinkedintList(this.first);
        for (Integer ints : dataOfLinkedintList){
            result += ints + ",";
        }
        result += "]";
        return result;
    }




}
