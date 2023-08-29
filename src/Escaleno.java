import java.util.ArrayList;

public class Escaleno extends Triangulo{
    private final ArrayList<Double> lados;

    public Escaleno(String nome,ArrayList<Double> lados) {
        super(nome);
        this.lados = lados;
        Forma.formas.add(this);
        escalenos.add(this);
        triangulos.add(this);

    }


    @Override
    double calculaPerimetro() {
       return this.lados.get(0) + this.lados.get(1) + this.lados.get(2);
    }

    public double calculaSemiperimetro(){
        return this.calculaPerimetro()/2;
    }

    @Override
    double calculaArea() {
        return Math.sqrt(calculaSemiperimetro()*(calculaSemiperimetro()-this.lados.get(0))*(calculaSemiperimetro()-this.lados.get(1))*(calculaSemiperimetro()-this.lados.get(2)));
    }

}
