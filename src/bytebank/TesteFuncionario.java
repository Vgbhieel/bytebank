package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario vitor = new Funcionario();
		vitor.setNome("Vitor Gabriel");
		vitor.setCpf("162.682.282-44");
		vitor.setSalario(2600.00);

		System.out.println(vitor.getNome());
		System.out.println(vitor.getBonificacao());
	}

}
