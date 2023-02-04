package com.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DesenGeometric {
   private ArrayList<Element> listaElementelor = new ArrayList<>();


    public DesenGeometric(){
       System.out.println("Se creeaza un DesenGeometric.");
   }
    public DesenGeometric(ArrayList<Element> listaElementelor){
       this.listaElementelor = listaElementelor;
   }
    public ArrayList<Element>getListaElementelor(){
       return this.listaElementelor;
   }
    public void setListaElementelor(ArrayList<Element> listaElementelor){
       this.listaElementelor = listaElementelor;
   }
    public  void  add(Element element){
       this.listaElementelor.add(element);
   }
    public  void  remove(Element element){

        switch (((Object)element).getClass().getSimpleName()){
            case "Cerc":
                Cerc cerc = (Cerc) element;
                removeElement(cerc);

                break;
            case "Dreptunghi":
                Dreptunghi dreptunghi = (Dreptunghi) element;
                removeElement(dreptunghi);
                break;
            case "Eticheta":
                Eticheta eticheta = (Eticheta) element;
                removeElement(eticheta);
                break;
            case "Linie":
                Linie linie= (Linie) element;
                removeElement(linie);
                break;
        }
   }
    private void removeElement(Element element) {
        for(Iterator<Element> elementDinListaI = this.listaElementelor.iterator();
            elementDinListaI.hasNext();){
            Element elementDinLista = elementDinListaI.next();
            if(((Object)elementDinLista).getClass().getSimpleName().equals("Linie") && elementDinLista.equals(element))
                elementDinListaI.remove();
        }
    }
    public void afisare(){
       System.out.println("\n++++++++++++++++++++++++++++++++");
       System.out.println("Se afiseaza Desenul Geometric : ");
       for(Element element : this.listaElementelor)
           element.afisare();
   }
    public void translatare(int x, int y){
       for(Element element : this.listaElementelor)
           element.translare(x, y);
   }
    public DesenGeometric duplicare(){
       ArrayList<Element> listaElementelorDuplicate = new ArrayList<>();
       for(Element element : this.listaElementelor){
           listaElementelorDuplicate.add(element.duplicare());
       }

       return new DesenGeometric(listaElementelorDuplicate);
   }
}


