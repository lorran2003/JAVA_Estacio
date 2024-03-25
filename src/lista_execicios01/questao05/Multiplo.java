package src.lista_execicios01.questao05;

public class Multiplo {
    public int input;

    public void calcular(int n){
        this.input = n;
        
        if (input % 5 == 0) {
            System.out.println("O numero " +input+ " e multiplo de 5!");
        } else {
            System.out.println("O numero " + input + " nao e multiplo de 5!");
        }
    }
}
