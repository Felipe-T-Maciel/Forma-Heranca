import java.util.ArrayList;

public class Retangulo extends Forma {
    private final ArrayList<Double> lados;
    public Retangulo(double area, double perimetro, ArrayList<Double> lados) {
        super(area, perimetro);
        this.lados = lados;
    }

    @Override
    void calculaPerimetro() {
        double perimetro = 2*(this.lados.get(0) + this.lados.get(1));
        this.setPerimetro(perimetro);
    }

    @Override
    void calculaArea() {
        double area = this.lados.get(0)*this.lados.get(1);
        this.setArea(area);
    }
}
