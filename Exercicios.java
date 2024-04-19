public class Exercicios {

    public Exercicios(){}

    String modeloDoCarro;
    String corDoCarro;
    int anoDeLancamento;

    void exibirFichaTecnica(){

        System.out.println("Título: " + modeloDoCarro);
        System.out.println("Artista: " + corDoCarro);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    int calulaIdadeDoCarro(){

        return 2024 - anoDeLancamento;

    }

}
