import java.util.Arrays;

public class Jogador {

    private Carta[] cartas = new Carta[2];


    int numCartas = 0;

    public Jogador(Carta[] cartas, int identificador) {
        this.cartas = cartas;

    }

    public Carta recebeCarta(){
        numCartas++;
        return cartas[numCartas];
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }


    @Override
    public String toString() {
        return "Jogador{" +
                "cartas=" + Arrays.toString(cartas) +
                '}';
    }
}
