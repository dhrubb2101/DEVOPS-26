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
	
	public static void main(String[] args) {
		
		javajenkinsbuild ob = new javajenkinsbuild();
		System.out.println("Sum is: "+ob.sum(20,10));
		System.out.println("Difference is: "+ob.diff(20,10));
	}

}
