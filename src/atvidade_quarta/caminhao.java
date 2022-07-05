package atvidade_quarta;

public class caminhao extends veículo {
    String carga;
    int numeixos;
    double pesomaximo;


    public caminhao(String placa, int ano) {
        super(placa, ano);
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getNumeixos() {
        return numeixos;
    }

    public void setNumeixos(int numeixos) {
        this.numeixos = numeixos;
    }

    public double getPesomaximo() {
        return pesomaximo;
    }

    public void setPesomaximo(double pesomaximo) {
        this.pesomaximo = pesomaximo;
    }

    @Override
    public String toString() {
        return "caminhao{" +
                "carga='" + carga + '\'' +
                ", numeixos=" + numeixos +
                ", pesomaximo=" + pesomaximo +
                ", ono=" + ono +
                ", placa='" + placa + '\'' +
                '}';
    }

}
