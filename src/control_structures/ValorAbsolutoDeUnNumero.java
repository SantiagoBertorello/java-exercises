package control_structures;

import java.util.Scanner;

public class ValorAbsolutoDeUnNumero
{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nécesita el valor absoluto de un número?");

        System.out.println("Ingrese el número:");
        int numeroIngresado = teclado.nextInt();
        int numeroAbsoluto = (numeroIngresado < 0)? -numeroIngresado : numeroIngresado;
        System.out.println("EL número absoluto es: " + numeroAbsoluto);
        
    }
}
