package com.max.idea;

import java.util.ArrayList;

public class Cell {

    ArrayList<Cell> near;
    Status status;

    public Cell(){

        status = Status.NONE;
        near = new ArrayList<>();

    }

    void step1(){

        int around = countNearCells();
        status = status.step1(around);
    }

    void addNear(Cell cell){

        near.add(cell);

    }

    void step2(){

        status = status.step2();

    }

    int countNearCells(){

        int count = 0;
        for (Cell cell : near)
            if (cell.status.isCell())
                count ++;
        return count;

    }
}
