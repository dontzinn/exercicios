import java.util.ArrayList;

public class ListaDeContas {
    private ArrayList<Inicia> contas;
    public ListaDeContas() {
        this.contas = new ArrayList<>();
    }
    public void adicionarConta(Inicia inicia) {
        this.contas.add(inicia);
    }
    public void removerConta(Inicia inicia) {
        this.contas.remove(inicia);
    }
    public Inicia buscarConta(String cpf){
        for (Inicia i : this.contas){
            if(i.getCpf().equals(cpf)){
                return i;
            }
            System.out.println(i.getNome());
        }
        return null;
    }
}
