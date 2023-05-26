package LmbidasCalculo;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        Produto prod = new Produto("Notebook", 5000.0, 0.15);
        System.out.println(isCaro.test(prod));

    }
}
