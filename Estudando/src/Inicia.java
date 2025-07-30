public class Inicia {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    public Inicia(String nome, int idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        System.out.println("Conta iniciada com sucesso com sucesso!");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public boolean equals(Inicia inicia){
        if (this.nome.equals(inicia.nome) && this.idade == inicia.idade && this.sexo.equals(inicia.sexo) && this.cpf.equals(inicia.cpf)){
            return true;
        }else{
            return false;
        }

    }
}
