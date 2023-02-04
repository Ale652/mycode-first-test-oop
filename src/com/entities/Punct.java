package com.entities;

import java.util.Objects;

public class Punct implements Element{
    private Long x;
    private Long y;

    public Punct(){
        System.out.println("Se creeaza un punct.");
    }

    public Punct(Long x, Long y){
        this.x = x;
        this.y = y;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punct : " + "x= " + x + ", y= " + y + '\n';
    }
    @Override
    public boolean equals(Object obj) {
        Punct intermediar = (Punct) obj;

        return  intermediar.x == this.x && intermediar.y == this.y;
    }


    @Override
    public void translare(int dimX, int dimY) {
        this.setX(this.getX() + dimX);
        this.setY(this.getY() + dimY);
    }

    @Override
    public Element duplicare() {
        return  new Punct(this.x,this.y);
    }
}
