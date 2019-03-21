package pratica_0218;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void quadrante() {
        if (this.x == 0) {
            if (this.y == 0) { System.out.println("Origem"); }
            else { System.out.println("Eixo Y"); }
        }
        else if (this.x > 0) {
            if (this.y > 0) { System.out.println("1"); }
            else if (this.y < 0) { System.out.println("4"); }
            else { System.out.println("Eixo X"); }
        }
        else
        {
            if (this.y > 0) { System.out.println("2"); }
            else if (this.y < 0) { System.out.println("3"); }
            else { System.out.println("Eixo X"); }
        }
    }
}
