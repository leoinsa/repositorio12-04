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
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int[] vector = new int[100];
        llenarVector(vector);
        mostrarVectorDescendente(vector);
    }
    
    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
    }
    
    public static void mostrarVectorDescendente(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " \n");//la n hace q los numeros los muestre en columna
        }
    }
    
