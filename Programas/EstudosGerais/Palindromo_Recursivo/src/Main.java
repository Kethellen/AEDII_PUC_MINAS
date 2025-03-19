import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		
		String s = sc.next();
		
		System.out.println("Eh " + ehPalindromo(s));
		
		

	}
	
	public static boolean ehPalindromo(String s) {
		return ehPalindromo(s, 0);
		
	}
	public static boolean ehPalindromo(String s, int i) {
		boolean resp = true;
		
		if(i >= s.length()/2) {
			resp = true;
		}
		else if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
			resp = false;
		}
		else {
			ehPalindromo(s, i + 1);
		}
		return resp;
	}

}
