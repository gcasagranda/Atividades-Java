package utfpr.atv10;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex02 {

    public static void main(String args[]){
        float z=0.0F;
        int j=0;
        float x;
        Scanner leitor = new Scanner(System.in);
        for (int i=0; i<10; i++){
            try{
                x = leitor.nextFloat(); 
                z += x;
            }catch(InputMismatchException e){
                j++;
                leitor.next();
            }
        }
        System.out.printf("Entradas aceitas: %d, média: %.2f", (10-j), z/10);   
    }  
}
