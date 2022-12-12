import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class KeyHandlerTest {
    @Test
    void userInputPressQuitKeyGameShouldOver(){
        GameLogic gameLogic = new GameLogic();

        gameLogic.getKeyHandler().userInput('q');

        Assert.assertEquals(gameLogic.getGameRules().getGameOver(), true);
    }
}
