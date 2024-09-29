 	package calcpkg;

public class javajenkinsbuild {
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public int diff(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	} 	
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	public void greeting(){
		
		System.out.println("Hello GFG");
		
		
	}
	
	public static void main(String[] args) {
		
		javajenkinsbuild ob = new javajenkinsbuild();
		System.out.println("Sum is: "+ob.sum(20,10));
		System.out.println("Difference is: "+ob.diff(20,10));
		System.out.println("Multiplication is: "+ob.mul(20,10));
		System.out.println("Division is: "+ob.div(20,10));

	}

}
