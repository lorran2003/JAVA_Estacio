package atividade_verficadora.aula05;

public class Parede {
    private float altura;
    private String localizaocao;

    //metedo construtor
    public Parede(float altura, String localizaocao) {
        this.altura = altura;
        this.localizaocao = localizaocao;
    }

    //metodos get e set
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getLocalizaocao() {
        return localizaocao;
    }

    public void setLocalizaocao(String localizaocao) {
        this.localizaocao = localizaocao;
    }

    @Override
    public String toString() {
        return "\nparede [ altura: " + this.getAltura() + " metros"  + ", localizaocao: " + this.getLocalizaocao() + " ]";
    }

    

    
}
