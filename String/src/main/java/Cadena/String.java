package Cadena;

import java.util.Scanner;

public class String {
    java.lang.String cadena;
    java.lang.String nombre;
    java.lang.String fecha;
    char  l1;
    char l2 ;
    char l3;
    char l4;
    java.lang.String dd;
    java.lang.String mm;
    java.lang.String yy;

    public void capturarDatos(Scanner scanner){
        System.out.println("Ingresa tu nombre completo: ");
        nombre = scanner.nextLine();
        System.out.println("Tu fecha de nacimiento: dd/mm/yy");
        fecha = scanner.nextLine();
        procesarFecha();
        procesaNombre();
    }
    private void procesarFecha() {

        int pos1 = fecha.indexOf("/");
        int pos2 = fecha.lastIndexOf("/");
        dd = fecha.substring(0, pos1);
        mm = fecha.substring(pos1 + 1, pos2);
        yy = fecha.substring(pos2 + 1);
    }

   private boolean esUn(char[] caracteres, char c) {
       return (new java.lang.String(caracteres).indexOf(c) >= 0) ? true : false;
   }
    private void procesaNombre(){
        char[] vocales = {'A','E','I','O','U'};
        java.lang.String [] datos = nombre.split(" ");
        l1 = datos[2].charAt(0);
        l2 = datos[2].toUpperCase().charAt(1);
        if (!esUn(vocales,l2)) {l2 = datos[2].charAt(2);}
        l3=  datos[3].charAt(0);
        l4= datos[0].charAt(0);


    }

    @Override
    public java.lang.String toString(){
        return  "Tu RFC es: " + l1+l2+l3+l4+ yy + mm + dd;
    }
}
