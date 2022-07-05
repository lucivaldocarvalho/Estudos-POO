package atvidade_quarta;

public abstract class veículo {
    int ono ;
    String placa;


    public veículo (String placa,int ano){
        this.placa = placa;
        this.ono =ano;

    }

    public int getOno() {
        return ono;
    }

    public void setOno(int ono) {
        this.ono = ono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
