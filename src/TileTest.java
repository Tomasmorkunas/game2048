import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TileTest {

    @Test
    public void tileShouldBeAdded(){
        GameLogic gameLogic = new GameLogic();

        gameLogic.getTile().manualPridetiBloka(1, 2, 8);

        Assert.assertEquals(gameLogic.getMap().getPlyteles()[1][2], 8);
    }
}
