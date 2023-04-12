/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int [][] matriz = new int [4][4];
        int [][] matrizT = new int [4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            matriz [i][j] = random.nextInt(10);
                }
            }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            matrizT [j][i] = matriz [i][j];
                }
            }
        // Mostrar los resultados
        String respuesta = "";
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                   respuesta = respuesta + " " + matriz [i][j];
            }
            respuesta = respuesta + "\n";
            
        }
            System.out.println(respuesta);
            
            String respuestaT = "";
            for (int j = 0; j < matrizT.length; j++) {
                for (int i = 0; i < matrizT.length; i++) {
                   respuestaT = respuestaT + " " + matrizT [j][i];
            }
            respuestaT = respuestaT + "\n";
    }
            System.out.println(respuestaT);
    }
}
    

