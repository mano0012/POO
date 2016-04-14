import javax.swing.JOptionPane;
public class Principal {
	public static void main (String[] args){
		int lin = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas das matrizes"));
		int col = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas das matrizes"));
		int m1[][] = new int[lin][col],m2[][]= new int[lin][col],m3[][]= new int[lin][col];
		Matrizes resultante = new Matrizes(lin,col,m1,m2,m3);
	}
}
