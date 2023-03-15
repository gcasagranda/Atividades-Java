/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv9;

/**
 *
 * @author gui--
 */
public class MinhaClasse implements MinhaInterface{
    
    String frase;

    @Override
    public void concatenar(String s) {
        frase = frase + s;
    }

    @Override
    public int tamanho() {
        return frase.length();
    }

    @Override
    public String getFrase() {
        return frase;
    }

    @Override
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
}
