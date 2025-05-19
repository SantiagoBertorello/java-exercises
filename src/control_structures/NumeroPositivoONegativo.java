package control_structures;

import java.util.Scanner;

public class NumeroPositivoONegativo {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número para saber si es positivo o negativo:");
        int numeroIngresado = teclado.nextInt();

        if(numeroIngresado > 0){
            System.out.println("Su número es Positivo");

        }else if (numeroIngresado < 0){
            System.out.println("Su número es Negativo");
        }else{
            System.out.println("Su número es 0");
        }
    }
}
