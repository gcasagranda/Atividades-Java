/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv6;

/**
 *
 * @author gui--
 */
public class Dependente extends Pessoa {
    private int idade;
    
    public Dependente (String nome, String endereco, int idade){
        super(nome, endereco);
        this.idade=idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
