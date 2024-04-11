package atividade_verficadora.aula05;

public class Janela {
    private float dimensao;
    private String material;

    //metodo construtor
    public Janela(float dimensao, String material) {
        this.dimensao = dimensao;
        this.material = material;
    }

    //metodos get e set
    public float getDimensao() {
        return dimensao;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    @Override
    public String toString() {
        return "\njanela: [ dimensao: " + this.getDimensao()+ " metros" + ", material: " + this.getMaterial() + " ]";
    }

    

}
