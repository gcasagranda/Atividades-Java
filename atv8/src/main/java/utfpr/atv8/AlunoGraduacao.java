/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.atv8;

/**
 *
 * @author gui--
 */
public class AlunoGraduacao extends Aluno {
    private int ra;
    private double notaDisciplinas;
    private double notaTCC;
    @Override
    public int getRa() {
        return ra;
    }
    @Override
    public void setRa(int ra) {
        this.ra = ra;
    }
    @Override
    public double getNotaDisciplinas() {
        return notaDisciplinas;
    }
    @Override
    public void setNotaDisciplinas(double notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }
    
    public double getNotaTCC() {
        return notaTCC;
    }
    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }
    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC){
        super.setNome(nome);
        this.ra=ra;
        this.notaDisciplinas=notaDisciplinas;
        this.notaTCC=notaTCC;        
    }
    @Override
    public double getNotaFinal() {
        return (notaDisciplinas + notaTCC)/2;
    }
}
