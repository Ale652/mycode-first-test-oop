package com.entities;

public class Linie implements Element{
    private Punct start;
    private Punct end;

    public Linie(){
        System.out.println("Se creeaza o Linie.");
    }

    public Linie(Punct start, Punct end){
        this.start = start;
        this.end = end;
    }

    public Punct getStart() {
        return start;
    }

    public void setStart(Punct start) {
        this.start = start;
    }

    public Punct getEnd() {
        return end;
    }

    public void setEnd(Punct end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Linie:\n " + "start = " + start +
                                " end = " + end + '\n';
    }

    @Override
    public Element duplicare() {
        return  new Linie(this.start,this.end);
    }

    @Override
    public void translare(int dimX, int dimY) {
        this.setStart(new Punct(this.getStart().getX() + dimX, this.getStart().getY() + dimY));
        this.setEnd(new Punct(this.getEnd().getX() + dimX, this.getEnd().getY() + dimY));
    }

    @Override
    public boolean equals(Object obj) {
        Linie intermediar = (Linie) obj;

        return  intermediar.start == this.start && intermediar.end == this.end;
    }

}
