package programowaniedynamiczne2;

public class ProgramowanieDynamiczne2 {

    public Boolean checkIsSquareNumber(int number) {

        if (Math.sqrt(number) * Math.sqrt(number) == number) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean firstCheck(int x, int y) {
        int wynik = x - y;

        if (Math.sqrt(wynik) % 1 == 0 && Math.sqrt(wynik) * Math.sqrt(wynik) == wynik) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean secondCheck(int x, int z) {
        int wynik = x + z;

        if (Math.sqrt(wynik) % 1 == 0 && Math.sqrt(wynik) * Math.sqrt(wynik) == wynik) {

            return true;
        } else {
            return false;
        }
    }

    public Boolean thirdCheck(int x, int z) {
        int wynik = x - z;

        if (Math.sqrt(wynik) % 1 == 0 && Math.sqrt(wynik) * Math.sqrt(wynik) == wynik) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean fourthCheck(int y, int z) {
        int wynik = y + z;
        if (Math.sqrt(wynik) % 1 == 0 && Math.sqrt(wynik) * Math.sqrt(wynik) == wynik) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean fifthCheck(int y, int z) {
        int wynik = y - z;

        if (Math.sqrt(wynik) % 1 == 0 && Math.sqrt(wynik) * Math.sqrt(wynik) == wynik) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int limX = 1000;
        int limY = 1000;
        int limZ = 1000;

        ProgramowanieDynamiczne2 pd = new ProgramowanieDynamiczne2();

        for (int z = 1; z < limZ; z++) {
            for (int y = z + 1; y < limY; y++) {
                for (int x = y + 1; x < limX; x++) {
                    if (pd.firstCheck(x, y)
                            && pd.secondCheck(x, z)
                            && pd.thirdCheck(x, z)
                            && pd.fourthCheck(y, z)
                            && pd.fifthCheck(y, z)) {
                        
                        System.out.println("Znaleziono rozwiązanie: " + x + ">" + y + ">" + z + "> 0");
                        break;
                    }
                }
            }
        }
    }

}
