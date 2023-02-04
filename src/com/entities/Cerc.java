package com.entities;

public class Cerc implements Element{
    private Punct punct;
    private Linie raza;

    public Cerc(){
        System.out.println("Se creeaza un cerc.");
    }

    public Cerc(Punct punct, Linie raza){
        this.punct = punct;
        this.raza = raza;
    }

    public Punct getPunct() {
        return this.punct;
    }

    public Linie getRaza() {
        return this.raza;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public void setRaza(Linie raza) {
        this.raza = raza;
    }

    public String toString(){
        return "Cerc :\n " + punct +  raza + '\n';

    }

    @Override
    public boolean equals(Object obj) {
        Cerc intermediar = (Cerc) obj;

        return  intermediar.raza == this.raza && intermediar.punct == this.punct;
    }

    @Override
    public void translare(int dimX, int dimY) {
        this.punct.setX(this.punct.getX() + dimX);
        this.punct.setY(this.punct.getY() + dimY);

        this.raza.setStart(new Punct(this.raza.getStart().getX() + dimX, this.raza.getStart().getY() + dimY));
        this.raza.setEnd(new Punct(this.raza.getEnd().getX() + dimX, this.raza.getEnd().getY() + dimY));
    }

    @Override
    public Element duplicare() {
        return  new Cerc(this.punct,this.raza);
    }
}