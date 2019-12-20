//empty object creation
//JVM will create empty object but it does not have any state,but will have behavior and hash code
class  Test10{

	void m1(){
		System.out.println("m1");
	}

	public static void main(String[] args) 
	{
		Test10 t=new Test10();
		t.m1();
		
	}
}
