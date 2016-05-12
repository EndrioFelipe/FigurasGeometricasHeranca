/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasheranca;

/**
 *
 * @author endrio
 */
public class Circulo extends Figura2D implements DimensaoSuperficial{
    
    public Circulo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
