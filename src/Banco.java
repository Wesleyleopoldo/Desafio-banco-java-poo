import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Banco {

    Map<String, Cliente> cliente = new HashMap<>();
    private String nome;

    public Banco() {
        this.cliente = cliente;
    }

    public void adicionarCliente(String cpf,String nome, int numeroDaConta){
        cliente.put(cpf, new Cliente(cpf, nome, new ContaCorrente().getNumero()));
    }

    public void exibirClientes(){
        System.out.println(cliente);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        if(!cliente.isEmpty()){
            return cliente.get(cpf);
        } else
            throw new RuntimeException("SEM CLIENTES!!!");
    }

    public static void main(String [] args) {
        String cpf = "149.034.814-09";
        String nome = "Wesley Cauan";
        Conta novaConta = new ContaCorrente();
        Cliente wesley = new Cliente(cpf, nome, novaConta.getNumero());
        Banco bancoDeDados = new Banco();

        bancoDeDados.adicionarCliente(cpf, nome, novaConta.getNumero());

        novaConta.depositar(150);

        bancoDeDados.exibirClientes();
    }
}