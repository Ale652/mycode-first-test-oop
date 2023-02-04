package com.entities;

public class Eticheta implements  Element{
    private Dreptunghi dreptunghi;
    private String text;

    public Eticheta(){
        System.out.println("Se creeaza o eticheta.");
    }

    public Eticheta(Dreptunghi dreptunghi, String text){
        this.dreptunghi = dreptunghi;
        this.text = text;
    }

    public Eticheta(Punct punct1, Punct punct2, String text){
        this.dreptunghi.setPunct1(punct1);
        this.dreptunghi.setPunct2(punct2);
        this.text = text;
    }

    public Dreptunghi getDreptunghi(){
        return this.dreptunghi;
    }

    public String getText(){
        return this.text;
    }

    public void setDreptunghi(Dreptunghi dreptunghi) {
        this.dreptunghi = dreptunghi;
    }

    public void setText(String text){
        this.text = text;
    }

    public String toString(){
        return "Eticheta :\n " + dreptunghi +  text + '\n';
    }

    @Override
    public void translare(int dimX, int dimY) {
        this.dreptunghi.getPunct1().setX(this.dreptunghi.getPunct1().getX()+dimX);
        this.dreptunghi.getPunct1().setY(this.dreptunghi.getPunct1().getY()+dimY);
        this.dreptunghi.getPunct2().setX(this.dreptunghi.getPunct2().getX()+dimX);
        this.dreptunghi.getPunct2().setY(this.dreptunghi.getPunct2().getY()+dimY);
    }

    @Override
    public Element duplicare() {
        return  new Eticheta(this.dreptunghi,this.text);
    }

    @Override
    public boolean equals(Object obj) {
        Eticheta intermediar = (Eticheta) obj;

        return  intermediar.dreptunghi == this.dreptunghi && intermediar.text == this.text;
    }
}
