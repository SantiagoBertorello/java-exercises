package exercise_java;

public class AbecedarioDeChar {



    public static void main(String[] args) {



        char ultimaLetraAbecedario = 91;

        for (char i = 65 ;i < ultimaLetraAbecedario ; i++){
            System.out.print(i +" ");

        }
        System.out.println("---------------------");

        for (char c = 'A'; c <= 'Z'; c++) {
        System.out.print(c + " ");
        }
    }
}
