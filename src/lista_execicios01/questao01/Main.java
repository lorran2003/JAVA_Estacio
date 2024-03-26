package src.lista_execicios01.questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        Calculos calculos = new Calculos(number1, number2);
        calculos.calcular();
        System.out.println(calculos.resultado());

        scanner.close();
    }
}
