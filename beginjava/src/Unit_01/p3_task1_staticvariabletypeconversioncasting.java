package Unit_01;

public class p3_task1_staticvariabletypeconversioncasting {
	static int a = 10;
	  int b = 20;
	public static void main(String[] args) {
		
		System.out.println(a);
		
		//cannot make a static reference to the  non-static field b
		//System.out.println(b);
		typeConvrsionAndTypeCasting();
	
	  

	}
	static void typeConvrsionAndTypeCasting()
	{
		//System.out.println(b);
		System.out.println(a);
		
		double d;
		int i = 20;
		
		d=i;  //Type Conversion
		System.out.println(d);
		System.out.println(i);
		
		double g = 30;
		int j;
		j = (int)g;

	}

}
