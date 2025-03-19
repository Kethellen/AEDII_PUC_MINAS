import java.util.Scanner;

public class Main {

	//Menu de exercicios
	public static void main(String[] args) {

		System.out.println("Aula II - Laboratorio de AEDII");
		System.out.println("Exercicios: \nIf-else - 01 a 09");
		System.out.println("Repeticao 10 a 17");
		System.out.println("Array --- 18 a 47");
		System.out.println("Strings - 48 a 50\n");
		
		boolean sair = false;
		int qtde_exercicios = 50;
		
		//Menu de exercicios
		while(!sair) {
			
			System.out.println("\nSelecione o exercicio desejado: ");
			
			for(int i = 1; i <= qtde_exercicios; i++) {
				System.out.println( i + " - Exercicio");
			}
			
			System.out.println("0 - Sair");
			
			Scanner sc = new Scanner(System.in);
			int opcao = sc.nextInt();
			
			
			switch (opcao){
				case 0:
					System.out.println("\nPrograma finalizado! Obrigada!\n");
					sair = true;
					break;
				case 1:
					exercicio1();
					break;
				case 2:
					exercicio2();
					break;
				case 3:
					exercicio3();
					break;
				case 4:
					exercicio4();
					break;
				case 5:
					exercicio5();
					break;
				case 6:
					exercicio6();
					break;
				case 7:
					exercicio7();
					break;
				case 8:
					exercicio8();
					break;
				case 9:
					exercicio9();
					break;
				case 10:
					exercicio10();
					break;
				case 11:
					exercicio11();
					break;
				case 12:
					exercicio12();
					break;
				case 13:
					exercicio13();
					break;
				case 14:
					exercicio14();
					break;
				case 15:
					exercicio15();
					break;
				case 16:
					exercicio16();
					break;
				case 17:
					exercicio17();
					break;
				case 18:
					exercicio18();
					break;
				case 19:
					exercicio19();
					break;
				case 20:
					exercicio20();
					break;
				case 21:
					exercicio21();
					break;
				case 22:
					exercicio22();
					break;
				case 23:
					exercicio23();
					break;
				case 24:
					exercicio24();
					break;
				case 25:
					exercicio25();
					break;
				case 26:
					exercicio26();
					break;
				case 27:
					exercicio27();
					break;
				case 28:
					exercicio28();
					break;
				case 29:
					exercicio29();
					break;
				case 30:
					exercicio30();
					break;
				case 31:
					exercicio31();
					break;
				case 32:
					exercicio32();
					break;
				case 33:
					exercicio33();
					break;
				case 34:
					exercicio34();
					break;
				case 35:
					exercicio35();
					break;
				case 36:
					exercicio36();
					break;
				case 37:
					exercicio37();
					break;
				case 38:
					exercicio38();
					break;
				case 39:
					exercicio39();
					break;
				case 40:
					exercicio40();
					break;
				case 41:
					exercicio41();
					break;
				case 42:
					exercicio42();
					break;
				case 43:
					exercicio43();
					break;
				case 44:
					exercicio44();
					break;
				case 45:
					exercicio45();
					break;
				case 46:
					exercicio46();
					break;
				case 47:
					exercicio47();
					break;
				case 48:
					exercicio48();
					break;
				case 49:
					exercicio49();
					break;
				case 50:
					exercicio50();
					break;
				default:
					sair = true;
					break;
			}
		}
		
	}
	
	public static void exercicio1() {
		System.out.println("\nVerificacao de aprovacao de alunos\n");
		System.out.println("Insira a nota do aluno: ");
		Scanner sc = new Scanner(System.in);
		float nota = sc.nextFloat();
		
		//Verifica se a nota eh um valor valido
		while (nota > 100.0 || nota < 0.0){
			System.out.println("Nota invalida, por favor, digite um valor entre 0 e 100. Digite um novo valor: ");
			nota = sc.nextFloat();
		} 
		
		if(nota >= 80) {
			System.out.println("Parabens, muito bom\n");
		}
		else if(nota >= 70 && nota < 80) {
			System.out.println("Parabens, aprovado\n");
		}
		else {
			System.out.println("Infelizmente, reprovado\n");
		}
	}

