import java.util.ArrayList;
import java.util.List;

public class Baralho {
    //52 cartas com 4 naipes cada um com treze cartas, ás,2,3,4,5,6,7,8,9,10,J,Q,K
    private final List<Carta> listaCartas;

    public Baralho(List<Carta> listaCartas) {
        this.listaCartas=listaCartas;
        listaCartas = new ArrayList<>();
        String[] naipes = {"♣","♦", "♥","♠"};
        int n = 0;
        Carta carta;

        while (n < 4){
            for (int i = 1; i <= 10; i ++){
                carta = new Carta();
                carta.setNome(i + "");
                carta.setNaipe(naipes[n]);

                listaCartas.add(carta);
            }

            carta = new Carta();
            carta.setNome("Valete");
            carta.setNaipe(naipes[n]);
            listaCartas.add(carta);

            carta = new Carta();
            carta.setNome("Dama");
            carta.setNaipe(naipes[n]);
            listaCartas.add(carta);

            carta = new Carta();
            carta.setNome("Rei");
            carta.setNaipe(naipes[n]);
            listaCartas.add(carta);

            carta = new Carta();
            carta.setNome("Ás");
            carta.setNaipe(naipes[n]);
            listaCartas.add(carta);

            n++;
        }
    }
    public void imprimeBaralho(){
        StringBuilder sb = new StringBuilder();

        listaCartas.forEach((carta) -> {
            sb.append("Carta: ").append(carta.getNome()).append(" | Naipe: ").append(carta.getNaipe()).append("\n");
        });

        System.out.println(sb.toString());
    }

}
