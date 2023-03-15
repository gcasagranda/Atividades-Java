
package utfpr.atv2;

import java.util.Scanner;


public class Ex2 {
    public static void main (String args[]){
        int tam;
        Scanner leitor = new Scanner(System.in);
        tam = leitor.nextInt();
        int vetor1[] = new int[tam];
        int vetor2[] = new int[tam];
        for (int i=0;i<tam; i++)
            vetor1[i]= leitor.nextInt();
        for (int i=0;i<tam; i++)
            vetor2[i]= leitor.nextInt();
        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
                if (vetor1[i]==vetor2[j]){
                    System.out.println(vetor1[i]);
                    break;
                }
            }
        }
        
      
    }
}