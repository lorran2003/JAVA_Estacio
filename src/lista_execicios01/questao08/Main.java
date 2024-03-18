package exercicios.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("================\n");

        System.out.println("Digite dois valores: \n");

        System.out.println("Primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.println("Segundo valor: ");
        float valor2 = scanner.nextFloat();

        System.out.println("Escolha a expressao numerica: \n1-Soma\n2-Subtracao\n3-Divisao\n4-Multiplicacao\n");
        int op = scanner.nextInt();

        //condição para verificar qual expressão o usuário solicitou
        switch (op) {
            case 1:

                float soma = valor1 + valor2;
                String operadorSoma = "+";

                //indicando para compilador que a variavel não esta sendo usada
                @SuppressWarnings("unused")
                Op expressao = new Op(operadorSoma, valor1, valor2, soma);

                break;

            case 2:

                float subtracao = valor1 - valor2;
                String operadorSub = "-";

                expressao = new Op(operadorSub, valor1, valor2, subtracao);

                break;

            case 3:
                float divisao = valor1 / valor2;
                String operadorDivisao = "/";

                expressao = new Op(operadorDivisao, valor1, valor2, divisao);

                break;

            case 4:

                float multiplicacao = valor1 * valor2;
                String operadorMultiplicacao = "*";

                expressao = new Op(operadorMultiplicacao, valor1, valor2, multiplicacao);

                break;

            default:
                System.out.println("Digite um valor valido!");
                break;
        }

        scanner.close();
    }
}
