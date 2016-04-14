import javax.swing.JOptionPane;

public class Valor {
	private double valor;
	public Valor(double val){
		valor = val;
	}
	public void aumento (int cod){
		switch (cod){
			case 1:
				valor*=1.1;
			break;
			case 2:
				valor*=1.25;
			break;
			case 3:
				valor*=1.3;
			break;
			case 4:
				valor*=1.5;
			break;
			default:
				JOptionPane.showMessageDialog(null, "Codigo inválido");
				System.exit(0);
			break;
		}
	}
	public void imposto(){
		if (valor>=1000 && valor<=5000){
			valor*=1.01;
		} else if (valor<=10000){
			valor*=1.02;
		} else if (valor>10000){
			valor*=1.03;
		}
	}
	public double mostraVal(){
		return valor;		
	}
}
