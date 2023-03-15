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
public class AlunoMestrado extends Aluno{
    private int ra;
    private double notaDisciplinas;
    private double notaDissertacao;
    private int artigosPublicados;
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
    public double getNotaDissertacao() {
        return notaDissertacao;
    }
    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }
    public int getArtigosPublicados() {
        return artigosPublicados;
    }
    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }
    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigos){
        super.setNome(nome);
        this.ra=ra;
        this.notaDisciplinas=notaDisciplinas;
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigos;
    }
    @Override
    public double getNotaFinal() {
        if (this.artigosPublicados<=0){
            return 0;
        }
        else{
            return (notaDissertacao + notaDisciplinas)/2;
        }
    }
}
