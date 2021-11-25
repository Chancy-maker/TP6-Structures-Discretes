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
     * Constructeur de la class Cell
     * @param data
     * @param nextCell
     */
    public Cell(int data, Cell nextCell){
        this.data = data;
        this.nextCell=nextCell;
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
     * @param nextCell
     */
    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }
}
