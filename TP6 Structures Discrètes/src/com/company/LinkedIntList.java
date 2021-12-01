package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedIntList implements IntList{


    /**
     * Premier maillon d'une liste
     */
    private Cell first;


    /**
     * Taille d'une liste
     */
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

    public void setFirst(Cell first){
        this.first = first;
    }

    @Override
    public int getHead() {

        return this.first.getData();
    }


    @Override
    public IntList getTail() {
        LinkedIntList listReturn = new LinkedIntList();
        listReturn.setFirst(this.first.getNextCell());
        return listReturn;
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
        Cell element = new Cell(n,null);
        Cell firstElementOfList = this.first;
        this.setFirst(element);
        this.first.setNextCell(firstElementOfList);
        size++;
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
     * La méthode iterator() retourn un object de type IntListIterator permettant de parcourir l'object courrant
     * @return
     */
    public IntListIterator iterator(){
        return new IntListIterator(this.first);
    }

    /**
     * La méthode remove permet d'ôter de la liste son premier élément
     */
    public void remove(){
        this.setFirst(this.first.getNextCell());
    }

    /**
     * La méthode add(int n) permet d' ajouter
     * à la liste un entier n comme premier élément de la liste.
     * @param n
     */
    public void add(int n){
        Cell element = new Cell(n,null);
        Cell firstElementOfList = this.first;
        this.setFirst(element);
        this.first.setNextCell(firstElementOfList);
    }

    /**
     * La méthode add(int n, int pos) permet d'ajouter à la liste un entier n en position pos.
     * @param n
     * @param pos
     */
    public void add(int n,int pos){
        if (pos<1){
            this.add(n);
        }
        if (pos >=1 && !(pos >this.size -1) ){
            int position = 0;
            Cell currentPosition = this.first;
            Cell nextPosition = null;
            while ( currentPosition.getNextCell() != null){
                if ((position+1)!=pos){
                currentPosition = currentPosition.getNextCell();
                position++;
                    System.out.println(position);
                }else break;
            }
            nextPosition = currentPosition.getNextCell();
            currentPosition.setNextCell(new Cell(n,null));
            currentPosition.getNextCell().setNextCell(nextPosition);
            size++;
        }
        else {
            Cell currentElemnt = this.first;
            while (currentElemnt.getNextCell()!=null){
                currentElemnt = currentElemnt.getNextCell();
            }
            currentElemnt.setNextCell(new Cell(n,null));
            size++;
        }
    }


    /**
     * La méthode remove(int n, int pos) permet d'a ôter de la liste l’élément en position pos
     * @param n
     * @param pos
     */
    public void remove(int n, int pos){
        if (pos<1 && pos>this.size){
            throw new NoSuchElementException("Entrer une valeur supérieur ou égal à 1 et inférieur " +
                    "à la taille de la liste");
        }
    }



}
