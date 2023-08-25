import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Professor professor = new Professor("123");
        System.out.println("""
                ----- Bem vindo -----
                [1] Entrar
                [2] Cadastrar novo professor
                [3] logout
                ---------------------""");
        System.out.print("> ");
        int escolhaEntrada = sc.nextInt();
        switch (escolhaEntrada){
            case 1 -> {
                verificaLogin(professor);
            }
            case 2 -> {
                cadastrarNovoProfessor();
            }
            case 3 -> {
                System.exit(0);
            }
        }
    }

    private static void cadastrarNovoProfessor() {}

    private static void verificaLogin(Professor professor) {
        System.out.println("Sua senha: ");
        String senha = sc.next();

        if(senha.equals(professor.getSenha())){
            System.out.println("Login efetuado com sucesso!");
            menuFormas(professor);
        }
    }

    private static void menuFormas(Professor professor) {
        System.out.println("""
                --- Qual forma geometrica deseja calcular ---
                
                                [1] Quadrado
                                [2] Retangulo
                                [3] Circulo
                                [4] Triangulo
                
                ---------------------------------------------""");
        System.out.print(">  ");
        int escolhaForma = sc.nextInt();

        switch (escolhaForma){
            case 1 -> {
                ArrayList<Double> lados = new ArrayList<>();
                System.out.println("Digite a medida de um lado do quadrado: ");
                lados.add(sc.nextDouble());
                Forma quadrado = new Quadrado(0 ,0, lados);
                quadrado.calculaArea();
            }

            case 2 -> {
                ArrayList<Double> lados = new ArrayList<>();
                System.out.println("Digite a medida de um lado do retangulo: ");
                lados.add(sc.nextDouble());
                System.out.println("Digite a medida de outro lado do retangulo: ");
                lados.add(sc.nextDouble());
                Forma retangulo = new Retangulo(0 ,0, lados);
                retangulo.calculaArea();
            }

            case 3 -> {

                System.out.println("""
                        --- Qual voce pretende informar? ---
                        [1] Raio
                        [2] Diametro
                        ------------------------------------""");
                System.out.print("> ");
                int escolhaOpcaoCirculo = sc.nextInt();

                switch (escolhaOpcaoCirculo){
                    case 1 -> {
                        System.out.print("O valor do raio: ");
                        double raio = sc.nextDouble();
                        if(raio != 0){
                            System.out.println("Circulo adicionado com sucesso!");
                            Forma circulo = new Circulo(0 ,0, 0, raio);
                            circulo.calculaArea();
                        }
                    }

                    case 2 -> {
                        System.out.print("o valor do diametro: ");
                        double diametro = sc.nextDouble();
                        if(diametro != 0){
                            System.out.println("Circulo adicionado com sucesso!");
                            Forma circulo = new Circulo(0 ,0, diametro, 0);
                            circulo.calculaArea();
                        }
                    }
                }
            }

            case 4 -> {
                ArrayList<Double> lados = new ArrayList<>();
                System.out.println("Digite a medida do primeiro lado do triangulo: ");
                lados.add(sc.nextDouble());
                System.out.println("Digite a medida do segundo lado do triangulo: ");
                lados.add(sc.nextDouble());
                System.out.println("Digite a medida do terceiro lado do triangulo: ");
                lados.add(sc.nextDouble());
                professor.diferenciarTriangulo(lados);
            }
        }
    }
}
