package control_structures;

import java.util.Scanner;

public class CalculadoraConIf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("¡Bienvenido a tu calculadora virtual!");

        System.out.println("Ingrese el primer numero entero:");
        int primerNumero = teclado.nextInt();
        System.out.println("Ingrese la operación que desee ejecutar(+, - , / , * ):");
        String signoOperacion = teclado.next();

        System.out.println("Ingrese el segundo numero entero:");
        int segundoNumero = teclado.nextInt();

        teclado.close();

        if("+".equals(signoOperacion)) {
            System.out.println(primerNumero + segundoNumero);

        } else if ("-".equals(signoOperacion)) {
            System.out.println(primerNumero - segundoNumero);
        } else if ("/".equals(signoOperacion)) {
            if (segundoNumero == 0) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                System.out.println(primerNumero / segundoNumero);
            }
        } else if ("*".equals(signoOperacion) || "x".equals(signoOperacion)){
            System.out.println(primerNumero * segundoNumero);
        } else {
            System.out.println("Caracter no reconocido");
        }
    }
}
