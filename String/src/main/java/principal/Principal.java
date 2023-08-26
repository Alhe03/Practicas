package principal;

import Cadena.String;

import java.util.Scanner;

public class Principal {
    public static void main(java.lang.String[] args) {
        String cadena = new String();
        cadena.capturarDatos(new Scanner(System.in));
        System.out.println(cadena);

    }
}