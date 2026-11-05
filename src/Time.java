import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String sigla;
    private String cidade;
    private String nick;
    private int nivel;
    private int pontos;
    private List<Jogador>  elenco = new ArrayList<>();

    public  Time(String nome, String sigla, String cidade) {
        this.nome = nome;
        this.sigla = sigla.toUpperCase();
        this.cidade = cidade;
    }
    public String getNome() {return nome; }
    public String getSigla() {return sigla; }
    public String getCidade() {return cidade; }
    public String getNick() {return nick; }
    public int getNivel() {return nivel; }
    public int getPontos() {return pontos; }
    public List<Jogador> getElenco() {return elenco; }

    public void adicionarpontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }
    public boolean adicionarJogador(Jogador Jogador) {
        if (elenco.size() >= 5) {
            return false; //time cheio
        }
        elenco.add(Jogador);
        return true;
    }
    public void exibirInfo(){
        System.out.printf("[%s] %s - %s - %d pts%n", sigla, nome, cidade, pontos);
        if (elenco.isEmpty()){
            System.out.println("    (sem jogadores)");
        }
        for (Jogador j : elenco) {
            System.out.printf("  - %s (nível %d)%n");
        }
    }
}
