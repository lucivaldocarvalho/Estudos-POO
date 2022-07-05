package atvidade_quarta;

public class Quadrado extends Retangulo {


    public Quadrado(float calcularArea, float calcularPerimetro) {
        super(calcularArea, calcularPerimetro);
    }

    public Quadrado(float calcularArea, float calcularPerimetro, float lado1, float lado2, float base, float altura) {
        super(calcularArea, calcularPerimetro, lado1, lado2, base, altura);
    }

    public double calculaArea(){
        return (this.getBase() * this.getAltura())/2;

    }
    public double calculaPerimetro(){
        return this.getLado1() + this.getBase();
    }


}
