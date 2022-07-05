package atvidade_quarta;

public class Circulo extends Quadrilatero{

    float raio;


    public Circulo(float calcularArea, float calcularPerimetro) {
        super(calcularArea, calcularPerimetro);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double calculaArea(){
        return Math.PI * (this.getRaio() * this.getRaio());
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

}
