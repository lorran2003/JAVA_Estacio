package src.lista_execicios01.questao03;
import java.util.Scanner;

public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular o comprimento do círculo
    public double calcularComprimento() {
        return 2 * Math.PI * raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

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