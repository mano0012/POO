import javax.swing.JOptionPane;
public class Principal {
	public static void main (String[] args){
		int i, vetor[] = new int [9];
		for (i=0;i<9;i++){
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + " numero"));
		}
		Matriz mat = new Matriz(vetor);
		mat.mostra();
	}
}
