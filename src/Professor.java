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
            System.out.println("Equilatero adicionado com sucesso!");
            Forma equilatero = new Equilatero("Equilatero",lados);
        }else if((lados.get(0).equals(lados.get(1))) || (lados.get(0).equals(lados.get(2))) || (lados.get(1).equals(lados.get(2)))){
            System.out.println("Isoceles adicionado com sucesso!");
            Forma isoceles = new Isoceles("Isoceles",lados);
        }else if(!lados.get(0).equals(lados.get(1)) && !lados.get(0).equals(lados.get(2))){
            System.out.println("Escaleno adicionado com sucesso!");
            Forma escaleno = new Escaleno("Escaleno",lados);
        }
    }
}
