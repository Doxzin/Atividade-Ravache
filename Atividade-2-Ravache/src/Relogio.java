public class Relogio extends Produto {
    public Relogio(String nome, double preco){
        super(nome, preco);
    }
    @Override
    public double calcularDes(double porcentagem){
        double descontoExtra = 10;
        return preco - (preco * (porcentagem + descontoExtra) / 100);
    }
}

