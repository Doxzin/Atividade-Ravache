import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> Produtos;

    public Estoque() {
        this.Produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        Produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        Produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : Produtos) {
            double precoComDesconto = produto.calcularDes(porcentagem);
            System.out.println("Produto: " + produto.getNome() +
                    " | Preço original: R$" + produto.getPreco() +
                    " | Preço com desconto: R$" + precoComDesconto);
        }
    }
}
