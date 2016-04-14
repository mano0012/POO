import javax.swing.JOptionPane;
public class Matriz {
	int mat[][] = new int[5][7];
	int i,j,posi,posj,maior;
	public Matriz (){
		for (i=0;i<5;i++){
			for (j=0;j<7;j++){
				mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento A[" + i + "][" + j + "]"));
			}	
		}
	}
	public void calcula(){
		maior=mat[0][0];
		posi = 0;
		posj = 0;
		for (i=0;i<5;i++){
			for (j=0;j<7;j++){
				if (mat[i][j]>maior){
					maior = mat[i][j];
					posi = i;
					posj = j;
				}
			}
		}
	}
	public void mostra(){
		JOptionPane.showMessageDialog(null,"O maior numero é " + maior + " e esta na linha " + posi + " e na coluna " + posj);
	}
}
