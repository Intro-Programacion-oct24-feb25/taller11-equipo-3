/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double mediaA;
        double desviacionE;

        mediaA = obtenerMediaAritmetica(informacion);
        desviacionE = obtenerDesviacionEstandar(informacion, mediaA);

        System.out.printf("Media Artimetica: %.2f\n",
                mediaA);
        System.out.printf("Desviacion Estandar: %.2f\n",
                desviacionE);
    }

    public static double obtenerMediaAritmetica(int[] a) {
        int suma = 0;
        double media;

        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }

        media = suma / a.length;

        return media;
    }

    public static double obtenerDesviacionEstandar(int[] a, double b) {
        double suma = 0;
        double desviacion;

        for (int i = 0; i < a.length; i++) {
            suma = suma + Math.pow(a[i] - b, 2);
        }

        desviacion = Math.sqrt(suma / a.length);

        return desviacion;
    }
}
