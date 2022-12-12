public class Score {
    private GameLogic gameLogic;
    private int taskai;
    public Score(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        taskai = 0;
    }

    public int getTaskai() {
        return taskai;
    }

    public void giveTaskai(int taskai) {
        this.taskai += taskai;
    }
}
