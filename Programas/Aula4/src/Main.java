
public class Main {

	public static void main(String[] args) {
		//Lista de exercicios 2 - Verde
		
		int n, i = 0; //qtde de entradas do pub.in
		
		String linha = MyIO.readLine();
		n = Integer.parseInt(linha);
		Jogo[] jogos = new Jogo[n];
		
		linha = MyIO.readLine();
		
		//Instanciando objetos da classe jogo com o construtor padrao

		while(!linha.equals("FIM")) {
			jogos[i] = new Jogo();
			jogos[i] = jogos[i].ler(linha);
			i++;
			linha = MyIO.readLine();
		}
		
		linha = MyIO.readLine();
		
		while(!linha.equals("FIM")) {
			String[] dados = linha.split(";");
			
			for(int j = 0; j < n; j++) {
				if(jogos[j].get_nome().equals(dados[0])) {
					jogos[j].imprimir();
					linha = MyIO.readLine();
					break;
				}
			}
		}
		
	}

}

class Jogo {
	private int rank;
	private int ano;
	
	private String nome;
	private String plataforma;
	private String genero;
	private String editora;
	
	private double NA_Vendas;
	private double EU_Vendas;
	private double JP_Vendas;
	private double Outras_Vendas;
	private double Vendas_Global;
	
	void Jogo() {
		nome = "";
		plataforma = "";
		ano = 1900;
	}
	
	void set_rank(int rank) {
		this.rank = rank;
	}
	void set_ano(int ano) {
		this.ano = ano;
	}
	void set_nome(String nome) {
		this.nome = nome;
	}
	void set_plataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	void set_genero(String genero) {
		this.genero = genero;
	}
	void set_editora(String editora) {
		this.editora = editora;
	}
	void set_NA_Vendas(Double NA_Vendas) {
		this.NA_Vendas = NA_Vendas;
	}
	void set_EU_Vendas(Double EU_Vendas) {
		this.EU_Vendas = EU_Vendas;
	}
	void set_JP_Vendas(Double JP_Vendas) {
		this.JP_Vendas = JP_Vendas;
	}
	void set_Outras_Vendas(Double Outras_Vendas) {
		this.Outras_Vendas = Outras_Vendas;
	}
	void set_Vendas_Global(Double Vendas_Global) {
		this.Vendas_Global = Vendas_Global;
	}
	
	
	int get_rank() {
		return rank;
	}
	int get_ano() {
		return ano;
	}
	String get_nome() {
		return nome;
	}
	String get_plataforma() {
		return plataforma;
	}
	String get_genero() {
		return genero;
	}
	String get_editora() {
		return editora;
	}
	double get_NA_Vendas() {
		return NA_Vendas;
	}
	double get_EU_Vendas() {
		return EU_Vendas;
	}
	double get_JP_Vendas() {
		return JP_Vendas;
	}
	double get_Outras_Vendas() {
		return Outras_Vendas;
	}
	double get_Vendas_Global() {
		return Vendas_Global;
	}
	
	public Jogo clone() {
		Jogo resp = new Jogo();
		resp.set_rank(this.rank);
		resp.set_nome(this.nome);
		resp.set_plataforma(this.plataforma);
		resp.set_ano(this.ano);
		resp.set_editora(this.editora);
		resp.set_NA_Vendas(this.NA_Vendas);
		resp.set_EU_Vendas(this.EU_Vendas);
		resp.set_JP_Vendas(this.JP_Vendas);
		resp.set_Outras_Vendas(this.Outras_Vendas);
		resp.set_Vendas_Global(this.Vendas_Global);
		return resp;
	}
	
	Jogo ler(String linha) {
		String[] dados = linha.split(";");
		Jogo resp = new Jogo();
		
		resp.set_rank(Integer.parseInt(dados[0]));
		resp.set_nome(dados[1]);
		resp.set_plataforma(dados[2]);
		resp.set_ano(Integer.parseInt(dados[3]));
		resp.set_genero(dados[4]);
		resp.set_editora(dados[5]);
		resp.set_NA_Vendas(Double.parseDouble(dados[6]));
		resp.set_EU_Vendas(Double.parseDouble(dados[7]));
		resp.set_JP_Vendas(Double.parseDouble(dados[8]));
		resp.set_Outras_Vendas(Double.parseDouble(dados[9]));
		resp.set_Vendas_Global(Double.parseDouble(dados[10]));
		
		return resp;
	}
	
	public String toString() {
		String resp;
		return resp = get_nome() + ";" + get_editora() + ";" + get_ano() + ";" + get_Vendas_Global() + ";";
	}
	
	//Metodo alterado conforme dados do pub.out
	void imprimir() {
		MyIO.print(get_editora() + ". ");
		MyIO.print(get_nome() + ". ");
		MyIO.print(get_ano() + ". ");
		MyIO.println("Vendas global: " + get_Vendas_Global() + ".");
		
	}
	
}
