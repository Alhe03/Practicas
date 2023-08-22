package perro;

import agregacion.Collar;
import agregacion.Ropa;
import composicion.Cabeza;
import composicion.Cuerpo;
import composicion.Patas;
import composicion.Cola;

public class Perro {
    private String raza;
    private String sexo;

    private Cola cola; //Composición;
    private Cabeza cabeza;
    private Cuerpo cuerpo;
    private Patas patas;

    private Collar collar; //Agregación
    private Ropa [] ropas;
    private int numeroDeRopa;



    public Perro(String raza, String Sexo, String hocicoCabeza, String orejaCabeza, String peloCuerpo,String tamanoPatas, String largoCola){
        this.raza = raza;
        this.sexo = sexo;

        //Composición
        this.cabeza = new Cabeza();
        this.cabeza.setTipoHocico(hocicoCabeza);
        this.cabeza.setOrejas(orejaCabeza);

        this.cuerpo = new Cuerpo();
        this.cuerpo.setPelo(peloCuerpo);

        this.patas = new Patas();
        this.patas.setTamano (tamanoPatas);

        this.cola = new Cola();
        this.cola.setLargo (largoCola);
        this.numeroDeRopa = 0;

    //Agregación
        this.ropas = new Ropa[2];
        this.collar = new Collar();
    }
    public String insertarRopa(Ropa ropa) {
        if (numeroDeRopa < 2) {
            ropas[numeroDeRopa] = ropa;
            numeroDeRopa ++;
        }
        return "Mi perro tiene " + ropas[0] + " y " + ropas[1];
    }
    public String insertarCollar(Collar collar){return "Collar puesto"+ collar;}
}

