
public 	class TestClass
{
	private Integer a;
	private Integer b;
	private Integer c;
	private Integer d;
	private Integer e;
	
	TestClass(int a,int b,int c,int d,int e)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;		
	}
	
	TestClass(int a)
	{
		this.a=a;
	}
	
	public int getA()
	{
		return this.a;
	}
	
	public int getB()
	{
		return this.b;
	}
	
}