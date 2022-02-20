
public class TestaValores {

	public static void main(String[] args) {
		// Conta conta = new Conta();
		// A conta est� inconsistente.
		// conta.setAgencia(-50);
		// conta.setNumero(-330);
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println(Conta.getTotal());
		// O m�todo getTotal() � um m�todo static. Ou seja, ele n�o � um m�todo
		// de uma inst�ncia espec�fica, ele � um m�todo da classe. Por isso, ele
		// pode ser acessado por Conta.getTotal(), n�o necessariamente conta2.getTotal().
	}
}
