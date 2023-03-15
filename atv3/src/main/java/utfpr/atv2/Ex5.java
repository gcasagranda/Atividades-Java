
package utfpr.atv2;

import java.util.Scanner;


public class Ex5 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        String frase = new String();
        String pesquisa = new String();
        frase = leitor.nextLine();
        pesquisa = leitor.nextLine();
        int cont = 0, fromIndex=0;
        while (frase.indexOf(pesquisa, fromIndex)!= -1){
            cont++;
            fromIndex = frase.indexOf(pesquisa, fromIndex) + 1;
        }
        System.out.println(pesquisa+"="+cont);
    }
}
