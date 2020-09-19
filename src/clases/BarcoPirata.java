package clases;

public class BarcoPirata implements Barco {

    private int x;
    private int y;

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

    public void conocerPosicion(){
        System.out.println("La posición actual es " + this.getX() + " - " + this.getY());
    }

    @Override
    public void moverPosicion(int x, int y) {
        this.x = this.x - x;
        this.y = this.y - y;
    }

    @Override
    public void disparar() {
        System.out.println("Dispara cañones");
    }
}
