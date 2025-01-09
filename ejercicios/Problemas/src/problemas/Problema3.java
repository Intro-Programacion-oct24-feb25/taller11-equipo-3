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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String notaCualitativa;
        String mensaje;
        double notas1;
        double notas2;
        double notas3;
        double notas4;

        System.out.println("Ingrese la primera nota");
        notas1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        notas2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        notas3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        notas4 = entrada.nextDouble();

        notaCualitativa = promedio(notas1, notas2, notas3, notas4);
        mensaje = "El promedio de las notas " + notas1 + " , " + notas2
                + " , " + notas3 + " , " + notas4 + " , es: "
                + notaCualitativa;
        String mensaje2 = mensajeMayus(mensaje);
        System.out.printf("%s\n",mensaje2);
    }

    public static String promedio(double a, double b, double c, double d) {
        double suma;
        double promedio;
        suma = a + b + c + d;
        promedio = suma / 4;
        String notaCualitativa = "";

        if ((promedio >= 0) && (promedio <= 5)) {
            notaCualitativa = "Regular";
        } else {
            if ((promedio >= 5.1) && (promedio <= 8)) {
                notaCualitativa = "Bueno";
            } else {
                if ((promedio >= 8.1) && (promedio <= 9)) {
                    notaCualitativa = "Muy bueno";
                } else {
                    if ((promedio >= 9.1) && (promedio <= 10)) {
                        notaCualitativa = "Sobresaliente";
                    }
                }
            }

        }
        return notaCualitativa;
    }
    
    public static String mensajeMayus(String a){
        String mensaje = a.toUpperCase();
        return mensaje;
    }
}
