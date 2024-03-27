package src.exercicios.aula05;

public abstract class Motor {
    private float cilindrada;
    private int numero;
    private String fabricate;
    private int velocidadeMax;

    
    //metodo construtor
    public Motor(float cilindrada, int numero, String fabricate) {
        this.cilindrada = cilindrada;
        this.numero = numero;
        this.fabricate = fabricate;
        
    }
    
    //metodos get e set
    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

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

    @Override
    public String toString() {
        return "Cilindrada: " + this.getCilindrada() + "\nNumero do motor: " + this.getNumero() + "\nFabricate: " + this.getFabricate() + "\nVelocidade maxima: " + this.getVelocidadeMax() + "\n";
    }

    
}
