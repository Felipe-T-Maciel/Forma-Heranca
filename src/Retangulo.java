import java.util.ArrayList;

public class Retangulo extends Forma {
    private final ArrayList<Double> lados;

    public Retangulo(String nome,ArrayList<Double> lados) {
        super(nome);
        this.lados = lados;
        retangulos.add(this);
        formas.add(this);
    }

    @Override
    double calculaPerimetro() {
        return 2*(this.lados.get(0) + this.lados.get(1));
    }

    @Override
    double calculaArea() {
        return this.lados.get(0)*this.lados.get(1);
    }

}
