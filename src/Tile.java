import java.util.Random;

public class Tile {
    private GameLogic gameLogic;

    public Tile(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    public void judetiIVirsu(){
        int li;
        int ri;
        for (int j = 0; j < 4; j++)
        {
            li = 0;
            ri = j;
            for (int i = 1; i < 4; i++)
            {
                if (gameLogic.getMap().getPlyteles()[i][j] != 0) //jeigu kazkokia reiksme jau yra laukelyje
                {
                    if (gameLogic.getMap().getPlyteles()[i - 1][j] == 0 || gameLogic.getMap().getPlyteles()[i - 1][j] == gameLogic.getMap().getPlyteles()[i][j])
                    {
                        if (gameLogic.getMap().getPlyteles()[li][ri] == gameLogic.getMap().getPlyteles()[i][j]) //jeigu lygios reiksmes susijungia
                        {
                            gameLogic.getMap().getPlyteles()[li][ri] *= 2; //naujo bloko reiksme dvigubinasi
                            gameLogic.getScore().giveTaskai(gameLogic.getMap().getPlyteles()[li][ri]); //tasku prisideda tiek, koks gaunas naujas skaitmuo sujungus du blokus
                            gameLogic.getMap().getPlyteles()[i][j] = 0; //sena skaiciaus pozicija nusinuliuoja - tampa tuscia
                        }
                        else
                        {
                            if (gameLogic.getMap().getPlyteles()[li][ri] == 0)
                            {
                                gameLogic.getMap().getPlyteles()[li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                            else
                            {
                                gameLogic.getMap().getPlyteles()[++li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                        }
                    }
                    else li++;
                }
            }
        }
    }

    public void judetiIApacia(){
        int li, ri;
        for (int j = 0; j < 4; j++)
        {
            li = 3;
            ri = j;
            for (int i = 2; i >= 0; i--)
            {
                if (gameLogic.getMap().getPlyteles()[i][j] != 0)
                {
                    if (gameLogic.getMap().getPlyteles()[i + 1][j] == 0 || gameLogic.getMap().getPlyteles()[i + 1][j] == gameLogic.getMap().getPlyteles()[i][j])
                    {
                        if (gameLogic.getMap().getPlyteles()[li][ri] == gameLogic.getMap().getPlyteles()[i][j])
                        {
                            gameLogic.getMap().getPlyteles()[li][ri] *= 2;
                            gameLogic.getScore().giveTaskai(gameLogic.getMap().getPlyteles()[li][ri]);
                            gameLogic.getMap().getPlyteles()[i][j] = 0;
                        }
                        else
                        {
                            if (gameLogic.getMap().getPlyteles()[li][ri] == 0)
                            {
                                gameLogic.getMap().getPlyteles()[li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                            else
                            {
                                gameLogic.getMap().getPlyteles()[--li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                        }
                    }
                    else li--;
                }
            }
        }
    }

    public void judetiIKaire(){
        int li, ri;
        for (int i = 0; i < 4; i++)
        {
            li = i;
            ri = 0;
            for (int j = 1; j < 4; j++)
            {
                if (gameLogic.getMap().getPlyteles()[i][j] != 0)
                {
                    if (gameLogic.getMap().getPlyteles()[i][j - 1] == 0 || gameLogic.getMap().getPlyteles()[i][j - 1] == gameLogic.getMap().getPlyteles()[i][j])
                    {
                        if (gameLogic.getMap().getPlyteles()[li][ri] == gameLogic.getMap().getPlyteles()[i][j])
                        {
                            gameLogic.getMap().getPlyteles()[li][ri] *= 2;
                            gameLogic.getScore().giveTaskai(gameLogic.getMap().getPlyteles()[li][ri]);
                            gameLogic.getMap().getPlyteles()[i][j] = 0;
                        }
                        else
                        {
                            if (gameLogic.getMap().getPlyteles()[li][ri] == 0)
                            {
                                gameLogic.getMap().getPlyteles()[li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                            else
                            {
                                gameLogic.getMap().getPlyteles()[li][++ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                        }
                    }
                    else ri++;
                }
            }
        }
    }

    public void judetiIDesine(){
        int li, ri;
        for (int i = 0; i < 4; i++)
        {
            li = i;
            ri = 3;
            for (int j = 2; j >= 0; j--)
            {
                if (gameLogic.getMap().getPlyteles()[i][j] != 0)
                {
                    if (gameLogic.getMap().getPlyteles()[i][j + 1] == 0 || gameLogic.getMap().getPlyteles()[i][j + 1] == gameLogic.getMap().getPlyteles()[i][j])
                    {
                        if (gameLogic.getMap().getPlyteles()[li][ri] == gameLogic.getMap().getPlyteles()[i][j])
                        {
                            gameLogic.getMap().getPlyteles()[li][ri] *= 2;
                            gameLogic.getScore().giveTaskai(gameLogic.getMap().getPlyteles()[li][ri]);
                            gameLogic.getMap().getPlyteles()[i][j] = 0;
                        }
                        else
                        {
                            if (gameLogic.getMap().getPlyteles()[li][ri] == 0)
                            {
                                gameLogic.getMap().getPlyteles()[li][ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                            else
                            {
                                gameLogic.getMap().getPlyteles()[li][--ri] = gameLogic.getMap().getPlyteles()[i][j];
                                gameLogic.getMap().getPlyteles()[i][j] = 0;
                            }
                        }
                    }
                    else ri--;
                }
            }
        }
    }

    public void autoPridetiBloka() {
        Random rand = new Random();

        int li, ri;

        while (true)
        {
            li = rand.nextInt(4);
            ri = rand.nextInt(4);
            if (gameLogic.getMap().getPlyteles()[li][ri] == 0) //jeigu laukelis tuscias
            {
                gameLogic.getMap().getPlyteles()[li][ri] = (int) Math.pow(2, li % 2 + 1); //spawninimas naujo bloko tuscioje pozicijoje
                break;
            }
        }
    }
    void ManualPridetiBloka(int pos1, int pos2, int value) {
        gameLogic.getMap().getPlyteles()[pos1][pos2] = value;
    }
}
