/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv4;


public class Ex2 {
    public static void main(String args[]){
        int vetor[] = {1,-2,3,4,-5,6,-7};
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }
    
    public static int procuraMaiorValor (int[] vetor){
    int maior = vetor[0];
    for (int i = 1; i<vetor.length; i++){
        if (vetor[i]>=maior)
            maior = vetor[i];
    }
    return maior;
}

    
}
