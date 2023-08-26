import java.util.ArrayList;

public class Escaleno extends Triangulo{
    private final ArrayList<Double> lados;
    public Escaleno(double area, double perimetro, ArrayList<Double> lados) {
        super(area, perimetro);
        this.lados = lados;
    }


    @Override
    void calculaPerimetro() {
       this.setPerimetro(this.lados.get(0) + this.lados.get(1) + this.lados.get(2));
    }

    public double calculaSemiperimetro(){
        return this.getPerimetro()/2;
    }

    @Override
    void calculaArea() {
        this.setArea(Math.sqrt(calculaSemiperimetro()*(calculaSemiperimetro()-this.lados.get(0))*(calculaSemiperimetro()-this.lados.get(1))*(calculaSemiperimetro()-this.lados.get(2))));
    }

    @Override
    public String toString() {
        return "Escaleno{" +
                "Area: "+this.getArea()+
                "Perimetro: "+this.getPerimetro()+
                '}';
    }
}
