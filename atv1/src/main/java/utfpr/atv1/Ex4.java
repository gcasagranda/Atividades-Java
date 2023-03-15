/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv1;

import java.util.Scanner;

/**
 *
 * @author gui--
 */
public class Ex4 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int soma = a + b;
        int subtracao = a - b;
        System.out.println("soma = " + soma);
        System.out.println("subtracao = " + subtracao);
    }
    
}
