
package Classes.solida;

import Classes.Plana.Quadrilatero;
/**
 * Classe responsável pelo armazenamento de informacoes de uma figura sólida com seis faces (cubo)
 * 
 * 
 * @author joão luiz
 * @version 2.0
 */

public class Cubo extends Quadrilatero {

    private int altura;
    
    /**
     * Método construtor sem parâmetros responsavel por valorizar os atributos lado1, lado2 e altura do cubo com 10.
     * 
     */    
    public Cubo() {
        super();
        this.altura = 10;
    }
    
    /**
     * Método construtor com dois parâmetros que define valores iniciais para os atributos lado1 e lado2. O Atributo altura neste caso e valorizado com 10.
     * @param lado1 Valor correspondente ao lado1 do Cubo
     * @param lado2 Valor correspondente ao lado2 do Cubo
     */    
    public Cubo( int lado1, int lado2 ) {
        super( lado1, lado2 )  ;
        this.altura = 10;
    }
    
    /**
     * Método construtor parâmetros que define valores iniciais para os atributos lado1, lado2 e altura. 
     * @param lado1 Valor correspondente ao lado1 do Cubo
     * @param lado2 Valor correspondente ao lado2 do Cubo
     * @param altura Valor correspondente a altura do Cubo
     */       
    public Cubo( int lado1, int lado2, int altura ) {
        super( lado1, lado2 );
        this.altura = altura;        
    }
    
    /**
     * Método que retorna o valor armazenado na altura
     * @return Valor armazenado na altura
     */    
    public int getAltura() {
        return this.altura;
    }
    
    /**
     * Método que fornece um valor para a altura.
     * @param altura Valor para a Altura
     */    
    public void setAltura( int altura ) {
        this.altura = altura;
    }
    
    /**
     * Retorna uma representação textual para o objeto cubo, sendo este formado pelo lado1 - lado2 - altura.
     * @return Representação textual
     */    
    @Override
    public String getDadosFormatados() {
        return super.getDadosFormatados() +  " - " +
                this.getAltura();
    }

    /**
     * Retorna uma representação textual para o objeto cubo, sendo este formado pelo lado1 - lado2 - altura.
     * @return Representação textual
     */    
    @Override
    public String toString() {
        return this.getDadosFormatados();
    }    

    /**
     * Retorna o volume do cubo (lado1 x lado2 x altura)
     * @return Volume do Cubo
     */    
    public double getVolume() {
        return super.getLado1() * super.getLado2() * this.altura;
    }
    
    /**
     * Retorna se o cubo é perfeito, ou seja, todos os lados iguais.
     * @return Retorna se o cubo é perfeito.
     */      
    public boolean isCuboPerfeito() {
        if ( super.getLado1() == super.getLado2() && 
                super.getLado2() == this.getAltura() ) {
            return  true;
        } else { 
            return false;
        }
    }
}
