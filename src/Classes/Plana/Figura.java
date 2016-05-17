package Classes.Plana;

public abstract class Figura implements FiguraPlanaInterface{

    private int lado1;
    private int lado2;

    public Figura() {
        lado1 = 10;
        lado2= 10;
    }

    public Figura(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public String getDadosFormatados() {
        return lado1 + " - " + lado2;
    }

    public String toString() {
        return getDadosFormatados();
    }

   

}
