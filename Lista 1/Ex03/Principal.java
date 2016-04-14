import javax.swing.JOptionPane;
public class Principal {
	public static void main (String[] args){
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		Calculadora a = new Calculadora(num1,num2);
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisao"));
		switch (op){
			case 1:
				a.sum();
			break;
			case 2:
				a.sub();
			break;
			case 3:
				a.mult();
			break;
			case 4:
				a.div();
			break;
			default:
				JOptionPane.showMessageDialog(null, "Codigo inválido");
				System.exit(0);
			break;
		}
		JOptionPane.showMessageDialog(null, "Resultado: " + a.mostraResult());
	}
}
