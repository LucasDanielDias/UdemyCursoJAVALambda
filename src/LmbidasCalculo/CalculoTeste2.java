package LmbidasCalculo;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.execultar(2,3));
        soma = (x,y) -> x * y;
        System.out.println(soma.execultar(2,3));
        //exemplo de função lambida
    }
}
