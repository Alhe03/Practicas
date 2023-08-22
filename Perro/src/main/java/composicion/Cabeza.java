package composicion;

public class Cabeza {
    private String tipoHocico;

    private String orejas;

    public void setTipoHocico(String tipoHocico){this.tipoHocico = tipoHocico;}
    public void setOrejas(String orejas){this.orejas = orejas;}

    public String getTipoHocico(){ return tipoHocico;}
    public String getOrejas(){ return orejas;}



    public String ladrar (){ return "Perro ladra";}

}
