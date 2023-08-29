import java.util.ArrayList;

abstract public class Forma {
    static public ArrayList<Forma> formas = new ArrayList<>();
    static public ArrayList<Forma> circulos = new ArrayList<>();
    static public ArrayList<Forma> quadrados = new ArrayList<>();
    static public ArrayList<Forma> retangulos = new ArrayList<>();
    static public ArrayList<Forma> triangulos = new ArrayList<>();
    private String nome;
    public Forma(String nome){this.nome = nome;}

    abstract double calculaPerimetro();

    abstract double calculaArea();

    @Override
    public String toString() {
        return ""+this.nome+" {" +
                "area=" + this.calculaArea() +
                ", perimetro=" + this.calculaPerimetro() +
                '}';
    }
}
