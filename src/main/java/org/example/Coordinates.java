package org.example;

public final class Coordinates {
    private final int row;
    private final int col;

    // Constructor for coordinates
    public Coordinates(int row, int col){
        this.row = row;
        this.col = col;
    }

    // Get the row
    public int getRow(){
        return row;
    }

    // Get the column
    public int getCol(){
        return col;
    }

    public Coordinates plus(int rowDiff, int colDiff){
        return new Coordinates(row + rowDiff, col + colDiff);
    }
}
