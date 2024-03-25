package src.lista_execicios01.questao07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // importando scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // imprimindo mensagem
        System.out.println("Dados dos alunos \n");

        // Array dinamico do tipo Aluno
        ArrayList<Aluno> arrayList = new ArrayList<>();

        // iniciando objetos alunos
        Aluno alunos = new Aluno(null, 0, 0);

        boolean insirirAlunos = true;

        // Criando a quantidade de alunos
        do {
            System.out.println("________________\n");

            // dados dos alunos
            System.out.println("Nome:");
            String nomeAluno = scanner.nextLine();

            System.out.println("nota:");
            float nota1 = scanner.nextFloat();

            System.out.println("nota:");
            float nota2 = scanner.nextFloat();

            System.out.println("________________");

            System.out.println("\n");

            // criando objeto alunos e insirindo no array list
            alunos = new Aluno(nomeAluno, nota1, nota2);

            arrayList.add(alunos);

            // imprimindo mensagem para usario
            System.out.println("Deseja continuar insirindo alunos: \n(1)Sim / (-1) Nao");

            // lendo input
            int escolha = scanner.nextInt();

            // consumindo a quebra de linha pendente após a leitura do número
            scanner.nextLine();

            // condição para inserir novo aluno ou sair
            if (escolha == -1) {

                // encerrando o loop
                insirirAlunos = false;

                System.out.println("\nInsercao de dados finalizadas com sucesso!\n");

            }

        } while (insirirAlunos == true);

        // fechando o sacnner
        scanner.close();

        float somaDasMedias = 0;

        // Imprimir detalhes dos alunos
        for (Aluno aluno : arrayList) {
            aluno.status();
            somaDasMedias += aluno.media();
        }

        float mediaDaTurma = somaDasMedias / arrayList.size();

        // acionando método e passando tamanho do arrayList como parametro
        alunos.statusMediaDaTurma(mediaDaTurma);

        // Encontrar a maior e a menor nota
        float menorNota = Float.MAX_VALUE;
        float maiorNota = Float.MIN_VALUE;

        //Verificando a maior e menor nota
        for(Aluno aluno : arrayList){
            float media = aluno.media();

            if(media > maiorNota){
                maiorNota = media;
            }
            if (media < menorNota) {
                menorNota = media;
            }
        }

        //identificando o aluno com a maior e menor nota
        for(Aluno aluno : arrayList){

            if (maiorNota == aluno.media()) {

                aluno.statusMaiorNota();
            }
            if(menorNota == aluno.media()){

                aluno.statusMenorNota();
            }
        }
        
    }
}
