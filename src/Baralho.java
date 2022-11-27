public class Baralho {
    public Carta[] cartas = new Carta[52];
    int numCartas;
    public Baralho(Carta[] cartas) {
        this.cartas[0] = new Carta("2", "♥");
        this.cartas[1] = new Carta("3", "♥");
        this.cartas[2] = new Carta("4", "♥");
        this.cartas[3] = new Carta("5", "♥");
        this.cartas[4] = new Carta("6", "♥");
        this.cartas[5] = new Carta("7", "♥");
        this.cartas[6] = new Carta("8", "♥");
        this.cartas[7] = new Carta("9", "♥");
        this.cartas[8] = new Carta("10", "♥");
        this.cartas[9] = new Carta("J", "♥");
        this.cartas[10] = new Carta("Q", "♥");
        this.cartas[11] = new Carta("K", "♥");
        this.cartas[12] = new Carta("A", "♥");

        this.cartas[13] = new Carta("2", "♣");
        this.cartas[14] = new Carta("3", "♣");
        this.cartas[15] = new Carta("4", "♣");
        this.cartas[16] = new Carta("5", "♣");
        this.cartas[17] = new Carta("6", "♣");
        this.cartas[18] = new Carta("7", "♣");
        this.cartas[19] = new Carta("8", "♣");
        this.cartas[20] = new Carta("9", "♣");
        this.cartas[21] = new Carta("10", "♣");
        this.cartas[22] = new Carta("J", "♣");
        this.cartas[23] = new Carta("Q", "♣");
        this.cartas[24] = new Carta("K", "♣");
        this.cartas[25] = new Carta("A", "♣");

        this.cartas[26] = new Carta("2", "♦");
        this.cartas[27] = new Carta("3", "♦");
        this.cartas[28] = new Carta("4", "♦");
        this.cartas[29] = new Carta("5", "♦");
        this.cartas[30] = new Carta("6", "♦");
        this.cartas[31] = new Carta("7", "♦");
        this.cartas[32] = new Carta("8", "♦");
        this.cartas[33] = new Carta("9", "♦");
        this.cartas[34] = new Carta("10", "♦");
        this.cartas[35] = new Carta("J", "♦");
        this.cartas[36] = new Carta("Q", "♦");
        this.cartas[37] = new Carta("K", "♦");
        this.cartas[38] = new Carta("A", "♦");

        this.cartas[39] = new Carta("2", "♠");
        this.cartas[40] = new Carta("3", "♠");
        this.cartas[41] = new Carta("4", "♠");
        this.cartas[42] = new Carta("5", "♠");
        this.cartas[43] = new Carta("6", "♠");
        this.cartas[44] = new Carta("7", "♠");
        this.cartas[45] = new Carta("8", "♠");
        this.cartas[46] = new Carta("9", "♠");
        this.cartas[47] = new Carta("10", "♠");
        this.cartas[48] = new Carta("J", "♠");
        this.cartas[49] = new Carta("Q", "♠");
        this.cartas[50] = new Carta("K", "♠");
        this.cartas[51] = new Carta("A", "♠");

        numCartas = 52;

    }
    public void embaralhar() {
        for (int i = 0; i < numCartas; i++) {
            Carta temp = cartas[i];
            int tempi = (int) (Math.random() * numCartas);
            cartas[i] = cartas[tempi];
            cartas[tempi] = temp;
            i++;

        }
    }
    public Carta Darcarta() {
        numCartas--;
        return cartas[numCartas];
    }
    public void imprimirBaralho() {
        //Baralho t = new Baralho();
        int i = 0;
        while (i < numCartas) {
            System.out.print(cartas[i].getNaipe());
            System.out.println(cartas[i].getNome());
            i++;
        }

    }

}