import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

//    protected void imprimirContas() {
//        for (Conta contas: contas) {
//            System.out.println(contas);
//            System.out.println(String.format("Agencia: %d", this.conta));
//        }
//    }
}
