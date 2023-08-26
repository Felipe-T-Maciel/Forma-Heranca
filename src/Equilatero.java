import java.util.ArrayList;

public class Equilatero extends Triangulo{
    private final ArrayList<Double> lados;
    public Equilatero(double area, double perimetro, ArrayList<Double> lados) {
        super(area, perimetro);
        this.lados = lados;
    }


    @Override
    void calculaPerimetro() {
        this.setPerimetro(this.lados.get(0)*3);
    }

    @Override
    void calculaArea() {
        this.setArea(((Math.sqrt(3))/4)*(this.lados.get(0)*this.lados.get(0)));
    }

    @Override
    public String toString() {
        return "Equilatero{" +
                "Area: "+this.getArea()+
                "Perimetro: "+this.getPerimetro()+
                '}';
    }
}
