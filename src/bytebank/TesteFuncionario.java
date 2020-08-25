package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario vitor = new Funcionario();
		vitor.setNome("Vitor Gabriel");
		vitor.setCpf("163.688.887-92");
		vitor.setSalario(2600.00);

		System.out.println(vitor.getNome());
		System.out.println(vitor.getBonificacao());
	}

}
