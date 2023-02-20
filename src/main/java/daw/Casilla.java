/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public class Casilla {

    private int fila;
    private int columna;
    private TipoCasilla tipoCasilla;

    public Casilla(int fila, int columna, TipoCasilla tipoCasilla) {
        this.fila = fila;
        this.columna = columna;
        this.tipoCasilla = tipoCasilla;
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

    @Override
    public String toString() {
        return "Casilla{" + "tipoCasilla=" + tipoCasilla + '}';
    }

    

}
