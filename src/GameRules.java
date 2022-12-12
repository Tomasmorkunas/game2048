public class GameRules {
    private boolean gameOver;
    private GameLogic gameLogic;

    public GameRules(GameLogic gameLogic) {
        this.gameOver = false;
        this.gameLogic = gameLogic;
    }

    public boolean getGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    void arZaidimasBaigtas(){
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (gameLogic.getMap().getPlyteles()[i][j] == 0) //jeigu dar yra neuzimtu poziciju zaidimas tesiamas toliau
                {
                    return;
                }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (gameLogic.getMap().getPlyteles()[i + 1][j] == gameLogic.getMap().getPlyteles()[i][j] || gameLogic.getMap().getPlyteles()[i][j + 1] == gameLogic.getMap().getPlyteles()[i][j])
                {
                    return;
                }

        gameOver = true;
    }

    boolean arReikiaPridetiNaujaTile(){
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (gameLogic.getMap().plytelesKopija[i][j] != gameLogic.getMap().getPlyteles()[i][j])
                {
                    return false;
                }
        return true;
    }

}
