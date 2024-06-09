
public class Conta {
	private String numero;
	private double saldo;
	private String agencia;
  	private Titular titular;
  	private Data data_abertura;
  	private static int totalDeContas = 0;
  	
  	public Conta(String numero, double saldo, String agencia, Titular titular, Data data_abertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
        this.data_abertura = data_abertura;
        totalDeContas++;
    }
  	public Conta() {}
  	
  	public void adicionarSaldo(double valor) {
  		saldo += valor;
  	}
  	
  	public void doacao() {
  		if (saldo >= 500) {
  			saldo -= 50;
  			System.out.println("Doação realizada, 10% enviados aos fundos");
  		}else {
  			System.out.println("Você não possui dinheiro suficiente para realizar doações!");
  		}
  	}
  	
  	public static void mostraTotalDeContas() {
  		System.out.println("O Total de contas é:" + totalDeContas);
  	}
  	
	double sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		return saldo = novoSaldo;
	}
	
	double depositar(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		return saldo = novoSaldo;
	}
	
	double calcularRendimento() {
		return this.saldo * 0.1;
		
	}
	
	// Getters
	
	public String getNumero(){
		return numero;
	}
	
	public Titular getTitular() {
		return titular;
		
	}
	public String getAgencia() {
		return agencia;
	} 
	public Data getDataAbertura() {
		return data_abertura;
	}	
	
	public double getSaldo() {
		return saldo;
	}
	// Setters

	public void setData_abertura(Data data_abertura) {
		this.data_abertura = data_abertura;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
		
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	} 
	public void setDataAbertura(Data data_abertura) {
		this.data_abertura = data_abertura;
	}
	
	
	
	
	
}
