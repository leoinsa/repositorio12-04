/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4;

/**
 *
 * @author Leo
 */
import java.util.*;

public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();
        
        int[] vector = new int[N];
        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(99999); // genera un número aleatorio entre 0 y 99999
        }

        int[] contador = new int[6]; // se usará para contabilizar cada número de dígitos

        for (int i = 0; i < vector.length; i++) {
            int n = vector[i];
            int digitos = 0;
            while (n > 0) { // contar cuántos dígitos tiene n
                digitos++;
                n /= 10;            while (n > 0) { // contar cuántos dígitos tiene n

            }
            if (digitos > 5) {
                digitos = 5; // si tiene más de 5 dígitos, se cuenta como un número de 5 dígitos
            }
            contador[digitos]++;
        }

        // imprimir los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println(contador[i] + " números de " + i + " dígitos");
        }
        
        mostrarVector(vector);
        
        
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        }
    }   
       