/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public enum TipoCasilla {
    
    A("Bosque"), B("Camino");
    
    private String tipoCasilla;

    private TipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }
    
}
