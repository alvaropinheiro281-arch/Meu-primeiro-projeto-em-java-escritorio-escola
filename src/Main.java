import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador j1 = new Jogador();

        System.out.println("=== CADASTRO DE JOGADOR ===");
        System.out.println("Digite seu nome:");
        j1.nome = sc.nextLine();
        System.out.println("Digite seu NickName:");
        j1.NickName = sc.nextLine();
        System.out.println("Digite seu Jogo Favorito:");
        j1.JogoFavorito = sc.nextLine();
        System.out.println("Digite sua idade");
        j1.idade = sc.nextInt();
        System.out.println("Digite seu level");
        j1.level = sc.nextInt();
        System.out.println("Digite seu numero de vitorias:");
        j1.vitorias = sc.nextInt();
        System.out.println("Digite seu numero de derrotas:");
        j1.derrotas = sc.nextInt();
        System.out.println("Vitorias: " + j1.vitorias);
        System.out.println("Derrotas: " + j1.derrotas);
        System.out.printf("Porcentagem de vitorias: %.2f%%\n ",
                j1.calcularPorcentagemVitorias());
        System.out.printf("Porcentagem de derrotas: %.2f%%\n ",
                j1.calcularPorcentagemDerrotas());






     }
}


