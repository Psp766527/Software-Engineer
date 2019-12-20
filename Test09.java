//modifications in static and non-static variables
class  Test09{

	static int a=10;
	static int b=20;

	int x=30;
	int y=40;


	public static void main(String[] args) 
	{
		//reading and displaying static variable before modification
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		Test09 t1=new Test09();
		Test09 t2=new Test09();

		Test09 t3=null;

		//reading and displaying static variable after modification
		t1.a=50;
		t1.b=60;
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		//reading and displaying non-static variable before modification
		System.out.println("x:"+t1.x);
		System.out.println("y:"+t1.y);

	
		//reading and displaying non-static variable after modification
		t1.x=70;
		t1.y=80;
		System.out.println("x:"+t1.x);
		System.out.println("y:"+t1.y);
	}
}
