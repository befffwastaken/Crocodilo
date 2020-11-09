package Juego;

import java.util.Random;

public class Enemigo{
    double posicionObstaculoX;
    double posicionObstaculoY;
    int [][] posicionObstaculo = new int[2][5];

    int vidaObstaculo=1;
    
    int posicionProtagonista;

    public void Enemigo(){
        Random r = new Random();
        for(int i =0; i <= 20; i++){
            if(i % 3 == 0){
                posicionObstaculoX = r.nextInt(2);
                posicionObstaculoY = r.nextInt(2)+2;
                posicionObstaculo[posicionObstaculoX][posicionObstaculoY];
            }
        }
    }
    public void Colision(){
        if(posicionObstaculo == posicionProtagonista){
            vidaObstaculo-=1;
            vida-=1;
        }
    }
}
