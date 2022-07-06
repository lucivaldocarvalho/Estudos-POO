package atividqade_0407;

public class Classe_de_teste {
    public static void main(String[] args) {

        for(int x = 0; x<=5; x++){

            Coveniado c =new Coveniado();
        NaoCoveniado nc=new NaoCoveniado();
        Coveniado c2 =new Coveniado();
        NaoCoveniado nc2=new NaoCoveniado();

        c.setNome("ANA MARIA DIAS DANTAS");
        c.setCpf("01528526945");
        c.setNomedocovenio("CONVÊNIO UNIMED ");
        c.setNomeEspecialidade("DERMATOLOGISTA");
        c.print();



            if(x % 2 == 0) {
                System.out.println("É par !");
                break;
            }
            else
                System.out.println("É impar!");
            break;


        }






    }
}
