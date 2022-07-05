package atvidade_quarta;

public class onibus extends veículo {
    int numassentos;


    public onibus(String placa, int ano) {
        super(placa, ano);
    }

    public int getNumassentos() {
        return numassentos;
    }

    public void setNumassentos(int numassentos) {
        this.numassentos = numassentos;
    }
}
