package org.example;

public final class Move {
    private final Coordinates from;
    private final Coordinates to;

    public Move(Coordinates from, Coordinates to){
        this.from = from;
        this.to = to;
    }

    public Coordinates getFrom() {
        return from;
    }

    public Coordinates getTo() {
        return to;
    }

    public String toString(){
        return "from " + from + " to " + to;
    }
}
