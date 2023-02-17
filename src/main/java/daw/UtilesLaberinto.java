/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class UtilesLaberinto {
    
    public String[][] generadorLaberinto(int n){
        String[][] matriz = new String[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = RandomStringUtils.random(1, 'b', 'c');
            }
        }
        return matriz;
    }
    
    public Casilla[][] generadorLaberintoCasillas(String[][] letras){
        Casilla[][] arrayCasillas;
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if(letras[i][j] == "b"){
                    arrayCasillas[i][j] = ;
                }else{
                    
                }
            }
        }
    }
    
}
