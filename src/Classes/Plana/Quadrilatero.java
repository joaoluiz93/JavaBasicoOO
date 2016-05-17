package Classes.Plana;

/**
 * Classe responsável pelo armazenamento de informacoes de uma figura plana com
 * quatro lados
 *
 *
 * @author João Luiz
 * @version 2.0
 */
public class Quadrilatero extends Figura {

    /**
     * Método construtor sem parâmetros responsavel por valorizar os atributos
     * lado1 e lado2 do quadrilátero com 10.
     *
     */
    public Quadrilatero() {
        super();
    }

    /**
     * Método construtor com parâmetros que define valores iniciais para os
     * atributos lado1 e lado2
     *
     * @param l1 Valor correspondente ao lado1 do quadrilátero
     * @param l2 Valor correspondente ao lado2 do quadrilátero
     */
    public Quadrilatero(int l1, int l2) {
        super(l1, l2);
    }

    /**
     * Retorna a área do quadrilátero (lado1 x lado2)
     *
     * @return Área do quadrilátero
     */
    @Override
    public double getAreaPlana() {
        return super.getLado1() * super.getLado2();
    }

    /**
     * Retorna o perímetro do quadrilátero (soma dos lados)
     *
     * @return Perímetro do quadrilátero
     */
    @Override
    public double getPerimetroPlana() {
        return (2 * super.getLado1()) + (2 * super.getLado2());
    }

    /**
     * Verifica se o quadrilátero é um quadrado (lados iguais), retornando true
     * caso verdadeiro
     *
     * @return Verdadeiro se for quadrado
     */
    public boolean isQuadradoPlana() {
        if (super.getLado1() == super.getLado2()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se o quadrilátero é um retângulo (lados diferentes), retornando
     * true caso verdadeiro
     *
     * @return Verdadeiro se for retangulo
     */
    public boolean isRetanguloPlana() {
        return !this.isQuadradoPlana();
    }
}
