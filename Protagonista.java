package Juego;

import java.util.Scanner;

public class Protagonista extends Personaje {
    int puntos;
    int posicionProtagonista;

    public Protagonista(String Nombre, String Color, int vida, boolean muerto, int puntos, int posicionProtagonista){
        this.Nombre = Nombre;
        this.Color = Color;
        this.vida = vida;
        this.muerto = muerto;
        this.puntos = puntos;
        this.posicionProtagonista = posicionProtagonista;
    }
    public posicion(){
        System.out.println("Seleccione El carril al cual quiere moverse (0-1-2)");
        Scanner input = new Scanner(System.in);
        posicionProtagonista = nextint();
        return posicionProtagonista;
    }
}