	public static void exercicio2() {
		System.out.println("\nVerificacao do tipo de triangulo\n");
		
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo: ");
		a = sc.nextFloat();
		
		System.out.println("Digite o segundo lado do triangulo: ");
		b = sc.nextFloat();
		
		System.out.println("Digite o terceiro lado do triangulo: ");
		c = sc.nextFloat();
		
		if(a == b && a == c) {
			System.out.println("Eh um triangulo equilatero\n");
		}
		else if((a == b && a != c) || (a != b && b == c) || (a == c && a != b)) {
			System.out.println("Eh um triangulo isoceles\n");
		}
		else {
			System.out.println("Eh um triangulo escaleno\n");
		}
	}

	public static void exercicio3() {
		System.out.println("\nImprime o maior e o menor de tres numeros\n");
		
		int x, y, z, maior = 0, menor = 0;
		boolean n_iguais = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		x = sc.nextInt();
	
		System.out.println("Digite o quarto numero: ");
		y = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		z = sc.nextInt();

		if(x == y && x == z) {
			n_iguais = true;
		}
		else {
			if(x >= y && x >= z) {
				maior = x;
				if(y <= z) {
					menor = y;
				}
				else {
					menor = z;
				}
			}
			else if(y >= x && y >= z) {
				maior = y;
				if(x <= z) {
					menor = x;
				}
				else {
					menor = z;
				}
			}
			else if(z >= x && z >= y) {
				maior = z;
				if(x <= y) {
					menor = x;
				}
				else {
					menor = y;
				}
			}
		}
		
		if(!n_iguais) {
			System.out.println("O maior numero eh: " + maior);
			System.out.println("O menor numero eh: " + menor + "\n");
		}
		else {
			System.out.println("Os numeros sao iguais\n");
		}
	}

	public static void exercicio4() {
		System.out.println("\nImprime o maior de uma lista de 10 numeros\n");
		
		Scanner sc = new Scanner(System.in);
		
		int tam = 10, maior;
		int n[] = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			System.out.println("Digite um numero: ");
			n[i] = sc.nextInt();
		}
		
		maior = n[0];
		
		for(int j = 1; j < tam; j++) {
			if(maior < n[j]) {
				maior = n[j];
			}
		}
		
