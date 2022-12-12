public class Map {
    private int eiluciu = 4, stulpeliu = 4;
    int[][] plyteles = new int[eiluciu][stulpeliu];
    int[][] plytelesKopija = new int[eiluciu][stulpeliu];
    private GameLogic gameLogic;
    public Map(GameLogic gameLogic) {
        this.gameLogic = gameLogic;

    }

    public int[][] getPlyteles() {
        return plyteles;
    }

    void atvaizduoti()
    {
        System.out.print("Zaidimas 2048\n\n");
        System.out.print("Paspauskite Esc, noredami nutraukti zaidima.\n");
        System.out.print("\n\n");

        //dvimatis masyvas, skirtas uzpildyti lentele eilutemis ir stulpeliais
        for (int i = 0; i < 4; i++)
        {
            System.out.print("*****************\n");
            for (int j = 0; j < 4; j++)
            {
                if (plyteles[i][j] == 0) System.out.print("|   ");
                else
                    System.out.print("| "+plyteles[i][j]+ " ");
            }
            System.out.print("|\n");
        }
        System.out.print("*****************\n");

        System.out.print("\n\n");
        System.out.print("Taskai: "+ gameLogic.getScore().getTaskai());
    }

    public void padarytiMapKopija() {
        for (int i = 0; i < eiluciu; i++)
            for (int j = 0; j < stulpeliu; j++)
                plytelesKopija[i][j] = plyteles[i][j];
    }
}
