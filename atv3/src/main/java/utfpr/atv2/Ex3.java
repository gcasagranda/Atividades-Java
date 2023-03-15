
package utfpr.atv2;

import java.util.Scanner;

public class Ex3 {
    public static void main (String args[]){
        Scanner leitor = new Scanner(System.in);
        String frase = new String();
        char c;
        int a = 0, e = 0, i = 0, o = 0, u =0;
        while (!frase.equals("FIM")){
            frase = leitor.nextLine();
            for(int j=0; j<frase.length(); j++){
                c = frase.charAt(j);
                switch (c) {
                    case 'a':
                    case 'A':
                        a++;
                        break;
                    case 'e':
                    case 'E':
                        e++;
                        break;
                    case 'i':
                    case 'I':
                        i++;
                        break;
                    case 'o':
                    case 'O':
                        o++;
                        break;
                    case 'u':
                    case 'U':
                        u++;
                        break;
                    default:
                        break;
                }
                        
            }
        }
        System.out.println("a="+a);
        System.out.println("e="+e);
        System.out.println("i="+i);
        System.out.println("o="+o);
        System.out.println("u="+u);
    }
}
