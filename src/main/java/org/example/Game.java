package org.example;

public class Game {
    private final Board board;

    private PlayerColour currentPlayer = PlayerColour.RED;

    public Game(Board board){
        this.board = board;
    }

    public Piece pieceAt(int row, int col){
        return board.get(new Coordinates(row, col));
        System.out.println("hello");
    }
}
