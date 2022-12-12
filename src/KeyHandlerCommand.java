public interface KeyHandlerCommand {
    void executeKeyPress();
}

class DownKeyCommand implements KeyHandlerCommand {
    KeyHandler keyHandler;

    public DownKeyCommand(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }

    @Override
    public void executeKeyPress() {
        keyHandler.getGameLogic().getTile().judetiIApacia();
    }
}

class UpKeyCommand implements KeyHandlerCommand {
    KeyHandler keyHandler;

    public UpKeyCommand(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }

    @Override
    public void executeKeyPress() {
        keyHandler.getGameLogic().getTile().judetiIVirsu();
    }
}

class RightKeyCommand implements KeyHandlerCommand {
    KeyHandler keyHandler;

    public RightKeyCommand(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }

    @Override
    public void executeKeyPress() {
        keyHandler.getGameLogic().getTile().judetiIDesine();
    }
}

class LeftKeyCommand implements KeyHandlerCommand {
    KeyHandler keyHandler;

    public LeftKeyCommand(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }

    @Override
    public void executeKeyPress() {
        keyHandler.getGameLogic().getTile().judetiIKaire();
    }
}

class QuitKeyCommand implements KeyHandlerCommand {
    KeyHandler keyHandler;

    public QuitKeyCommand(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }

    @Override
    public void executeKeyPress() {
        keyHandler.getGameLogic().getGameRules().setGameOver(true);
    }
}