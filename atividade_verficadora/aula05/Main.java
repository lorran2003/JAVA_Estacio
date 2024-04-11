package atividade_verficadora.aula05;

public class Main {
    public static void main(String[] args) throws Exception {
        Janela janela = new Janela(5, "ferro");
        Porta porta = new Porta(4, 3, "madeira");
        Parede parede = new Parede(30, "sala");

        Casa casa = new Casa("Azul", 100, janela, porta, parede);
        
        System.out.println(casa.toString());
    }
}
