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
public class Pessoa {
    private String nome;
    private int idade; 

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String retornaDados(){
        return nome + " -- " + idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}