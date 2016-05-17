package Classes.Plana;

public class Triangulo extends Figura {

    private int lado3;

    public Triangulo() {
        super();
        lado3 = 10;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        super(lado1, lado2);
        this.lado3 = lado3;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String getDadosFormatados() {
        return super.getDadosFormatados() + " - " + this.lado3;
    }

    @Override
    public String toString() {
        return this.getDadosFormatados();
    }

    @Override
    public double getAreaPlana() {

        return super.getLado1() * super.getLado2() / 2;
    }

    @Override
    public double getPerimetroPlana() {

        return super.getLado1() + super.getLado2() + this.lado3;
    }

    public String getTipo() {
        if (super.getLado1() == super.getLado2()
                && super.getLado2() == this.lado3) {
            return "Equilatero";
        } else if (super.getLado1() != super.getLado2()
                && super.getLado2() != this.lado3) {
            return "Escaleno";
        } else {
            return "Isosceles";
        }
    }

}
