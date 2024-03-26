package src.lista_execicios01.questao02;

public class Calculos {
    private float number1;
    private float number2;

    // metodo construtor
    public Calculos(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // metodos get e set
    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String calcular() {

        float soma = Math.round((this.getNumber1() + this.getNumber2()) * 10.0f) / 10.0f ;
        float subtracao = this.getNumber1() - this.getNumber2();
        float divisao = this.getNumber1() / this.getNumber2();
        float multiplicao =  Math.round((this.getNumber1() * this.getNumber2()) * 10.0f) / 10.0f ;
        float restoDivisao = this.getNumber1() % this.getNumber2();

        return "\nSoma: " + soma + "\nSubtracao: " + subtracao + "\nQuociente: " + divisao + "\nMultiplicacao: " + multiplicao + "\nResto divisao: " + restoDivisao;

    }

    // metodo status
    public String resultado(){
        return "=== resultado dos numero iseridos ===" + this.calcular();
    }

}