		System.out.println("O maior numero da sequencia eh: " + maior);
		
	}
	
	public static void exercicio5() {
		System.out.println("\nLeitura de dois numeros e outras verificacoes\n");
		int a, b, result = -1;
	     String nome = "/0";

	     Scanner sc = new Scanner(System.in);
	     System.out.println("Digite um numero: ");
	     a = sc.nextInt();

	     System.out.println("Digite o segundo numero: ");
	     b = sc.nextInt();

	     if(a == 45 || b == 45){
	    	 result = a + b;
	     }
	     else if( a > 20 && b > 20){
		     if(a > b){
		    	 result = a - b;
		     }
		     else{
		    	 result = b - a;
		     }
	     }
	     else if((a < 10 && b != 0) || (b < 10 && a != 0)){
	    	 result = a/b;
	     }
	     else{
	    	 nome = "Kethellen";
	     }

	     if(nome == "/0"){
	    	 System.out.println(result);
	     }
	     else{
	    	 System.out.println(nome);
	     }
		
	}
	
	public static void exercicio6() {
		System.out.println("\nResultado de uma partida de futebol\n");
	    Scanner sc = new Scanner(System.in);

	    int m, v;

	    System.out.println("Digite o a qtde de gols do time mandante: ");
	    m = sc.nextInt();
	    System.out.println("Digite o a qtde de gols do time visitante: ");
	    v = sc.nextInt();

	    if(m > v){
	        System.out.println("O time mandante venceu");
	    }
	    else if(v > m){
	        System.out.println("O time visitante venceu");
	    }
	    else{
	        System.out.println("O jogo empatou");
	    }
	}
	
	public static void exercicio7() {
		System.out.println("\nAnalise de credito para emprestimo\n");
	    double salario, prestacao;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Informe o valor do salario bruto: ");
	    salario = sc.nextDouble();
	    System.out.println("Informe o valor da prestacao: ");
	    prestacao = sc.nextDouble();

	    if (salario >= 0.4 * prestacao) {
	        System.out.println("Emprestimo concedido");
	    } else {
	        System.out.println("Emprestimo negado");
	    }
	}
	
	public static void exercicio8() {
		System.out.println("\nRaiz cubica e logaritmo\n");
		
		Scanner sc = new Scanner(System.in);
		double a, b, menor = 0, maior = 0, raiz, lg;
		
		System.out.println("Digite primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Digite segundo numero: ");
		b = sc.nextInt();
		
		if(a > b) {
			maior = a;
			menor = b;
		}
		else {
			maior = b;
			menor = a;
		}
		
		raiz = Math.cbrt(menor);
		lg = log(maior, menor);
		
		System.out.println("A raiz cubica de " + menor + " eh " + raiz);
		System.out.println("O log de " + menor + " na base " + maior +" eh: " + lg);
		
	}
	
	public static void exercicio9() {
		System.out.println("\nLeitura de 10 numeros e impressao do maior e do menor\n");
		
		int num[] = new int[10];
		int maior, menor;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		menor = num[0];
		maior = num[0];
		
		for(int i = 1; i < 10; i++) {
			if(menor > num[i]) {
				menor = num[i];
			}
			if(maior < num[i]) {
				maior = num[i];
			}
			
		}
		
		System.out.println("O menor numero digitado eh: " + menor);
		System.out.println("O maior numero digitado eh: " + maior);
	}

	public static void exercicio10() {
		System.out.println("\nLeitura de 10 numeros e impressao do log na base 10\n");
		
		double num[] = new double[10];
		double result;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			num[i] = j++;
		}
		
		for(int i = 0; i < 10; i++) {
			result = log(10, num[i]);
			System.out.println("O log de " + num[i] + " eh: " + result);
		}
	}

	public static void exercicio11() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
		
		double media = 0;
		double notas[] = new double[5];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while(i < 5) {
			System.out.println("Digite a nota " + (i+1));
			notas[i] = sc.nextDouble();
			media += notas[i];
			i++;
		}
		
		media = media/5;
		System.out.println("A media das notas eh: " + media);
	}
    
	public static void exercicio12() {
		System.out.println("\nLeitura de 5 notas de alunos e mostrar as maiores de 80\n");
		Scanner sc = new Scanner(System.in);
		
		double notas[] = new double[5];
		double media = 0;
		int cont = 0;
				
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a nota " + (i+1));
			notas[i] = sc.nextDouble();
			if(notas[i] >= 80) {
				media += notas[i];
				cont++;
			}
		}
		
		media = media/cont;
		
		System.out.println("A media das notas acima de 80 eh: " + media);
	}
	
	public static void exercicio13() {
		System.out.println("\nLeitura de n numeros e impressao do maiores que a media\n");
		
		int n = 0;
		double num[];
		double media = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a qtde de numeros que deseja verificar: ");
		n = sc.nextInt();
		
		num = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextInt();
			media += num[i];
		}
		
		media = media/n;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Os numeros acima da media sao: ");
			if(num[i] >= media) {
				System.out.println(num[i]);
			}
		}
	}
	
	public static void exercicio14() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio15() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio16() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio17() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio18() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio19() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio20() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio21() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio22() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio23() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio24() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio25() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio26() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio27() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio28() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio29() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio30() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio31() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio32() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio33() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio34() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio35() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio36() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio37() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio38() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio39() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio40() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio41() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio42() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio43() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio44() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio45() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio46() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio47() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio48() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio49() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	
	public static void exercicio50() {
		System.out.println("\nLeitura de 5 notas de alunos para calculo da media\n");
	}
	public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
}



