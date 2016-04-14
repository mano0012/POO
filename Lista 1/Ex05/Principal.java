import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args){
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de metros total"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de metros construidos"));
		Imposto pagar = new Imposto (b,a);
		pagar.calcula();
		JOptionPane.showMessageDialog(null, "O total a ser pago e impostos é R$ " + pagar.mostra());
	}
}
