
public class TestaBanco {

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.nome = "Bruno Lazzara";
		bruno.cpf = "123.123.123-12";
		bruno.profissao = "Programador";
		
		Conta contaDeBruno = new Conta();
		contaDeBruno.deposita(100);
		
		contaDeBruno.titular = bruno;
		System.out.println(contaDeBruno.titular.nome);
		System.out.println(contaDeBruno.titular);
		System.out.println(bruno);
	}
}
