package LmbidasCalculo;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.Double.parseDouble;

public class DesafioModulo {
    public static void main(String[] args) {
        Function<Produto,Double> precoFinal = produto -> produto.preco* (1- produto.desconto);
        UnaryOperator<Double>ipostoMunicipal = preco ->preco >= 2500.0 ? preco * 1.085: preco;
        UnaryOperator<Double>frete = preco -> preco >= 3000.0? preco + 300 : preco + 100;

        Function<Double, Double> arredondar = preco -> parseDouble(String.format("%.2f", preco));

        Function<Double,String>formatar = preco-> ("R$"+preco).replace(".",",");



    }
}
