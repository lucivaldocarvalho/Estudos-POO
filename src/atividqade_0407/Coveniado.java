package atividqade_0407;

import java.util.Random;

public class Coveniado extends Paciente {
    private String nomedocovenio;
    private int numerodecovenio;
    private String nomeEspecialidade;








    public String getNomedocovenio() {

        return nomedocovenio;
    }

    public void setNomedocovenio(String nomedocovenio) {
        this.nomedocovenio = nomedocovenio;
    }

    public int getNumerodecovenio() {
        return numerodecovenio;
    }

    public void setNumerodecovenio(int numerodecovenio) {
        this.numerodecovenio = numerodecovenio;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }
    @Override
    public String agendarconsuta() {
        return (getNomeEspecialidade() +  "  -  "+ data());

    }
    @Override
    public void print() {
        System.out.println(getNome() + "  - " + getNomedocovenio());
        System.out.println(agendarconsuta());

    }



}
