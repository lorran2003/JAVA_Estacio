package src.lista_execicios01.questao01;

public class Calculos {
    private int number1;
    private int number2;

    // metodo construtor
    public Calculos(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // metodos get e set
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String calcular() {

        int soma = this.getNumber1() + this.getNumber2();
        int subtracao = this.getNumber1() - this.getNumber2();
        float divisao = this.getNumber1() / this.getNumber2();
        int multiplicao = this.getNumber1() * this.getNumber2();
        float restoDivisao = this.getNumber1() % this.getNumber2();

        return "\nSoma: " + soma + "\nSubtracao: " + subtracao + "\nQuociente: " + divisao + "\nMultiplicacao: " + multiplicao + "\nResto divisao: " + restoDivisao;

    }

    // metodo status
    public String resultado(){
        return "=== resultado dos numero iseridos ===" + this.calcular();
    }

}
