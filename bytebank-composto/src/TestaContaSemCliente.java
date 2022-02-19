
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDeMarcelle = new Conta();
		// System.out.println(contaDeMarcelle.saldo);
		System.out.println(contaDeMarcelle.getSaldo());
		
		contaDeMarcelle.titular = new Cliente();
		System.out.println(contaDeMarcelle.titular);
		
		contaDeMarcelle.titular.nome = "Marcelle";
		System.out.println(contaDeMarcelle.titular.nome);
	}
}
