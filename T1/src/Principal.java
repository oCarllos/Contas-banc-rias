
class Principal {
	public static void main(String[] args) {
  		
  		Data dataAbertura1 = new Data(25, 9, 2003);
  		Titular titularConta = new Titular("Gustavo", "123.456.789-00");
  		Conta novaConta = new Conta("2534", 2000.00, "001", titularConta, dataAbertura1);
  
   		//
   		
		System.out.println("Saldo atual: " + novaConta.getSaldo());
   	 	novaConta.sacar(200);
		System.out.println("Novo saldo: " + novaConta.getSaldo());
		System.out.println("Rendimento desse saldo �: " +novaConta.calcularRendimento());
		System.out.println("------------------------------");
		System.out.println("Nome da conta: " + titularConta);
		System.out.println("Numero da conta:" +novaConta.getNumero() +
						   "\nQuantidade de saldo:" +novaConta.getSaldo() +
						   "\nData de Abertura: " + dataAbertura1) ;
		System.out.println("------------------------------");
		System.out.println("||||||||||||||||||||||||||||||");
		
		////////////////////////////////////////////////////////
		
		
		
		Data dataAbertura= new Data(15, 4, 2015);
		Titular titularCarlao = new Titular("Carlão", "884.566.783-25");
		Conta contaDoCarlao = new Conta("5222", 999000, "002", titularCarlao, dataAbertura);		
		System.out.println("Nome da conta: " + titularCarlao);
		System.out.println("Data de Abertura: " + dataAbertura);
		
		if (contaDoCarlao.getSaldo() > novaConta.getSaldo() ); {
			System.out.println("A Conta do carlao e muito maior patrao: " + titularCarlao.getNome());
		}
		
		// E2
		Conta.mostraTotalDeContas();
		System.out.println("Saldo antes da doação: "+ contaDoCarlao.getSaldo());
		contaDoCarlao.doacao();
		System.out.println("Saldo depois da doação: "+ contaDoCarlao.getSaldo());
		for (int i = 0; i < 5; i++) {
			contaDoCarlao.adicionarSaldo(100);
		}
		System.out.println("Novo saldo:" + contaDoCarlao.getSaldo());
	
		System.out.println("------------------------------");
		System.out.println("||||||||||||||||||||||||||||||");
		
		//
		
	}
}
