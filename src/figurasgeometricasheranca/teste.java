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
public class teste extends FiguraGeometrica {
    

    public teste(String nome, String cor) {
        super(nome, cor);
    }
    
    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado("quadrado","azul");
        quadrado.setLado(5);
        Triangulo triangulo = new Triangulo("triangulo","preto");
        
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        figuras[0]=quadrado;
        figuras[1]=triangulo;
        
        for (FiguraGeometrica fig : figuras){
            System.out.println(fig.getNome());
            System.out.println(fig.getCor());
            if (fig instanceof Figura2D){
                Figura2D f2d = (Figura2D) fig;
                System.out.println(f2d.calcularArea());
               
            }
        }
       // System.out.println(quadrado.calcularArea());
               
        
    }
}
