import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Professor professor = new Professor("123");
        System.out.println("""
                ----- Bem vindo -----
                [1] Entrar - Senha: '123'
                [2] logout
                ---------------------""");
        System.out.print("> ");
        int escolhaEntrada = sc.nextInt();
        switch (escolhaEntrada){
            case 1 -> {
                verificaLogin(professor);
            }
            case 2 -> {
                System.exit(0);
            }
            default -> {
                System.out.println("""
                        
                       ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                       ░░░█▀▀ ░█▀█ ░█ ░█▀▀ ░░█▀▀ ░█▀█ ░█ ░█ ░░░
                       ░░░█▀▀ ░█▀▀ ░█ ░█ ░░░░█▀▀ ░█▀█ ░█ ░█ ░░░
                       ░░░▀▀▀ ░▀ ░░░▀ ░▀▀▀ ░░▀ ░░░▀░▀ ░▀ ░▀▀▀ ░
                       ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                        
                        """);
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
        int escolhaForma = 0;
        do{
            System.out.println("""
                --- Qual forma geometrica deseja calcular ---
                
                                [1] Quadrado
                                [2] Retangulo
                                [3] Circulo
                                [4] Triangulo
                                
                                [5] Listar Formas
                                [6] Sair
                
                ---------------------------------------------""");
            System.out.print(">  ");
            escolhaForma = sc.nextInt();

            switch (escolhaForma){
                case 1 -> {
                    ArrayList<Double> lados = new ArrayList<>();
                    System.out.println("Digite a medida de um lado do quadrado: ");
                    lados.add(sc.nextDouble());
                    System.out.println("Quadrado adicionado com sucesso!");
                    Forma quadrado = new Quadrado("Quadrado",lados);
                }

                case 2 -> {
                    ArrayList<Double> lados = new ArrayList<>();
                    System.out.println("Digite a medida de um lado do retangulo: ");
                    lados.add(sc.nextDouble());
                    System.out.println("Digite a medida de outro lado do retangulo: ");
                    lados.add(sc.nextDouble());
                    System.out.println("Retangulo adicionado com sucesso!");
                    Forma retangulo = new Retangulo("Retangulo",lados);
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
                                Forma circulo = new Circulo("Circulo",0, raio);
                            }
                        }

                        case 2 -> {
                            System.out.print("o valor do diametro: ");
                            double diametro = sc.nextDouble();
                            if(diametro != 0){
                                System.out.println("Circulo adicionado com sucesso!");
                                Forma circulo = new Circulo("Circulo",diametro, 0);

                            }
                        }

                        default -> {
                            System.out.println("Valor invalido");
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

                case 5 -> {
                    menuListarFormas(professor);
                }

                case 6 -> {
                    System.out.println("Voce escolheu sair");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Escolha uma opcao valida");
                }
            }
        }while(escolhaForma!=6);
    }

    private static void menuListarFormas(Professor professor) {
        int escolha=0;
        do{
            System.out.println("""
                    \n--- Qual forma voce pretende listar? ---
                        [1] Circulo
                        [2] Quadrado
                        [3] Retangulo
                        [4] Triangulo
                        [5] Todas as formas
                        
                        [6] Voltar para o cadastro das formas
                        [7] Sair
                        ------------------------------------
                    """);
            escolha = sc.nextInt();

            switch (escolha){
                case 1-> {
                    for (Forma circulo:
                        Forma.circulos) {
                        System.out.println(circulo.toString());
                    }
                }
                case 2-> {
                    for (Forma quadrado:
                            Forma.quadrados) {
                        System.out.println(quadrado.toString());
                    }
                }
                case 3-> {
                    for (Forma retangulo:
                            Forma.retangulos) {
                        System.out.println(retangulo.toString());
                    }
                }
                case 4-> {
                    int opcao = 0;
                    do{
                        System.out.println("""
                                --- Qual triangulo deseja listar ---
                                
                                            [1] Isoceles
                                            [2] Equilatero
                                            [3] Escaleno
                                            
                                            [4] Todos
                                ------------------------------------""");
                        opcao = sc.nextInt();
                        switch (opcao){
                            case 1 -> {
                                for (Forma isoceles:
                                        Triangulo.isoceless) {
                                    System.out.println(isoceles.toString());
                                }
                            }

                            case 2 -> {
                                for (Forma equilatero:
                                        Triangulo.equilateros) {
                                    System.out.println(equilatero.toString());
                                }
                            }

                            case 3 -> {
                                for (Forma escaleno:
                                        Triangulo.escalenos) {
                                    System.out.println(escaleno.toString());
                                }
                            }

                            case 4 -> {
                                for (Forma triangulo:
                                        Forma.triangulos) {
                                    System.out.println(triangulo.toString());
                                }
                            }

                            default -> {
                                System.out.println("Escolha uma opção valida");
                            }
                        }
                    }while(opcao<0 || opcao>4);
                }

                case 5 -> {
                    for (Forma forma:
                            Forma.formas) {
                        System.out.println(forma.toString());
                    }
                }

                case 6 -> {
                    return;
                }

                case 7 -> {
                    System.out.println("Voce escolheu sair");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Escolha uma opção valida");
                }
            }
         }while(escolha<1 || escolha>5);
    }
}
