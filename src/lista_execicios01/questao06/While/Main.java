package exercicios.exercicio02.While;

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

        int index = 0;

        //Criando a quantidade de alunos
        while(index < number){

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
            
            alunos[index] = new Aluno(nomeAluno, nota1, nota2);

            index++;
        }
        
        //fechando o sacnner
        scanner.close();

        boolean status = true;

        index = 0;
        
        while(status == true){

            if (index == number) {
                status = false;
            } 
            else {

                alunos[index].status(number);
                index++;
            }
        }  
    }
}
