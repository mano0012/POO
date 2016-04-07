import java.util.Scanner;
public class Ex05 {
	public static void main (String args[]){
		double P1,P2,P3,NT,NF;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		P1=leitor.nextDouble();
		System.out.println("Digite a nota 2: ");
		P2=leitor.nextDouble();
		System.out.println("Digite a nota 3: ");
		P3=leitor.nextDouble();
		System.out.println("Digite a nota de trabalho: ");
		NT=leitor.nextDouble();
		NF = (P1*0.2+P2*0.3+P3*0.5)*0.85+(NT*0.15);
		System.out.println("Nota final do aluno "+NF);
		leitor.close();
	}
}