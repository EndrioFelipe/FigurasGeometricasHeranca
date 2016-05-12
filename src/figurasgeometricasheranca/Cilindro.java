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
public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
    
    public Cilindro(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
