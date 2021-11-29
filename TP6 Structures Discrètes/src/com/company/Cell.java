package com.company;

/**
 * Class Cell
 */
public class Cell {
    /**
     * La donnée du maillon
     */
    private int data;

    /**
     * Le maillon suivant
     */
    private Cell nextCell;

    /**
     * Constructeur de la class Cell     * @param data
     * @param nextCell
     */
    public Cell(int data, Cell nextCell){
        this.data = data;
        this.nextCell=nextCell;
    }

    public Cell(int data){
        this.data =data;
        this.nextCell = null;
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
     * La méthode addCell(int n) permet de relier deux maillons successivement;
     * @param n
     */
    public void addCell(int n){
        if (this.getNextCell() == null){
            this.setNextCell(n);
        }else {
            this.getNextCell().addCell(n);
        }
    }

}
