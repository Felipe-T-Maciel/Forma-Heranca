import java.util.ArrayList;

public abstract class Triangulo extends Forma {
    public Triangulo(double area, double perimetro) {
        super(area, perimetro);
    }

    abstract void calculaPerimetro();

    abstract void calculaArea();
}
