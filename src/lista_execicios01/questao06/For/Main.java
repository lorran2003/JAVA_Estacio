package exercicios.exercicio02.For;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //importando scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        //imprimindo mensagem
        System.out.println("Quantidade de alunos na turma: ");
        
        //armazenando valor do input
        int number = scanner.nextInt();
        
        //Array de objetos alunos
        Aluno[] alunos = new Aluno[number];

        //Criando a quantidade de alunos
        for(int i = 0; i < number; i++){
            //consumindo a quebra de linha pendente após a leitura do número
            scanner.nextLine();

            System.out.println("________________\n");

            //dados dos alunos
            System.out.println("Nome:");
            String nomeAluno = scanner.nextLine();
            
            System.out.println("nota:");
            float nota1 = scanner.nextFloat();
            
            System.out.println("nota:");
            float nota2 = scanner.nextFloat();
            
            System.out.println("________________");

            System.out.println("\n");
            
            alunos[i] = new Aluno(nomeAluno, nota1, nota2);
        }
        
        //fechando o sacnner
        scanner.close();

        for(int i = 0; i < number; i++){
            alunos[i].status(number);
        }

        
    }
}
