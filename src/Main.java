import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador j1 = new Jogador();

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



     }
}


