package LmbidasCalculo;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo somar = new Soma();
        Calculo multplicar = new Multiplicar();
        Calculo dividir = new Dividir();
        Calculo mod = new Mod();

        System.out.println(somar.execultar(2,3));
        System.out.println(multplicar.execultar(5,8));
        System.out.println(dividir.execultar(4,2));
        System.out.println(mod.execultar(8,3));
        //exemplo função normal
    }
}
