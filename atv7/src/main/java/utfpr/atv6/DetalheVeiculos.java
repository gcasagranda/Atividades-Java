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
public class DetalheVeiculos{
    Veiculo vetor[]=new Veiculo[4];
    public DetalheVeiculos (Veiculo veiculos[]){
        for (int i=0; i<4; i++){
            if (veiculos[i] instanceof Moto)
                vetor[i] = new Moto();
            else
                vetor[i]=new Carro();
            vetor[i].setPlaca(veiculos[i].getPlaca());
            vetor[i].setCor(veiculos[i].getCor());
        }
    }
    
    public void printVeiculos(){
        for (int i=0; i<4; i++){
            if (vetor[i] instanceof Moto){
                System.out.printf("Moto: %s - %s - 2\n", vetor[i].getPlaca(), vetor[i].getCor());
            }
            else
                System.out.printf("Carro: %s - %s - 4\n", vetor[i].getPlaca(), vetor[i].getCor());
        }
    }
    
}
