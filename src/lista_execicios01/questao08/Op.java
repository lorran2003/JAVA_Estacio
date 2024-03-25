package src.lista_execicios01.questao08;

public class Op {
    private String expressao;
    private float numberA;
    private float numberB;

    public Op(String op, float valor1, float valor2, float resultado){
        expressao = op;
        numberA = valor1;
        numberB = valor2;
        status(resultado);
    }

    public void status(float resultado){
        System.out.println("Resultado : \n" +  numberA + " " + expressao + " " + numberB + " : " + resultado);
    }


}   

