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
public class Quadrado implements AreaCalculavel{
    double lado;
    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
}
