package game;

public class pacman {

    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setAwal() {
        x = 1;
        y = 1;
    }

    public void setW() {
        y = y - 1;
    }

    public void setA() {
        x = x - 1;
    }

    public void setS() {
        y = y + 1;

    }

    public void setD() {
        x = x + 1;
    }

    public String getKiri() {
        return ">";
    }

    public String getBawah() {
        return "^";
    }

    public String getAtas() {
        return "V";
    }
}
