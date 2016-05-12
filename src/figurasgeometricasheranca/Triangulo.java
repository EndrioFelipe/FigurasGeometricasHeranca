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
public class Triangulo extends Figura2D implements DimensaoSuperficial{
    
    public Triangulo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int calcularArea() {
        return 1;
    }
    
}
