public class Diretor extends Pessoa {
    private String setor;

    public Diretor(String cpf, String rg, String nome, int idade, String setor) {
        super(cpf, rg, nome, idade);
        this.setor = setor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Setor: " + setor);
    }
}
