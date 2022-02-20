
public class TestaValores {

	public static void main(String[] args) {
		// Conta conta = new Conta();
		// A conta está inconsistente.
		// conta.setAgencia(-50);
		// conta.setNumero(-330);
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println(Conta.getTotal());
		// O método getTotal() é um método static. Ou seja, ele não é um método
		// de uma instância específica, ele é um método da classe. Por isso, ele
		// pode ser acessado por Conta.getTotal(), não necessariamente conta2.getTotal().
	}
}
