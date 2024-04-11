package src.exercicios.aula07;

public class Main {
    public static void main(String[] args) throws Exception {

        SistemaVendas sistema = new SistemaVendas();

        // Teste de inserção
        for (int i = 1; i <= 11; i++) {
            Produto produto = new Produto(i, "Produto " + i, 10.0 * i);
            sistema.inserirProduto(produto);
        }

        // Teste de retirada
        sistema.retirarProduto(5);
        sistema.retirarProduto(12); // Produto

    }
}
