package src.lista_execicios01.questao07;

public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;

    // relacionado os atributos nos objetos
    public Aluno(String name, float nota1, float nota2) {
        this.nome = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // metodo para imprimir os dados dos alunos
    public void status() {

        System.out.println("______________");

        System.out.println(nome);
        System.out.println("Teste: " + nota1);
        System.out.println("Prova: " + nota2);
        System.out.println("Media: " + media());

        System.out.println("______________");

        System.out.println("\n");

    }

    public void statusMediaDaTurma(float mediaDaTurma) {

        System.out.println("A media da turma foi: " + mediaDaTurma  + "\n");

    }

    public void statusMaiorNota() {
        System.out.println("------------");
        System.out.println("Maior nota da turma:");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + media());
        System.out.println("------------\n");
    }

    public void statusMenorNota() {
        System.out.println("------------");
        System.out.println("Menor nota da turma:");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + media());
        System.out.println("------------\n");
    }

    public float media() {

        return (nota1 + nota2) / 2;
    }

}
