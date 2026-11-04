public class Jogador {
    String nome;
    int idade;
    String NickName;
    String JogoFavorito;
    int level;
    int vitorias;
    int derrotas;

    double calcularPorcentagemVitorias() {
        int total = vitorias + derrotas;

        if (total == 0) {
            return 0;
        }

        return (double) vitorias / total * 100;
    }


    double calcularPorcentagemDerrotas() {
        int total = vitorias + derrotas;

        if (total == 0) {
            return 0;
        }
        return (double) derrotas / total * 100;
       }
    }

