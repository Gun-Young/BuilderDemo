package p1;

/*
 * 客户端
 * 
 * */
public class Client 
{

	public static void main(String[] args) 
	{
		Director director=new Director();
		
		Builder b1=new ConCreteBuilder1();
		
		Builder b2=new ConCreteBuilder2();
		
//		director.Construct(b1);
//		
//		Product p1=b1.GetResult();
//		
//		p1.show();
		
		director.Construct(b2);
		
		Product p2=b2.GetResult();
		
		p2  .show();
	}
	
	
}
