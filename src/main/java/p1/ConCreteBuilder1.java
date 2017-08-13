package p1;

//具体建造者1

public class ConCreteBuilder1 extends Builder
{
	private Product product=new Product();

	public void BuildPartA() 
	{
		product.Add("部件A");
	}

	public void BuildPartB() 
	{
		
		product.Add("部件B");
		
	}

	public Product GetResult() {
		
		return product;
	}
	


}
