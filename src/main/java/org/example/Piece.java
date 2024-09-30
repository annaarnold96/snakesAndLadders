package org.example;

public interface Piece {

    enum PieceType{
        STANDARD;
    }

    PieceType getType();

    PlayerColour getColour();

}
