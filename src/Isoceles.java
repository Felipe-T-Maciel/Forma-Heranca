import java.util.ArrayList;
import java.lang.Math;

public class Isoceles extends Triangulo{
    private final ArrayList<Double> lados;
    public Isoceles(double area, double perimetro, ArrayList<Double> lados) {
        super(area, perimetro);
        this.lados = lados;
    }

    @Override
    void calculaPerimetro() {

    }

    @Override
    void calculaArea() {
        double altura = Math.sqrt((ladoIgual()*ladoIgual())-((ladoDiferente()*ladoDiferente())))
        double area =
    }


    private double ladoDiferente(){
        double ladoDiferente = 0.0;

        if(this.lados.get(0).equals(this.lados.get(1)) && !this.lados.get(0).equals(this.lados.get(2))){
            ladoDiferente = this.lados.get(2);
        }else if(this.lados.get(0).equals(this.lados.get(2)) && !this.lados.get(0).equals(this.lados.get(1))){
            ladoDiferente = this.lados.get(1);

        }else if(this.lados.get(1).equals(this.lados.get(2)) && !this.lados.get(1).equals(this.lados.get(0))){
            ladoDiferente = this.lados.get(0);
        }

        return ladoDiferente;
    }

    private double ladoIgual() {
        double ladoigual = 0.0;
        if(this.lados.get(0).equals(this.lados.get(1)) && !this.lados.get(0).equals(this.lados.get(2))){
            ladoigual = this.lados.get(0);
        }else if(this.lados.get(0).equals(this.lados.get(2)) && !this.lados.get(0).equals(this.lados.get(1))){
            ladoigual = this.lados.get(2);

        }else if(this.lados.get(1).equals(this.lados.get(2)) && !this.lados.get(1).equals(this.lados.get(0))){
            ladoigual = this.lados.get(1);
        }
        return ladoigual;
    }
}