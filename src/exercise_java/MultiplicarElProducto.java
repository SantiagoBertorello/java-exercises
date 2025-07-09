package exercise_java;

import java.util.Scanner;

public class MultiplicarElProducto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int number1 = teclado.nextInt();
        System.out.println("Ingrese otro número");
        int number2 = teclado.nextInt();
        int resultado = 0;
        for(var i = 0;i < number2;i++ ){
            resultado += number1;
        };
        System.out.println(number1+"x"+number2+"= "+ resultado);

    }
}
