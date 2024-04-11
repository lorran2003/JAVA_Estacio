package atividade_verficadora.aula05;

public class Porta {
    private float altura;
    private float largura;
    private String material;

    //metodo construtor
    public Porta(float altura, float largura, String material) {
        this.altura = altura;
        this.largura = largura;
        this.material = material;
    }

    //metodo get e set
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\nporta [ altura: " + this.getAltura() + " metros" + ", largura: " + this.getLargura() + " metros" + ", material: " + this.getMaterial() + " ]";
    }

    
    
}
