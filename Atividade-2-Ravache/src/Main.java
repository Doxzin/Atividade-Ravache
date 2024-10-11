public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        System.out.println();
        Tenis Tenis = new Tenis("Tenis", 1200.00);
        Relogio Relogio = new Relogio("Relogio", 120.00);

        estoque.adicionarProduto(Tenis);
            estoque.adicionarProduto(Relogio);

        estoque.exibirPrecosComDesconto(20.0);
    }
}
