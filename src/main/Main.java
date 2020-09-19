package main;

import clases.BarcoPirata;

public class Main {

    public static void main(String [] args){

        BarcoPirata sunny = new BarcoPirata();

        sunny.setX(450);
        sunny.setY(180);

        sunny.moverPosicion(50, 20);

        sunny.conocerPosicion();

        sunny.disparar();

    }

}
