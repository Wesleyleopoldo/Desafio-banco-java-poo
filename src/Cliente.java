public class Cliente {

    private String nome;
    private String cpf;
    private int numeroDaConta;

    public Cliente(String cpf, String nome, int numeroDaConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", conta=" + numeroDaConta +
                '}';
    }
}
