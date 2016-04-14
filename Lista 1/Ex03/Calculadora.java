public class Calculadora {
	double n1,n2,result;
	int op;
	public Calculadora (double num1, double num2){
		n1 = num1;
		n2 = num2;
	}
	public void sum (){
		result = n1+n2;
	}
	public void sub (){
		result = n1-n2;
	}
	public void mult (){
		result = n1*n2;
	}
	public void div (){
		result = n1/n2;
	}
	public double mostraResult(){
		return result;
	}
}
