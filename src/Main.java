import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "João";
		p1.idade = 15;

		Pessoa p2 = new Pessoa();
		p2.nome = "Leandro";
		p2.idade = 21;

		Pessoa p3 = new Pessoa();
		p3.nome = "Paulo";
		p3.idade = 17;

		Pessoa p4 = new Pessoa();
		p4.nome = "Jessica";
		p4.idade = 18;

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		int indice = 0;
		int midade = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).idade > midade) {
				midade = pessoas.get(i).idade;
				indice = i;
			}
		}
		System.out.println("A pessoa com maior idade é " + pessoas.get(indice).nome + " com " + midade + " anos");
		System.out.println("--------------------------------------------------------------------------");

		// Exercicio 2

		for (int i = 0; i < pessoas.size(); i++) {
			indice = i;
			System.out.println(
					"Temos na lista " + pessoas.get(indice).nome + " com :" + pessoas.get(indice).idade + " anos");
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Removemos os menores de idade");

		int mpess = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).idade < 18) {
				indice = i;
				pessoas.remove(i);
				System.out.println("Temos na lista : " + pessoas.get(indice).nome + " com " + pessoas.get(mpess).idade);

			}

		}

		// Exercicio3

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getNome().contentEquals("Jessica")) {
				System.out.println("Jessica possue " + pessoas.get(i).idade + " anos ");
			}
		}
	}

}
