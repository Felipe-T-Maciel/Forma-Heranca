import java.util.ArrayList;

public class Quadrado extends Forma {
    private final ArrayList<Double> lados;
    public Quadrado(double area, double perimetro, ArrayList<Double> lados) {
        super(area, perimetro);
        this.lados = lados;
    }


    @Override
    void calculaPerimetro() {
        double perimetro = this.lados.get(0)*4;
        this.setPerimetro(perimetro);
    }

    @Override
    void calculaArea() {
        double area = this.lados.get(0)* this.lados.get(0);
        this.setArea(area);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Area: "+this.getArea()+
                "Perimetro: "+this.getPerimetro()+
                '}';
    }
}
