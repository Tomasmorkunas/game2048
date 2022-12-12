public class KeyHandler {
    private GameLogic gameLogic;

    public KeyHandler(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    void userInput(char klavisas) {
        if (klavisas == 119) //W
            gameLogic.getTile().judetiIVirsu();
        if (klavisas == 115) //S
            gameLogic.getTile().judetiIApacia();
        if (klavisas == 97) //A
            gameLogic.getTile().judetiIKaire();
        if (klavisas == 100) //D
            gameLogic.getTile().judetiIDesine();
        if (klavisas == 113) //Q
            gameLogic.getGameRules().setGameOver(true);
    }
}
