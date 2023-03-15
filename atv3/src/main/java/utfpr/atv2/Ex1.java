
package utfpr.atv2;

import java.util.Scanner;


public class Ex1 {
    public static void main (String args[]){
        int tam;
        Scanner leitor = new Scanner(System.in);
        tam = leitor.nextInt();
        int vetor[] = new int[tam];
        float soma=0;
        for(int i=0; i<tam; i++){
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }
        float media = soma/tam;
        System.out.printf("%.2f\n", media);
        for (int i=0; i<tam; i++){
            if (vetor[i]>media)
                System.out.println(vetor[i]);
        }
      
    }
}
