package atvidade_quarta;

public abstract class Quadrilatero {
    float calcularArea;
    float calcularPerimetro;

    public Quadrilatero(float calcularArea, float calcularPerimetro) {
        this.calcularArea = calcularArea;
        this.calcularPerimetro = calcularPerimetro;
    }

    public float getCalcularArea() {
        return calcularArea;
    }

    public void setCalcularArea(float calcularArea) {
        this.calcularArea = calcularArea;
    }

    public float getCalcularPerimetro() {
        return calcularPerimetro;
    }

    public void setCalcularPerimetro(float calcularPerimetro) {
        this.calcularPerimetro = calcularPerimetro;
    }
}
