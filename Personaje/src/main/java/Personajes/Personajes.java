package Personajes;

import Agregacion.Tipo;
import Composicion.Elfo;
import Composicion.Enano;
import Composicion.Humano;

public class Personajes {
    private String nombre;
    private int vidas;

    private Elfo elfo; //Composición;
    private Enano enano;
    private Humano humano;

     //Agregación
    private Tipo [] tipos;
    private int numeroTipo;

    public Personajes(String nombre, int vidas, int inteligenciaElfo, int fuerzaEnano, int destrezaHumano ){
        this.nombre = nombre;
        this.vidas = vidas;

        //Composición
        this.elfo = new Elfo();
        this.elfo.setInteligecia(inteligenciaElfo);

        this.enano = new Enano();
        this.enano.setFuerza(fuerzaEnano);

        this.humano = new Humano();
        this.humano.setDestreza (destrezaHumano);

        //Agregación
        this.tipos = new Tipo[3];
    }
    public String insertarTipo(Tipo tipo) {
        if (numeroTipo < 3) {
            tipos[numeroTipo] = tipo;
            numeroTipo ++;
        }
        return "Mis personajes son: \n  "+ tipos[0] + ", \n  " + tipos[1]+ ", " + tipos[2];
    }

}
