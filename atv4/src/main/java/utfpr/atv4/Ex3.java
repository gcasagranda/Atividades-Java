/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv4;

import java.util.Scanner;

/**
 *
 * @author gui--
 */
public class Ex3 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];
        
        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
            matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
    }
    
    public static void printDiagonalPrincipal (int matriz[][]){
    for (int i=0; i<matriz.length; i++){
        System.out.print(matriz[i][i] + " ");
    }
}
    
}
