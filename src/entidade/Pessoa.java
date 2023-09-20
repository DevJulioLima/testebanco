package entidade;

public class Pessoa {
    private int cpf;
    private String nome;
    private int rg;
    private int telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(int cpf, String nome, int rg, int telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
