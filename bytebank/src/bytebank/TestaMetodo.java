package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDeBruno = new Conta();
		contaDeBruno.saldo = 100;
		contaDeBruno.deposita(50);
		
		System.out.println(contaDeBruno.saldo);
		
		boolean conseguiuRetirar = contaDeBruno.saca(20);
		System.out.println(contaDeBruno.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDeMarcelle = new Conta();
		contaDeMarcelle.deposita(1000);
		
		boolean sucessoTransferencia = contaDeMarcelle.transfere(300, contaDeBruno);
		if (sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDeMarcelle.saldo);
		System.out.println(contaDeBruno.saldo);
		
		contaDeBruno.titular = "Bruno Lazzara";
		System.out.println(contaDeBruno.titular);
	}
}
