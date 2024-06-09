
public class Titular {
    private String nome;
    private String cpf;

    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "" + nome + "\nCPF: " + cpf;
    }
    
    

    // Getters
    
    public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }    
}