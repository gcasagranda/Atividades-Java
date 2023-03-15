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
public class Carro extends Veiculo{
    private int numeroDePortas;
    private int potenciaMotor;
    

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    
    public void printInformacoes(){
        System.out.printf("Renavam: %d, Placa: %s, Cor: %s, NumeroDePortas: %d, PotenciaMotor: %d\n", super.getRenavam(), super.getPlaca(), super.getCor(), numeroDePortas, potenciaMotor);
    }
    
}
