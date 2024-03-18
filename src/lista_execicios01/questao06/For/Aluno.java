package exercicios.exercicio02.For;
public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private float media;

    // relacionado os atributos nos objetos
    public Aluno(String name, float nota1, float nota2) {
        this.nome = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // metodo para imprimir os dados dos alunos
    public void status(int number) {
        
        media = (nota1 + nota2) / 2;

        System.out.println("______________");

        System.out.println(nome);
        System.out.println("Teste: " + nota1);
        System.out.println("Prova: " + nota2);
        System.out.println("Media: " + media);

        System.out.println("______________");

        System.out.println("\n");

    }
}
