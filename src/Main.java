public class Main {
    public static void main(String args[])
    {
        GameLogic gameLogic = new GameLogic();
        gameLogic.pridetiRandomPlyteles();

        while (!gameLogic.getGameRules().getGameOver())
        {
            gameLogic.apdorotiZaidimoLogika();
        }

        System.out.print("\nZaidimas baigtas\n\n\n\n");
    }
}
