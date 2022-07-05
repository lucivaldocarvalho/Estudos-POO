package atividqade_0407;

import java.util.Random;

public abstract class Paciente  {
    private String cpf;
    private String nome;



    public abstract String agendarconsuta();
    public abstract void print();

    Random random = new Random();
    public int mes = random.nextInt(2)+1;
    String a = String.format ("%02d", mes);
    public int dia = random.nextInt(2)+1;
    String b = String.format ("%02d", mes);
    public int ano = 2023;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String data(){

        return  (a + "/" + b + "/" + ano);
    }





}
