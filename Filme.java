public class Filme {

    public Filme(){}

    String nomeDoFilme;
    int anoDeLancamento;
    int duracaoEmMinutos;

    boolean incluidoNoPlano;

    double somaDasAvaliacoes;
    int totalDasAvaliacoes;

    void exibeFichaTecnica(){

        System.out.println("Nome: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");

    }

    void avaliaFilme(int notaDoUsuario){

        somaDasAvaliacoes += notaDoUsuario;
        totalDasAvaliacoes++;

    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }


}
