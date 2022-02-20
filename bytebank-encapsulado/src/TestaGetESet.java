
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente bruno = new Cliente();
		// conta.titular = bruno;
		bruno.setNome("Bruno Lazzara");
		
		conta.setTitular(bruno);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Mesma atribui��o, mas em duas linhas, utilizando uma vari�vel tempor�ria:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		// Verificando as refer�ncias e endere�os de mem�ria:
		System.out.println(titularDaConta);
		System.out.println(bruno);
		System.out.println(conta.getTitular());
		
	}
}
