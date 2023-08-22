package agregacion;

public class Collar {
    private String color;

    public void setColor (String color){this.color = color;}

    public String quitarCollar(String dato){ return dato;}


    public String getColor(){ return color;}


    @Override
    public String toString(){return color;}

}
