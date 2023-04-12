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
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random randon = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = randon.nextInt(10); // Generamos números aleatorios entre 0 y 99
        }
        
        System.out.print("Ingrese el número a buscar: ");
        int num = leer.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                if (!encontrado) {
                    System.out.println("El número " + num + " se encuentra en las siguientes posiciones:");
                }
                System.out.println("Posición " + i);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
    }
    
