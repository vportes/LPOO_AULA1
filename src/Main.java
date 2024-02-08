import java.util.Scanner;

public class Main {
    static int i = 0;
    static Scanner sc = new Scanner(System.in);
    static Filme[] filmes = new Filme[100];

    static void Cadastrar() {
        System.out.println("Codigo do filme = " + (i+1));
        int codigo = i;
        sc.nextLine();
        System.out.print("Digite o nome do filme: ");
        String nome = sc.nextLine();
        System.out.print("Digite o gênero do filme: ");
        char genero = sc.nextLine().charAt(0);
        System.out.print("Digite a avaliação do filme: ");
        double avaliacao = sc.nextDouble();
        System.out.print("Digite o preço do filme: ");
        double preco = sc.nextDouble();
        System.out.print("Digite o ano de lançamento: ");
        int ano = sc.nextInt();
        System.out.print("Digite a duração do filme em minutos: ");
        int duracao = sc.nextInt();
        filmes[i] = new Filme(codigo, nome, genero, avaliacao, preco, ano, duracao);
        i++;
    }

    static void Pesquisar(){
        System.out.print("Digite o código do filme: ");
        int pesquisar = (sc.nextInt()-1);
        System.out.println(filmes[pesquisar]);
    }

    static void Avaliar(){
        System.out.print("Digite o código do filme: ");
        int indice = (sc.nextInt()-1);
        System.out.println("Filme: "+filmes[indice].getNome());
        System.out.println("Avalie o filme: ");
        double avaliacao = sc.nextDouble();
        filmes[indice].setAvaliacao(avaliacao);
        System.out.println("Nova avaliação: "+ filmes[indice].getAvaliacao());
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Avaliar");
            System.out.println("9 - Finalizar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            switch(opcao) {
                case 1 :
                    Cadastrar();
                    break;
                case 2 :
                    Pesquisar();
                    break;
                case 3 :
                    Avaliar();
                    break;
                case 9 :
                    System.out.println("Programa finalizado");
                    break;
                default :
                    System.out.println("Opção não encontrada");
                    break;
            }
        }
    }
}