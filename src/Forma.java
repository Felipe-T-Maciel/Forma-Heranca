import java.util.ArrayList;

abstract public class Forma {
    static public ArrayList<Forma> formas = new ArrayList<>();
    private double area;
    private double perimetro;

    public Forma(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }

    abstract void calculaPerimetro();

    abstract void calculaArea();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
