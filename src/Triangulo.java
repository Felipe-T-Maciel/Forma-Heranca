import java.util.ArrayList;

public abstract class Triangulo extends Forma {
    static public ArrayList<Forma> isoceless = new ArrayList<>();
    static public ArrayList<Forma> equilateros = new ArrayList<>();
    static public ArrayList<Forma> escalenos = new ArrayList<>();

    public Triangulo(String nome) {super(nome);}

    abstract double calculaPerimetro();

    abstract double calculaArea();
}
