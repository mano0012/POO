import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args){
		Valor a = new Valor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de aumento: "));
		a.aumento(cod);
		a.imposto();
		JOptionPane.showMessageDialog(null, "Valor final: R$ " + a.mostraVal());
		
	}
}
