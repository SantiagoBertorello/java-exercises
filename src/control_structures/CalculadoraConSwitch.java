package control_structures;

import java.util.Scanner;

public class CalculadoraConSwitch {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("¡Bienvenido a tu calculadora virtual!");

        System.out.println("Ingrese el primer numero entero:");
        int primerNumero = teclado.nextInt();
        System.out.println("Ingrese la operación que desee ejecutar(+, - , / , * ):");
        String signoOperacion = teclado.next();

        System.out.println("Ingrese el segundo numero entero:");
        int segundoNumero = teclado.nextInt();

        teclado.close();

        switch (signoOperacion) {
            case "+":
                System.out.println("Resultado: " + (primerNumero + segundoNumero));
                break;
            case "-":
                System.out.println("Resultado: " + (primerNumero - segundoNumero));
                break;
            case "*":
                System.out.println("Resultado: " + (primerNumero * segundoNumero));
                break;
            case "/":
                if (segundoNumero == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                } else {
                    System.out.println("Resultado: " + (primerNumero / segundoNumero));
                }
                break;
            default:
                System.out.println("Operación no reconocida.");
        }
    }
}
