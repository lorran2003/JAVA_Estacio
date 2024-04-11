package src.exercicios.aula07;

public class SistemaVendas {
    private Produto[] produtos;

    public SistemaVendas() {
        produtos = new Produto[10];
    }

    public void inserirProduto(Produto produto) {
        try {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] == null) {
                    produtos[i] = produto;
                    System.out.println("Produto inserido com sucesso!");
                    return;
                }
            }
            throw new ArrayIndexOutOfBoundsException("O vetor de produtos está cheio!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void retirarProduto(int codigo) {
        boolean produtoEncontrado = false;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getCodigo() == codigo) {
                produtos[i] = null;
                produtoEncontrado = true;
                System.out.println("Produto removido com sucesso!");
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado!");
        }
    }
}

