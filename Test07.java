class Test07 {

	int x;
	int y;

	void m1(Test07 t){

		x=x+5;
		y=y+10;

		t.x=t.x+15;
		t.y=t.y+20;
	}
	public static void main(String[] args) 
	{
		Test07 t1=new Test07();
		Test07 t2=new Test07();

		System.out.println(t1.x+"..."+t1.y);
		System.out.println(t2.x+"..."+t2.y);

		t1.m1(t2);
		System.out.println(t1.x+"...."+t1.y);
		System.out.println(t2.x+"..."+t2.y);

		t2.m1(t1);
		System.out.println(t1.x+"..."+t1.y);
		System.out.println(t2.x+"...."+t2.y);

		t1.m1(t1);
		System.out.println(t1.x+"...."+t1.y);
		System.out.println(t2.x+"..."+t2.y);

		t2.m1(t2);
		System.out.println(t1.x+"...."+t1.y);
		System.out.println(t2.x+"...."+t2.y);
		
	}
}
