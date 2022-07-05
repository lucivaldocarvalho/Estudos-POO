package atividqade_0407;

public class NaoCoveniado extends Paciente {
    private String nomedocovenio;
    private  String NomeEspecialidade;
    private  String BandeiraCartao;
    private  int NumCartaocredito;

    private  double valorconsuta = 200.00;






    public String getNomedocovenio() {
        return ("SEM CONVÊNIO");
    }



    public String getNomeEspecialidade() {
        return NomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        NomeEspecialidade = nomeEspecialidade;
    }

    public String getBandeiraCartao() {
        return BandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        BandeiraCartao = bandeiraCartao;
    }

    public int getNumCartaocredito() {
        return NumCartaocredito;
    }

    public void setNumCartaocredito(int numCartaocredito) {
        NumCartaocredito = numCartaocredito;
    }

    @Override
    public void print() {
        System.out.println(getNome() +"-" + getNomedocovenio());



    }
    @Override
    public String agendarconsuta() {

        return null;

    }

}
