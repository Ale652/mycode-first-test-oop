package com.entities;

import com.entities.Punct;

public class Dreptunghi implements Element{
    private Punct punct1;
    private Punct punct2;

    public Dreptunghi(){
        System.out.println("Se creeaza un Dreptunghi.");
    }

    public Dreptunghi(Punct punct1, Punct punct2){
        this.punct1 = punct1;
        this.punct2 = punct2;
    }


    public Punct getPunct1(){
        return this.punct1;
    }
    public Punct getPunct2(){
        return this.punct2;
    }
    public void setPunct1(Punct punct1){
        this.punct1 = punct1;
    }
    public void setPunct2(Punct punct2){
        this.punct2 = punct2;
    }

    public String toString(){
        return "Drepunghi :\n " + punct1 + " "+  punct2 ;
    }

    @Override
    public boolean equals(Object obj) {
        Dreptunghi intermediar = (Dreptunghi) obj;

        return  intermediar.getPunct1().equals(this.getPunct1()) && intermediar.getPunct2().equals(this.getPunct2());
    }

    @Override
    public void translare(int dimX, int dimY) {
        this.punct1.setX(this.punct1.getX() + dimX);
        this.punct1.setY(this.punct1.getY() + dimY);

        this.punct2.setX(this.punct2.getX() + dimX);
        this.punct2.setY(this.punct2.getY() + dimY);
    }

    @Override
    public Element duplicare() {
        return  new Dreptunghi(this.punct1,this.punct2);
    }
}