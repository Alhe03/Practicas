package agregacion;

public class Ropa{
    private String tipo;
    private String estilo;

    public Ropa(String tipo, String estilo){
        this.tipo = tipo;
        this.estilo = estilo;
    }

    public void setTipo(String tipo){ this.tipo= tipo;}

    public void setEstilo(String estilo){ this.estilo = estilo;}

    public String ropaPuesta(String dato){ return "Trae ropa";}


    @Override
    public String toString(){return tipo + " " + estilo;}

}
