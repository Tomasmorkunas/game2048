import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private Map map;
    private GameRules gameRules;
    private KeyHandler keyHandler;
    private Tile tile;
    private Score score;

    public GameLogic() {
        this.map = new Map(this);
        this.gameRules = new GameRules(this);
        this.keyHandler = new KeyHandler(this);
        this.tile = new Tile(this);
        this.score = new Score(this);
    }
    void pridetiRandomPlyteles() {
        int pozicija1=0;
        int pozicija2=0;
        int pozicija3=0;
        int pozicija4=0;

        Random rand = new Random();
        pozicija1 = rand.nextInt(4);
        pozicija2 = rand.nextInt(4);

        while (true)
        {
            pozicija3 = rand.nextInt(4);
            pozicija4 = rand.nextInt(4);
            if (pozicija1 != pozicija3 && pozicija2 != pozicija4) //negali buti tos pacios pozicijos 2 blokam
                break;
        }

        tile.manualPridetiBloka(pozicija1, pozicija2, 2); //1 skaiciaus x ir y pozicijos paleidus zaidima
        tile.manualPridetiBloka(pozicija3, pozicija4, 4); //2 skaiciaus x ir y pozicijos paleidus zaidima

        map.atvaizduoti();
    }

    public Map getMap() {
        return map;
    }

    public GameRules getGameRules() {
        return gameRules;
    }

    public KeyHandler getKeyHandler() {
        return keyHandler;
    }

    public Tile getTile() {
        return tile;
    }

    public Score getScore() {
        return score;
    }

    public void apdorotiZaidimoLogika() {
        char klavisas;
        map.padarytiMapKopija();

        Scanner s= new Scanner(System.in);
        klavisas = s.next().charAt(0);
        keyHandler.userInput(klavisas);

        if (!gameRules.arReikiaPridetiNaujaTile())
        {
            tile.autoPridetiBloka();
        }

        map.atvaizduoti();

        gameRules.arZaidimasBaigtas();
    }
}
