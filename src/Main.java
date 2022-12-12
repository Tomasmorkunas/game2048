import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Main implements ActionListener {
    public static void main(String args[])
    {


        int pozicija1;
        int pozicija2;
        int pozicija3;
        int pozicija4;
        int klavisas;
        int Plytele[][] = new int[4][4];
        int PlytelesKopija[][]= new int[4][4];
        int taskai = 0;

        Random rand = new Random();

        pozicija1 = rand.nextInt(4);
        pozicija2 = rand.nextInt(4);

        while (true)
        {
            pozicija3 = rand.nextInt(4);
            pozicija4 = rand.nextInt(4);
            if (pozicija1 != pozicija3 && pozicija2 != pozicija4) //negali buti tos pacios pozicijos 2 blokam
                break;
        }

        Plytele[pozicija1][pozicija2] = 2; //1 skaiciaus x ir y pozicijos paleidus zaidima
        Plytele[pozicija3][pozicija4] = 4; //2 skaiciaus x ir y pozicijos paleidus zaidima

        System.out.print("Zaidimas 2048\n\n");
        System.out.print("Paspauskite Esc, noredami nutraukti zaidima.\n");
        System.out.print("\n\n");

        //dvimatis masyvas, skirtas uzpildyti lentele eilutemis ir stulpeliais
        for (int i = 0; i < 4; i++)
        {
            System.out.print("*****************\n");
            for (int j = 0; j < 4; j++)
            {
                if (Plytele[i][j] == 0) System.out.print("|   ");
                else
                    System.out.print("| "+Plytele[i][j]+ " ");
            }
            System.out.print("|\n");
        }
        System.out.print("*****************\n");

        System.out.print("\n\n");
        System.out.print("Taskai: "+ taskai);

        while (true)
        {
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    PlytelesKopija[i][j] = Plytele[i][j];

            //Scanner sc = new Scanner(System.in);

                Scanner s= new Scanner(System.in);
                klavisas = s.next().charAt(0);

            //istrina console
//            System.out.print("\033[H\033[2J");
//            System.out.flush();



            if (klavisas == 119) //W
            {
                int li;
                int ri;
                for (int j = 0; j < 4; j++)
                {
                    li = 0;
                    ri = j;
                    for (int i = 1; i < 4; i++)
                    {
                        if (Plytele[i][j] != 0) //jeigu kazkokia reiksme jau yra laukelyje
                        {
                            if (Plytele[i - 1][j] == 0 || Plytele[i - 1][j] == Plytele[i][j])
                            {
                                if (Plytele[li][ri] == Plytele[i][j]) //jeigu lygios reiksmes susijungia
                                {
                                    Plytele[li][ri] *= 2; //naujo bloko reiksme dvigubinasi
                                    taskai += Plytele[li][ri]; //tasku prisideda tiek, koks gaunas naujas skaitmuo sujungus du blokus
                                    Plytele[i][j] = 0; //sena skaiciaus pozicija nusinuliuoja - tampa tuscia
                                }
                                else
                                {
                                    if (Plytele[li][ri] == 0)
                                    {
                                        Plytele[li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                    else
                                    {
                                        Plytele[++li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                }
                            }
                            else li++;
                        }
                    }
                }
            }

            if (klavisas == 115) //S
            {
                int li, ri;
                for (int j = 0; j < 4; j++)
                {
                    li = 3;
                    ri = j;
                    for (int i = 2; i >= 0; i--)
                    {
                        if (Plytele[i][j] != 0)
                        {
                            if (Plytele[i + 1][j] == 0 || Plytele[i + 1][j] == Plytele[i][j])
                            {
                                if (Plytele[li][ri] == Plytele[i][j])
                                {
                                    Plytele[li][ri] *= 2;
                                    taskai += Plytele[li][ri];
                                    Plytele[i][j] = 0;
                                }
                                else
                                {
                                    if (Plytele[li][ri] == 0)
                                    {
                                        Plytele[li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                    else
                                    {
                                        Plytele[--li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                }
                            }
                            else li--;
                        }
                    }
                }
            }

            if (klavisas == 97) //A
            {
                int li, ri;
                for (int i = 0; i < 4; i++)
                {
                    li = i;
                    ri = 0;
                    for (int j = 1; j < 4; j++)
                    {
                        if (Plytele[i][j] != 0)
                        {
                            if (Plytele[i][j - 1] == 0 || Plytele[i][j - 1] == Plytele[i][j])
                            {
                                if (Plytele[li][ri] == Plytele[i][j])
                                {
                                    Plytele[li][ri] *= 2;
                                    taskai += Plytele[li][ri];
                                    Plytele[i][j] = 0;
                                }
                                else
                                {
                                    if (Plytele[li][ri] == 0)
                                    {
                                        Plytele[li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                    else
                                    {
                                        Plytele[li][++ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                }
                            }
                            else ri++;
                        }
                    }
                }
            }

            if (klavisas == 100) //D
            {
                int li, ri;
                for (int i = 0; i < 4; i++)
                {
                    li = i;
                    ri = 3;
                    for (int j = 2; j >= 0; j--)
                    {
                        if (Plytele[i][j] != 0)
                        {
                            if (Plytele[i][j + 1] == 0 || Plytele[i][j + 1] == Plytele[i][j])
                            {
                                if (Plytele[li][ri] == Plytele[i][j])
                                {
                                    Plytele[li][ri] *= 2;
                                    taskai += Plytele[li][ri];
                                    Plytele[i][j] = 0;
                                }
                                else
                                {
                                    if (Plytele[li][ri] == 0)
                                    {
                                        Plytele[li][ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                    else
                                    {
                                        Plytele[li][--ri] = Plytele[i][j];
                                        Plytele[i][j] = 0;
                                    }
                                }
                            }
                            else ri--;
                        }
                    }
                }
            }

            if (klavisas == 113) //Q
            {
                break;
            }


            if (!Patikra(PlytelesKopija, Plytele))
            {
                int li, ri;

                while (true)
                {
                    li = rand.nextInt(4);
                    ri = rand.nextInt(4);
                    if (Plytele[li][ri] == 0) //jeigu laukelis tuscias
                    {
                        Plytele[li][ri] = (int) Math.pow(2, li % 2 + 1); //spawninimas naujo bloko tuscioje pozicijoje
                        break;
                    }
                }
            }

            System.out.print("Zaidimas 2048\n\n");
            System.out.print("Paspauskite Esc, noredami nutraukti zaidima.\n");
            System.out.print("\n\n");

            //dvimatis masyvas, skirtas uzpildyti lentele eilutemis ir stulpeliais
            for (int i = 0; i < 4; i++)
            {
                System.out.print("*****************\n");
                for (int j = 0; j < 4; j++)
                {
                    if (Plytele[i][j] == 0) System.out.print("|   ");
                    else
                        System.out.print("| "+Plytele[i][j] + " ");
                }
                System.out.print("|\n");
            }
            System.out.print("*****************\n");

            System.out.print("\n\n");
            System.out.print("Taskai: "+ taskai);

            if (!ArZaidimasBaigtas(Plytele))
            {
                System.out.print("Zaidimas baigtas\n\n\n\n");
                break;
            }
        }
    }

    static Boolean Patikra(int PlytelesKopija[][], int Plytele[][])
    {
        Boolean fl = true;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (PlytelesKopija[i][j] != Plytele[i][j])
                {
                    fl = false;
                    break;
                }
        return fl;
    }

    static Boolean ArZaidimasBaigtas(int Plytele[][])
    {
        int fl = 0, gl = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (Plytele[i][j] == 0) //jeigu dar yra neuzimtu poziciju zaidimas tesiamas toliau
                {
                    fl = 1;
                    break;
                }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (Plytele[i + 1][j] == Plytele[i][j] || Plytele[i][j + 1] == Plytele[i][j])
                {
                    gl = 1;
                    break;
                }

        if (fl == 1 || gl == 1) return true;
        else return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
