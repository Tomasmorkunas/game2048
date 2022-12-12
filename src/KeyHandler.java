import java.util.HashMap;
import java.util.Map;

public class KeyHandler {
    private GameLogic gameLogic;
    private final Map<Integer, KeyHandlerCommand> commands = new HashMap<>(); //Command pattern
    public GameLogic getGameLogic() {
        return gameLogic;
    }

    public KeyHandler(GameLogic gameLogic) {
        this.gameLogic = gameLogic;

        commands.put(115, new DownKeyCommand(this)); //S
        commands.put(119, new UpKeyCommand(this)); //W
        commands.put(100, new RightKeyCommand(this)); //D
        commands.put(97, new LeftKeyCommand(this)); //A
        commands.put(113, new QuitKeyCommand(this)); //Q
    }

    void userInput(char klavisas) {
        commands.get((int)klavisas).executeKeyPress();
    }
}
