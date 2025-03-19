
public class Main {

	public static void main(String[] args) {
		questao1();
		questao2();
		questao3();
	}

	public static void questao1() {
		//Usando My.IO para imprimir ~ sem erro no verde
		MyIO.println("QUESTÃO 1");
		String linha = MyIO.readLine();
		double resp;
		
		while(!linha.equals("FIM")) {
				resp = aliquota(Integer.parseInt(linha));
				MyIO.println(resp * 100 + "%");
				linha = MyIO.readLine();
		}
	}
	
	public static void questao2() {
		MyIO.println("QUESTÃO 2");
		String linha = MyIO.readLine();;
		double resp;
		
		while(!linha.equals("FIM")) {
				resp = montante(linha);
				MyIO.printf("R$ %.2f \n", resp);
				linha = MyIO.readLine();
		}
	}
	
	public static void questao3() {
		MyIO.println("QUESTÃO 3");
		String linha = MyIO.readLine();;
		double resp;
		
		while(!linha.equals("FIM")) {
			resp = lucro(linha);
			MyIO.printf("R$ %.2f \n", resp);
			linha = MyIO.readLine();
		}
	}
	
	public static double aliquota(int dias) {
		double alq = 0;
		
		if (dias >= 0 && dias <= 180) {
			alq = 0.225;
		}
		else if(dias >= 181 && dias <= 360) {
			alq = 0.20;
		}
		else if(dias >= 361 && dias <= 720) {
			alq = 0.175;
		}
		else {
			alq = 0.15;
		}
		return alq;
	}

	public static double montante(String lin) {
		double mont = 0, valor, juros;
		int dias;
		
		String[] dados = lin.split(";");
		valor = Double.parseDouble(dados[0]);
		juros = Double.parseDouble(dados[1]);
		dias = Integer.parseInt(dados[2]);
		
		mont = valor * Math.pow((1 + juros),dias);
		return mont;
	}

	public static double lucro(String lin) {
		double luc = 0, valor, juros, mont;
		int dias;
		
		mont = montante(lin);
		
		String[] dados = lin.split(";");
		valor = Double.parseDouble(dados[0]);
		juros = Double.parseDouble(dados[1]);
		dias = Integer.parseInt(dados[2]);
		
		luc = (mont - valor) * (1 - aliquota(dias));
		
		return luc;
	}
}
