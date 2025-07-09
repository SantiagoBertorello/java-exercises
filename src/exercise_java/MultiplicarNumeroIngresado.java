package exercise_java;

import java.util.Scanner;

public class MultiplicarNumeroIngresado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número que deseé multiplicar del 1 al 10");
        int numeroIngresado = teclado.nextInt();
        for(var i = 1;i < 11;i++ ){
            System.out.println(numeroIngresado +"x"+ i + "= " + numeroIngresado * i );

        }


    }
}
