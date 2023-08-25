public class Circulo extends Forma {
    private double diametro;
    private double raio;

    public Circulo(double area, double perimetro, double diametro, double raio) {
        super(area, perimetro);
        if(raio == 0) {
            this.raio = diametro/2;
        }
        else {
            this.diametro = raio*2;
        }
    }

    @Override
    void calculaPerimetro() {
        double perimetro = 3.14*this.diametro;
        this.setPerimetro(perimetro);
    }

    @Override
    void calculaArea() {
        double area = 3.14*(this.raio*this.raio);
        this.setArea(area);
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRaio() {
        return raio;
    }

}
