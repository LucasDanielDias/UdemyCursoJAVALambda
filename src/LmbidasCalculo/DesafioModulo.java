package LmbidasCalculo;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioModulo {
    public static void main(String[] args) {
        Produto p = new Produto("laptop",5896.3,0.15);
        Function<Produto,Double> precoFinal;
        UnaryOperator<Double> precoF = n -> p.preco + (p.preco * p.desconto);
        BinaryOperator<Double,Double> Resultado = BinaryOperator<Double> p.preco >= 3000.0 ? p.preco + (p.preco * 0.19):p.preco + (p.preco * 0.08);
    }
}
