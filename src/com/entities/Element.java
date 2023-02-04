package com.entities;

public interface Element {

    //todo:
    default void afisare(){
        System.out.println(this);
    };

    void translare(int dimX, int dimY);

  Element duplicare();
}
