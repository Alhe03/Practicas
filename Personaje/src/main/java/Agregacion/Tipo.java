package Agregacion;

public class Tipo {
    private String tipo;
    private String armas;
    private String habilidades;


    public Tipo(String tipo, String armas, String habilidades){
        this.tipo = tipo;
        this.armas = armas;
        this.habilidades = habilidades;
    }

    public void setTipo(String tipo){ this.tipo= tipo;}

    public void setArmas(String armas){ this.armas = armas;}

    public void setHabilidades(String habilidades){ this.habilidades = habilidades ;}

    public String activaddes(String dato){ return "Tiene diferentes actividades ";}


    @Override
    public String toString(){return tipo + " su arma es: " + armas + " su habilidad es: "+ habilidades+ " ";}
}
