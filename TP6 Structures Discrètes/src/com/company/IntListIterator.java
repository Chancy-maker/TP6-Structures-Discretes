package com.company;

public class IntListIterator implements IntIterator{
    private Cell list;
    private Cell currentCell;


    public IntListIterator(Cell list){
        this.list = list;
        this.currentCell = list;
    }
    @Override
    public int next() {
        int data = currentCell.getData();
        if (hasNext()){
            this.currentCell = currentCell.getNextCell();

        }
        return data;
    }

    @Override
    public boolean hasNext() {
        if (currentCell != null){
            return true;
        }else {
           return false;
        }
    }
}
