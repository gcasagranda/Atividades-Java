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
public class Teste {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int i = entrada.nextInt();
        float f = entrada.nextFloat();
        String s = entrada.next();
        
        System.out.println(i);
        System.out.println(f);
        System.out.println(s);
}
}
