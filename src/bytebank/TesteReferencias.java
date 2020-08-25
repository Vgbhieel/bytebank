package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		ControleBonificacao controle = new ControleBonificacao();
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		controle.registra(g1);
				
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		controle.registra(f);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}

}
