import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ScoreTest {
    @Test
    public void scoreShouldBeGiven(){
        GameLogic gameLogic = new GameLogic();

        gameLogic.getScore().giveTaskai(20);
        gameLogic.getScore().giveTaskai(50);

        Assert.assertEquals(70, gameLogic.getScore().getTaskai());
    }
}
