//Q.When non-static method is shared by all objects,why its call is replaced with this keyword?
//A.Because current object reference should be passed in to every non-static method,since in that
//method also developer may uses non-static 
//variables.so compiler places this keyword in every non-nonstatic mehtod call.
class  Test14{

	int x=10;
	int y=20;

	void setxy(){
		x=50;
		y=60;
	}

	void printxy(){

		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}

	void m1(){
		setxy();
		printxy();
	}
	public static void main(String[] args) 
	{
		Test14 t1=new Test14();
		t1.m1();
	}
}
