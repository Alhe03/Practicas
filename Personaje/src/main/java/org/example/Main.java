package org.example;

import Agregacion.Tipo;
import Personajes.Personajes;


public class Main {
    public static void main(String[] args) {

      Personajes miPersonaje = new Personajes ("Juan",2,3,4,5 );

      Tipo arquero = new Tipo("Arquero","Arco", "Lanzador");
      Tipo guerrero = new Tipo ("Guerrero","escudo", "Fuerte");
      Tipo mago = new Tipo("Mago","Hechizos","Inteligencia");

      miPersonaje.insertarTipo(arquero);
      System.out.println(miPersonaje.insertarTipo(guerrero));
      System.out.println(miPersonaje.insertarTipo(mago));


    }
}