import javax.swing.JOptionPane;
public class Principal {
	public static void main (String[] args){
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double p = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		IMC pessoa = new IMC(p,a);
		pessoa.calcula();
		JOptionPane.showMessageDialog(null, "O IMC da pessoa é "+ pessoa.mostraIMC());
	}
}
