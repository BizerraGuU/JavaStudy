public class Main {

    public static void main(String[] args) {
        // Write your code here
        Exercicios exercicios = new Exercicios();

        exercicios.modeloDoCarro = "Fusca";
        exercicios.corDoCarro = "Azul";
        exercicios.anoDeLancamento = 1969;

        exercicios.exibirFichaTecnica();

        System.out.println("O carro tem: " + exercicios.calulaIdadeDoCarro() + " anos.");

    }
}
