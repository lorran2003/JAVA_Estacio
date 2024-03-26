package src.exercicios.aula05;

public class Motor {
    private float cilindrada;
    private int numero;
    private String fabricate;

    //metodo construtor
    public Motor(float cilindrada, int numero, String fabricate) {
        this.cilindrada = cilindrada;
        this.numero = numero;
        this.fabricate = fabricate;
    }
    
    //metodos get e set
    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFabricate() {
        return fabricate;
    }

    public void setFabricate(String fabricate) {
        this.fabricate = fabricate;
    }

    
}
