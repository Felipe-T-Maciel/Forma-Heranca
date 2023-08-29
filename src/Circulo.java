import java.util.ArrayList;

public class Circulo extends Forma {
    private double diametro;
    private double raio;
    public Circulo(String nome,double diametro, double raio) {
        super(nome);
        if(raio == 0) {
            this.raio = diametro/2;
        }
        else {
            this.diametro = raio*2;
        }
        circulos.add(this);
        formas.add(this);

    }

    @Override
    double calculaPerimetro() {
        return 3.14*this.diametro;
    }

    @Override
    double calculaArea() {
        return 3.14*(this.raio*this.raio);
    }



}
