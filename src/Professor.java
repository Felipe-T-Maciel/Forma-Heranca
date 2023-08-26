import java.util.ArrayList;

public class Professor {
    private String senha;
    public Professor(String senha){
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void diferenciarTriangulo(ArrayList<Double> lados) {
        if(lados.get(0).equals(lados.get(1)) && lados.get(1).equals(lados.get(2))){
            Forma equilatero = new Equilatero(0,0,lados);
            Forma.formas.add(equilatero);

        }else if(!lados.get(0).equals(lados.get(1)) && lados.get(0).equals(lados.get(2)) || lados.get(1).equals(lados.get(2))){
            Forma isoceles = new Isoceles(0,0,lados);
            Forma.formas.add(isoceles);

        }else if(!lados.get(0).equals(lados.get(1)) && !lados.get(0).equals(lados.get(2))){
            Forma escaleno = new Escaleno(0,0,lados);
            Forma.formas.add(escaleno);

        }

    }

    public void listarFormas() {
        for (Forma forma :
               Forma.formas ) {
            System.out.println(forma.toString());
        }
    }
}
