import java.util.ArrayList;

public class Quadrado extends Forma {
    private final ArrayList<Double> lados;

    public Quadrado(String nome,ArrayList<Double> lados) {
        super(nome);
        this.lados = lados;
        quadrados.add(this);
        formas.add(this);

    }


    @Override
    double calculaPerimetro() {
        return this.lados.get(0)*4;
    }

    @Override
    double calculaArea() {
        return this.lados.get(0)* this.lados.get(0);
    }

}
