package atividade_verficadora.aula05;

public class Casa {
    private String cor;
    private float tamanho;
    private Janela janela;
    private Porta porta;
    private Parede parede;

    // metodo construtor
    public Casa(String cor, float tamanho, Janela janela, Porta porta, Parede parede) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.janela = janela;
        this.porta = porta;
        this.parede = parede;
    }

    //metodos get e set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Janela getJanela() {
        return janela;
    }

    public void setJanela(Janela janela) {
        this.janela = janela;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    public Parede getParede() {
        return parede;
    }

    public void setParede(Parede parede) {
        this.parede = parede;
    }

    @Override
    public String toString() {
        return " ===== Casa ===== \ncor: " + this.getCor() + "\ntamanho : " + this.getTamanho() + " metros cubicos" + janela.toString() + parede.toString() + porta.toString();
    }


    
}
