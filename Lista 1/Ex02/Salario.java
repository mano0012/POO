public class Salario {
	double salT,disINSS,disIR,salL;
	public Salario (double salH, int qtdHoras, int depen){
		salT= salH * qtdHoras + (50*depen);
	}
	public void INSS (){
		if (salT<=1000){
			disINSS = salT*0.085;
		} else if (salT>1000){
			disINSS = salT*0.09;
		}
	}
	public void IR(){
		if (salT<=500){
			disIR = 0;
		} else if (salT<=1000){
			disIR = salT*0.05;
		} else if (salT>1000){
			disIR = salT*0.07;
		}
	}
	public void salLiq (){
		salL = salT-disINSS-disIR;
	}
	public double mostraINSS(){
		return disINSS;
	}
	public double mostraIR(){
		return disIR;
	}
	public double mostraSalL(){
		return salL;
	}
	public double mostraSalT(){
		return salT;
	}
}
