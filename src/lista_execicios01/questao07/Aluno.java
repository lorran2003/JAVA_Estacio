package src.lista_execicios01.questao07;

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
        this.media = (nota1 + nota2) / 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    // metodo para imprimir os dados dos alunos
    public void status() {

        System.out.println("______________");

        System.out.println(nome);
        System.out.println("Teste: " + nota1);
        System.out.println("Prova: " + nota2);
        System.out.println("Media: " + this.media);

        System.out.println("______________");

        System.out.println("\n");

    }

    public void statusMediaDaTurma(float mediaDaTurma) {

        System.out.println("A media da turma foi: " + mediaDaTurma  + "\n");

    }

    public void statusMaiorNota() {
        System.out.println("------------");
        System.out.println("Maior media da turma:");
        System.out.println("Nome: " + nome);
        System.out.println("media: " + this.media);
        System.out.println("------------\n");
    }

    public void statusMenorNota() {
        System.out.println("------------");
        System.out.println("Menor media da turma:");
        System.out.println("Nome: " + nome);
        System.out.println("media: " + this.media);
        System.out.println("------------\n");
    }

}
