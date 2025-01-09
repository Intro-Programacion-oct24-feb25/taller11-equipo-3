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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre; 
        String cedula;
        int opcion;
        
        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingree la cedula del cliente");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el proceso que desea realizar");
        opcion = entrada.nextInt();
        
        if(opcion == 1){
            calcularValorLuz(nombre,cedula);
        }else{
            if(opcion == 2){
                calcularValorPredio(nombre,cedula);
            }
        }
        
    }
    
    public static String calcularValorLuz(String a, String b){
        Scanner entrada = new Scanner(System.in);
        
        double valorK;
        double numeroK;
        double total = 0;
        String cadena = "";
        
        System.out.println("Ingrese el valor x kilovatio");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios usados");
        numeroK = entrada.nextDouble();
        
        total = valorK * numeroK;
        
        cadena = "Cliente "+ a +" con cedula "+ b +" debe cancelar el valor de "
                + total +"\n";
        System.out.printf("%s\n",cadena);
        return cadena;
    }
    
    public static String calcularValorPredio(String a, String b){
        Scanner entrada = new Scanner(System.in);
        
        double valorI;
        double valorPredio = 0;
        String cadena = "";
        
        System.out.println("Ingrese el valor del inmueble");
        valorI = entrada.nextDouble();
        
        valorPredio = (valorI * 0.02);
        
        cadena = "Cliente "+ a +" con cedula "+ b +" tiene un bien inmueble"
                + " valorado en "+ valorI +" y tiene que pagar de predio "+
                valorPredio +"\n";
        
        System.out.printf("%s\n",cadena);
        return cadena;
    }
}
