package src.lista_execicios01.questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores: ");
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        scanner.nextLine();

        Calculos calculos = new Calculos(number1, number2);
        calculos.calcular();
        System.out.println(calculos.resultado());

        scanner.close();
    }
}
