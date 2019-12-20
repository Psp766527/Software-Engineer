class Test06 {
	public static void main(String[] args) 
	{
		double[] da;
		da=new double[8];

		System.out.println("da[0]"+da[0]);
		System.out.println("da[1]"+da[1]);
		System.out.println("da[2]"+da[2]);
		System.out.println("da[3]"+da[3]);
		System.out.println("da[4]"+da[4]);
		System.out.println("da[5]"+da[5]);
		System.out.println("da[6]"+da[6]);
		System.out.println("da[7]"+da[7]);
		
		//modification of values

		da[0]=2.3;
		da[1]=7.8;
		da[2]=4.3;
		da[3]=5.4;
		da[4]=1.22;
		da[5]=4.8;
		da[6]=9.8;
		da[7]=2.3;

		System.out.println("da[0]"+da[0]);
		System.out.println("da[1]"+da[1]);
		System.out.println("da[2]"+da[2]);
		System.out.println("da[3]"+da[3]);
		System.out.println("da[4]"+da[4]);
		System.out.println("da[5]"+da[5]);
		System.out.println("da[6]"+da[6]);
		System.out.println("da[7]"+da[7]);

		da[1]=25;
		da[2]=da[0]+da[4];

		System.out.println("da[1]"+da[1]);
		System.out.println("da[2]"+da[2]);
	}
}
