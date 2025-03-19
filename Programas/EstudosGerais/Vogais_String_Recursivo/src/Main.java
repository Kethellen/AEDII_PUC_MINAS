import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		
		String s = sc.next();
		
		int x = qtde_vogais(s);
		
		System.out.println("A palavra " + s + " tem " + x + " vogais");
	}
	
	public static int qtde_vogais(String c) {
		return qtde_vogais(c, 0, 0);
	}

	public static int qtde_vogais(String c, int i, int count) {
		
		if(c.length() > i) {
			char aux = toUpper(c.charAt(i));
			if(aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
				count++;
			}
			
			count = qtde_vogais(c, i + 1, count);
		}
		
		return count;
		
		
	}
	
	public static char toUpper(char c){
		return (c >= 'a' && c <= 'z') ? (char)(c - 32) : c ;
	}

}
