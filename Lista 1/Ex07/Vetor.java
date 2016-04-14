import javax.swing.JOptionPane;
public class Vetor {
	int m[] = new int[9];
	int i;
	String message = "Numeros impares|Posição\n";
	public Vetor (){
		for (i=0;i<9;i++){
			m[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + " numero"));
		}
	}
	public void mostra(){
		for (i=0;i<9;i++){
			if (m[i]%2==1){
				JOptionPane.showMessageDialog(null,"Impar " + m[i]);
				message = (message + m[i] + " | " + i + "\n");
			}
		}
		JOptionPane.showMessageDialog(null,message);
	}
}
