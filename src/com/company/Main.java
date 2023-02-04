package com.company;

import com.entities.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instantieri :
        Punct punct2_1 = new Punct(5L, 5L);
        Punct punct2_2 = new Punct(6L, 6L);
        Linie linie2 = new Linie(punct2_1, punct2_2);

        Punct punct3_1 = new Punct(8L, 9L);
        Punct punct3_2 = new Punct(6L, 11L);
        Linie linie3 = new Linie(punct3_1, punct3_2);

        Punct punct4_1 = new Punct(18L, 19L);
        Punct punct4_2 = new Punct(16L, 21L);
        Linie linie4 = new Linie(punct4_1, punct4_2);

        Punct punct1 = new Punct(1L, 1L);
        Punct punct2 = new Punct(1L, 1L);
        Linie linie = new Linie(punct1, punct2);
        Cerc cerc = new Cerc(punct1, linie);

        Punct punct1_dreptunghi = new Punct(4L, 6L);
        Punct punct2_drepunghi = new Punct(5L, 7L);
        Dreptunghi dreptunghi = new Dreptunghi(punct1_dreptunghi, punct2_drepunghi);

        Punct punct1_eticheta = new Punct(10L, 12L);
        Punct punct2_eticheta = new Punct(14L, 16L);
        Dreptunghi dreptunghiEticheta = new Dreptunghi(punct1_eticheta, punct2_eticheta);
        Eticheta eticheta = new Eticheta(dreptunghiEticheta, "Text");

        ArrayList<Element> listaElementelor = new ArrayList<Element>();
        listaElementelor.add(eticheta);
        listaElementelor.add(linie2);
        listaElementelor.add(dreptunghi);
        listaElementelor.add(linie3);
        listaElementelor.add(cerc);

        DesenGeometric desenGeometric = new DesenGeometric(listaElementelor);


        desenGeometric.add(linie4);

        // Afisari :

//        System.out.println(punct1);
//        System.out.println(punct2);
//        System.out.println(linie);
//        System.out.println(cerc);
//        System.out.println(dreptunghi);
//        System.out.println(eticheta);
//
//        System.out.println("\n Check if punct1 = punct2 : ");
//        System.out.println(punct1.equals(punct2));

        // Afisare Desen geometric :
        desenGeometric.afisare();

        // Translatare :
        desenGeometric.translatare(1, 2);
        desenGeometric.afisare();

        // Duplicare :
        DesenGeometric desenGeometric2 = desenGeometric.duplicare();
        System.out.println("Se afiseaza Desenul Geometric 2 : ");
        desenGeometric2.afisare();
        desenGeometric2.remove(linie4);
        System.out.println("Se afiseaza Desenul Geometric 2 dupa stergere : ");
        desenGeometric2.afisare();

        System.out.println("Se afiseaza Desenul Geometric 1 : ");
        desenGeometric.afisare();

    }
}
