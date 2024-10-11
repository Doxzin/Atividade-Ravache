public class Tenis extends Produto {
    public Tenis(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularDes(double porcentagem){
        double descontoExtra = 15;
        return preco - (preco * (porcentagem + descontoExtra) / 100);
    }
}
