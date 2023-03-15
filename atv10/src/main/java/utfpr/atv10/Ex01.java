/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv10;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author gui--
 */
public class Ex01 {
    public  static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int x;
        try{        
        x = leitor.nextInt();
        System.out.println(x*2);
        } catch(InputMismatchException e){
            System.out.println("Entrada Incorreta: informe somente inteiros.");}
    }   
}
