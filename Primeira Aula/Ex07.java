public class Ex07 {
	public static void main(String args[]){
		int cont=0,i;
		for (i=0;i<=100;i++){
			if (i%2==1){
				cont=cont+i;
			}
		}
		System.out.println("Soma dos numeros impares de 0 a 100: "+cont);
	}
}
