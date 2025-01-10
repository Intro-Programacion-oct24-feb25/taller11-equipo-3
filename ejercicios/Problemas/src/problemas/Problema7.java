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
public class Problema7 {
    public static void main(String[] args) {
        String[] ciudadesEcuador = elementosArreglo();
        imprimirCiudad(ciudadesEcuador);
    }

    public static String[] elementosArreglo() {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese el numero de elementos");
        numero = entrada.nextInt();
        entrada.nextLine();

        String[] ciudad = new String[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese la ciudad");
            ciudad[i] = entrada.nextLine();
        }

        return ciudad;
    }

    public static void imprimirCiudad(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if ((arreglo[i].length() == 4) || (arreglo[i].length() == 5)) {
                System.out.printf("Ciudades con 4 o 5 caracteres: %s\n",
                        arreglo[i]);
            }
        }
    }

}
