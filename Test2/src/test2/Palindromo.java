/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

/**
 *
 * @author edanP
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        System.out.println("Ingrese la palabra:");
        String palabra = buffer.nextLine();
        System.out.println("La palabra es palindromo: " + esPalindromo(palabra));
    }
 
    static boolean esPalindromo(String input) {
        int tamaño = input.length();
        for (int i = 0; i < tamaño / 2; i++) {
            if (input.charAt(i) != input.charAt(tamaño - 1 - i)) {
                return false;
            }           
        }
        return true;
    }
}
