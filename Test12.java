//all objects share same copy of non-static method logic 
class Test12 {

	int x=10;
	int y=20;
	
	void printxy(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		Test12 t1=new Test12();
		Test12 t2=new Test12();

		t1.printxy();//10 20
		t2.printxy();//10 20


	}
}
