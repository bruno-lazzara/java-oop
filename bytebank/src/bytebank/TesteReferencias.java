package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		// A refer�ncia salva na primeiraConta foi atribu�da a segundaConta,
		// o objeto permanece o mesmo, mas tem duas vari�veis "apontando"
		// para este mesmo objeto.

		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("s�o a mesm�ssima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
