//calling non-static members from other non-static context without using object 
class Test11 {

	int x=10;
	int y=20;

	void m1(){
		System.out.println("m1");
	}
	void printxy(){
		System.out.println(x);
		System.out.println(y);

		m1();
	}
	public static void main(String[] args) 
	{
		Test11 t1=new Test11();
		t1.printxy();
		
	}
}
