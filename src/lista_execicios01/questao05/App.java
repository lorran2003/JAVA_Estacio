package src.lista_execicios01.questao05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");

        int numero = scanner.nextInt();

        Multiplo input = new Multiplo();
        
        input.calcular(numero);

        scanner.close();

    }
}
