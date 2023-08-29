import java.util.ArrayList;

public class Equilatero extends Triangulo{
    private final ArrayList<Double> lados;

    public Equilatero(String nome,ArrayList<Double> lados) {
        super(nome);
        this.lados = lados;
        equilateros.add(this);
        formas.add(this);
        triangulos.add(this);

    }


    @Override
    double calculaPerimetro() {
        return this.lados.get(0)*3;
    }

    @Override
    double calculaArea() {
        return ((Math.sqrt(3))/4)*(this.lados.get(0)*this.lados.get(0));
    }

}
