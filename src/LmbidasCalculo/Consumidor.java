package LmbidasCalculo;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("caneta", 12.69, 0.09);
        imprimir.accept(p1);
    }
}
