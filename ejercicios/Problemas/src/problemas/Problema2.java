/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String mensaje = "";
        int opcion;
        System.out.println("Ingrese la opcion que desea usar");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                mensaje = obtenerAreaCuadrado();
                break;

            case 2:
                mensaje = obtenerAreaTriangulo();
                break;

            case 3:
                mensaje = obtenerAreaRectangulo();
                break;
        }
        System.out.printf("%s\n", mensaje);

    }

    public static String obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        int area;
        System.out.println("Ingrese la medida del lado del cuadrado");
        lado = entrada.nextInt();
        area = lado * lado;
        String cadena = "El area del cuadrado de lado: " + lado + " es: " + area
                + "\n";
        return cadena;

    }

    public static String obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextInt();
        area = (base * altura) / 2;
        String cadena = "El area del triangulo de base: " + base + " y altura: "
                + altura + " es: " + area + "\n";
        return cadena;
    }

    public static String obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextInt();
        area = (base * altura);
        String cadena = "El area del rectangulo de base: " + base + " y altura: "
                + altura + " es: " + area + "\n";
        return cadena;
    }

}
