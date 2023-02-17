/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Casilla {

    private int fila;
    private int columna;
    private TipoCasilla tipoCasilla;
    private int[][] matriz;

    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.matriz = new int[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(TipoCasilla.values().length);
            }
        }
    }

    public Casilla() {
    }

    public static String casilla(TipoCasilla t, int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                return ;
            }
        }

    }
    

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

}
