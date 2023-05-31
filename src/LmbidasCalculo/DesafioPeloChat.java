package LmbidasCalculo;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioPeloChat {
    public static void main (String[] args) {
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> ipostoMunicipal = preco -> preco >= 2500.0 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 1000.0 ? preco + 300 : preco + 100;


        Function<Double, Double> formatar = preco -> Double.valueOf(("R$"+ preco));
        Function<String, String> format = preco -> (preco).replace(".",",");

        Produto p = new Produto("oPad", 3000, 0.1);
        String preco = String.valueOf(precoFinal.andThen(ipostoMunicipal).andThen(frete).andThen(formatar).apply(p));
        System.out.println("O preço final é " + preco);
    }
}