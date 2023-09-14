package login;

public class PessoaJuridica extends Pessoa {
    private String cpf;
    private int idade;
    private String cnpj;

    public PessoaJuridica() {
        super();
        this.cpf = "";
        this.idade = 0;
        this.cnpj = "";
    }

    public PessoaJuridica(int id, String nome, String cpf, int idade, String cnpj) {
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCnpj(String cnpj) {
     this.cnpj = cnpj;
    }
    public String getCnpj() {
     return cnpj;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + this.cpf + ", idade: " + this.idade + ", cnpj: " + this.cnpj);
    }
}
