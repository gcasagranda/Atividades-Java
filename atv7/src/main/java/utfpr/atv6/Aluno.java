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
public class Aluno extends Pessoa{
    private int ra;
    private String disciplinas;
    
    public Aluno(String nome, int idade, int ra, String disciplinas){
        super(nome, idade);
        this.ra = ra;
        this.disciplinas = disciplinas;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public String retornaDados(){
        return super.retornaDados() + " -- " + ra + " -- " + disciplinas;
    } 
}
