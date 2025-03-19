
public class Main {

	public static void main(String[] args) {
		System.out.println("Aula III - Laboratorio de AEDII");
		//Ler string e armazenar como valor inteiro ou real
		String x = MyIO.readLine();
		
		int numInteiro = Integer.parseInt(x);
		double numReal = Double.parseDouble(x);
		
		System.out.println(numInteiro + " " + numReal);
		//Leitura de linha com diversos dados separados por um caracter
		//Exemplo: 674;37.2;"Ana"
		
		String linha = MyIO.readLine(); //Leitura como string
		String[] dados = linha.split(";"); 
		//Armazemaneto da linha lida como vetor de string.  
		//O tamanho do vetor eh calculado como total de separadores +1
		
		int num1 = Integer.parseInt(dados[0]);
		double num2 = Double.parseDouble(dados[1]);
		String nome = dados[2];
		
		System.out.println(num1 + " " + num2 + " " + nome);
	}
}