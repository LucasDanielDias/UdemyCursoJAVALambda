package LmbidasCalculo;

public class Mod implements Calculo{
    @Override
    public double execultar(double a, double b) {
        return  a % b;
    }
}
