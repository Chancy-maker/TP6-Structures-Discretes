package com.company;

import java.util.ArrayList;

/**
 * Class Cell
 */
public class Cell {


    /**
     * Liste d'une élément d'une chaine de maillons
     */
    private ArrayList<Integer> list = new ArrayList<>();
    /**
     * La donnée du maillon
     */
    private int data;

    /**
     * Le maillon suivant
     */
    private Cell nextCell;

    /**
     * Constructeur de la class Cell
     * * @param data
     * @param nextCell
     */
    public Cell(int data, Cell nextCell){
        this.data = data;
        this.nextCell=nextCell;
        list.add(data);
    }

    /**
     * Second constructeur de la classe Cell
     * @param data
     */
    public Cell(int data){
        this.data =data;
        this.nextCell = null;
        list.add(data);
    }



    /**
     * accesseurs de l'attriubut data
     * @return
     */
    public int getData() {
        return data;
    }

    /**
     * mutateurs de l'attribut data
     * @param data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * accesseur de l'attribut nextCell
     * @return
     */
    public Cell getNextCell() {
        return nextCell;
    }

    /**
     * mutateur de l'attribut nextCell
     * @param n
     */
    public void setNextCell(int n) {
        this.nextCell = new Cell(n,null);
    }

    /**
     * Accesseur de l'attribut list
     * @return
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * Mutateur de l'attribut list
     * @param list
     */
    public void setList1(ArrayList<Integer> list) {
        this.list = list;
    }


    /**
     * La méthode addCell(int n) permet de relier deux maillons successivement;
     * @param n
     */
    public void addCell(int n){
        if (this.getNextCell() == null){
            list.add(n);
            this.setNextCell(n);
        }else {
            this.list.add(n);
            this.getNextCell().addCell(n);

        }
    }

}
