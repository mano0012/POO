import java.util.Scanner;
public class EX1 {
	public static void main(String args[]){
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite a quantidade de KW consumidos: ");
		float qtd=leitor.nextFloat();
		System.out.println("Digite o valor do KWh: ");
		float val=leitor.nextFloat();
		double tot = qtd*val*0.9 ;
		System.out.println("Total que o consumidor deverá pagar " +tot);
		leitor.close();
	}
}