import java.util.Scanner;
public class Ex06 {
	public static void main (String args[]){
		int ano;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o ano: ");
		ano=leitor.nextInt();
		if (ano%4 == 0 && ano%100 != 0){
			System.out.println("Ano bissexto");
		} else if (ano%4 == 0 && ano%400 == 0){
			System.out.println("Ano bissexto");
		} else System.out.println("O ano não é bissexto");
		leitor.close();
	}
}
