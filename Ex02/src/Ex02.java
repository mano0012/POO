import java.util.Scanner;
public class Ex2 {
	public static void main (String args[]){
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		int i = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		int j = leitor.nextInt();
		if (i>j){
			System.out.println("O menor número é "+j);
		} else if (i<j){
			System.out.println("O menor numero é "+i);
		} else System.out.println("Os dois numeros sao iguais");
		leitor.close();
	}
}
