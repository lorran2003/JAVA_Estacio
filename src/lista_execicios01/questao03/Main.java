package src.lista_execicios01.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir o raio do círculo
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        // Criar um objeto Circulo com o raio fornecido
        Circulo circulo = new Circulo(raio);

        // Calcular o comprimento e a área do círculo
        double comprimento = circulo.calcularComprimento();
        double area = circulo.calcularArea();

        // Imprimir o comprimento e a área do círculo
        System.out.println("Comprimento do círculo: " + comprimento);
        System.out.println("Área do círculo: " + area);

        scanner.close();
    }
}
