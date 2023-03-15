
package utfpr.atv2;

import java.util.Scanner;


public class Ex4 {
    public static void main (String args[]){
        Scanner leitor = new Scanner(System.in);
        String frase = new String();
        frase = leitor.nextLine();
        char c[]=new char[frase.length()];
        int j=0;
        for (int i=frase.length()-1; i>=0; i--){
                c[j]=frase.charAt(i);
                j++;
        }
        for (int i=0; i<frase.length(); i++)
            System.out.print(c[i]);
        System.out.print("\n"+frase.length());
    }
    
}
