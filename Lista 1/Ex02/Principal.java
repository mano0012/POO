import javax.swing.JOptionPane;
public class Principal {
		public static void main(String[] args){
		double salHr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Salario-Hora"));
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes"));
		Salario func = new Salario(salHr,horas,dependentes);
		String message = "Salario bruto: R$ ";
		func.INSS();
		func.IR();
		func.salLiq();
		message = (message + func.mostraSalT() + "\nDesconto INSS: R$ " + func.mostraINSS() + "\nDesconto IR: R$ " + func.mostraIR() + "\nSalario Liquido: R$ " + func.mostraSalL());
		JOptionPane.showMessageDialog(null, message);
	}
}
