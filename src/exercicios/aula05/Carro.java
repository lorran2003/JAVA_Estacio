package src.exercicios.aula05;

public class Carro extends Motor {
    private String modelo;

    // metodo construtor
    public Carro(float cilindrada, int numero, String fabricate, String modelo) {
        super(cilindrada, numero, fabricate);
        this.setModelo(modelo);
        this.obterVelocidadeMax();
    }

    // metodo get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // metodo especiais
    public void obterVelocidadeMax() {

        if (this.getCilindrada() < 1.1) {

            this.setVelocidadeMax(140);

        } else if (this.getCilindrada() < 1.7) {

            this.setVelocidadeMax(180);

        } else if (this.getCilindrada() < 2.1){

            this.setVelocidadeMax(220);
            
        } else{

            this.setVelocidadeMax(260);
            
        }
    }

    @Override
    public String toString() {
        return "=== Carro === \nModelo: " + this.getModelo() + "\n" + super.toString();
    }

    
}
