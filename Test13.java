//activity of this keyword by compiler
class  Test13{

	int x=10;
	int y=20;

	void m1(){
		System.out.println("m1");
	}

	void printxy(Test13 this){

		System.out.println(this.x);
		System.out.println(this.y);
	}

	public static void main(String[] args) {

		Test13 t1=new Test13();
		t1.printxy();
		
	}
}
