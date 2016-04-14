public class IMC {
	double peso,altura,imc;
	public IMC (double p, double a){
		peso = p;
		altura = a;
	}
	public void calcula(){
		imc = peso/(altura*altura);
	}
	public double mostraIMC (){
		return imc;
	}
}
