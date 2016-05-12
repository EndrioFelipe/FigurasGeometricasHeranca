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
public class Quadrado extends Figura2D implements DimensaoSuperficial{
    private int lado;
    
    
    public Quadrado(String nome, String cor) {
        super(nome, cor);
    }
    
    @Override
    public int calcularArea() {
       return this.lado*this.lado;
               
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
