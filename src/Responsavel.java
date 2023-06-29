public class Responsavel extends Pessoa {
    private String parentesco;

    public Responsavel(String cpf, String rg, String nome, int idade, String parentesco) {
        super(cpf, rg, nome, idade);
        this.parentesco = parentesco;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Parentesco: " + parentesco);
    }
}
