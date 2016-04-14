import javax.swing.JOptionPane;
public class Matriz {
	int i, j, cont=0, matrix[][] = new int[3][3];
	String message = "Vetor\n";
	public Matriz (int vec[]){
		for (i=0;i<3;i++){
			for (j=0;j<3;j++){
				matrix[i][j]=vec[cont];
				message = (message + vec[cont] + " ");
				cont++;
			}
		}
	}
	public void mostra(){
		message = (message + "\nMatriz\n");
		for (i=0;i<3;i++){
			for (j=0;j<3;j++){
				message = (message + matrix[i][j] + " ");
			}
			message = (message + "\n");
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
