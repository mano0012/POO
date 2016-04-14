import javax.swing.JOptionPane;
public class Matrizes {
	int i,j;
	String message = "Matriz Resultante\n";
	public Matrizes (int linhas, int colunas, int mat1[][], int mat2[][],int mat3[][]){
		for (i=0;i<linhas;i++){
			for (j=0;j<colunas;j++){
				mat1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("A["+i+"]["+j+"]"));
				
			}	
		}
		for (i=0;i<linhas;i++){
			for (j=0;j<colunas;j++){
				mat2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("B["+i+"]["+j+"]"));
				
			}	
		}
		for (i=0;i<linhas;i++){
			for (j=0;j<colunas;j++){
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}	
		}
		for (i=0;i<linhas;i++){
			for (j=0;j<colunas;j++){
				message = (message + mat3[i][j]+"  ");
			}	
			message = message + "\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
