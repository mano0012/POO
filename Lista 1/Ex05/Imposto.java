public class Imposto {
	int mConst,mT;
	double imp;
	public Imposto(int constr,int tot){
		mConst=constr;
		mT=tot;
	}
	public void calcula(){
		imp = (mT - mConst)*3.8;
		imp = imp+(mConst*5);
	}
	public double mostra(){
		return imp;
	}
}
