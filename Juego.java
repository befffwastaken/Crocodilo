package Juego;

import java.util.Scanner;

public class Juego{
    public static void main(String[] args){
        boolean jugando;
        int posicionProtagonista;

        Personaje jugador;
        jugador = new Personaje("Jugador 1","Verde",3,false);

        Protagonista cocodrile;
        cocodrile = new Protagonista("Cocodrile","Verde",3,false,0,1);

        while(jugando == true){
            //Scanner input = new Scanner(System.in);
            /*
            System.out.println("Nombre del jugador: " + jugador.Nombre);
            System.out.println("Color del jugador: " + jugador.Color);
            System.out.println("Vida del jugador: " + jugador.vida);
            */
            /*
            System.out.println("Seleccione El carril al cual quiere moverse (0-1-2)");
            Scanner input = new Scanner(System.in);
            posicionProtagonista = nextint();
            
            System.out.println("La posicion es " + posicionProtagonista);
            */
        }

    }
}