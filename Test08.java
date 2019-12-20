class Test08 {

	static int a=10;
	static int b=20;

	int x=30;
	int y=40;

	public static void main(String[] args) 
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		System.out.println("a:"+Test08.a);
		System.out.println("b:"+Test08.b);

		Test08 t1=new Test08();

		System.out.println("x:"+t1.x);
		System.out.println("y:"+t1.y);
		
		System.out.println("a:"+t1.a);
		System.out.println("b:"+t1.b);

	// non static members can not be call directly by their name and also not accessible by their class name
	//	System.out.println("x:"+Test08.x);
	//	System.out.println("y:"+Test09.y);

		Test08 t2=null;

		System.out.println(t2.a);
		System.out.println(t2.x);

		
		
	}
}
