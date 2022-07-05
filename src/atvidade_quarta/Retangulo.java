package atvidade_quarta;

public class Retangulo extends Quadrilatero {
    float lado1;
    float lado2;

    float base;
    float altura;


    public Retangulo(float calcularArea, float calcularPerimetro) {
        super(calcularArea, calcularPerimetro);
    }

    public Retangulo(float calcularArea, float calcularPerimetro, float lado1, float lado2, float base, float altura) {
        super(calcularArea, calcularPerimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        return lado2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return (this.getLado1() * this.getAltura()) / 2;

    }

    public double calculaPerimetro() {
        return this.getLado1() + this.getLado2() + this.getBase();

    }



}
