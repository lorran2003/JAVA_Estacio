package src.exercicios.aula05;

public class Main {
    public static void main(String[] args) throws Exception {
        //declarando objeto
        Carro carro[] = new Carro[5];

        //criando objeto
        carro[0] = new Carro(1.0f, 610, "Ford", "Fiesta");
        carro[1] = new Carro(5.0f, 650, "Ford", "Mustang");
        carro[2] = new Carro(1.6f, 616, "Ford", "Focus");
        carro[3] = new Carro(1.3f, 613, "Fiat", "Fiorino");
        carro[4] = new Carro(1.7f, 320, "Chevrolet", "Astra");

        for(Carro cars : carro){
            System.out.println(cars.toString());
        }
    }
}
