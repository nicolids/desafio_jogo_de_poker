import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesa {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Jogador jogador = new Jogador(null,0);


        System.out.println("Quantos jogadores há na mesa?");
        int numJogadores = src.nextInt();
        List<Jogador> jogadores = new ArrayList<>(numJogadores);

        if(numJogadores >= 2 && numJogadores <= 8) {
            for (int jog = 0; jog <= numJogadores-1; jog++) {
                jogadores.add(jogador);
            }
            System.out.println(jogadores);
        }
        else System.out.println("Jogadores insuficientes ou em excesso!");



        Carta[] cartas = new Carta[52];
        Baralho baralho = new Baralho(cartas);
        baralho.imprimirBaralho();

        for (int i=0; i<= 5; i++){
            baralho.embaralhar();
        }
        System.out.println("As cartas foram embaralhadas: ");
        baralho.imprimirBaralho();







    }
}
