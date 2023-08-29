import java.util.ArrayList;
import java.lang.Math;

public class Isoceles extends Triangulo{
    private final ArrayList<Double> lados;

    public Isoceles(String nome,ArrayList<Double> lados) {
        super(nome);
        this.lados = lados;
        isoceless.add(this);
        formas.add(this);
        triangulos.add(this);

    }

    @Override
    double calculaPerimetro() {
        return  (ladoDiferente()+2)*ladoIgual();
    }

    @Override
    double calculaArea() {
        double altura = Math.sqrt((ladoIgual()*ladoIgual())-((ladoDiferente()*ladoDiferente())/4));
        return  (ladoDiferente()*altura)/2;
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
