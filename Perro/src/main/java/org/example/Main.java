package org.example;


import agregacion.Collar;
import agregacion.Ropa;
import perro.Perro;

public class Main {
    public static void main(String[] args) {

        Perro miPerro = new Perro("Chihuahua","Hembra","Chato","largas", "peludo","grandes","corta");

        Ropa vestido = new Ropa("Vestido","Barbie");
        Ropa sueter = new Ropa("Sueter", "Frio");

        Collar collar = new Collar();
        collar.setColor("rosa");

        //Agregación
        miPerro.insertarRopa(vestido);
        System.out.println(miPerro.insertarRopa(sueter));
    }
}