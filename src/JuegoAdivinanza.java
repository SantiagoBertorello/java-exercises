import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        int numeroSecreto = new Random().nextInt(100) + 1;;


        while(intentos < 5){
            System.out.println("Elija un numero del 1 al 100!");
            int numeroUsuario = teclado.nextInt();
            if(numeroUsuario == numeroSecreto){
                System.out.println("Acertaste el número Secreto!");
                break;
            }else{
                intentos++;
                if(numeroUsuario < numeroSecreto){
                    System.out.println("El número ingresado es menor");
                }
                else{
                    System.out.println("El número ingresado es mayor");
                }
                if(intentos < 5) {
                    System.out.println(" Intentalo devuelta!");

                }else{
                    System.out.println("Lo lamento!no te quedan mas intentos!");
                    System.out.println("El número era: " + numeroSecreto);
                }

            }

        }


    }
}
