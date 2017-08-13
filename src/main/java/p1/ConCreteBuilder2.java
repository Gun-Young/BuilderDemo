package p1;

//具体建造者2

public class ConCreteBuilder2 extends Builder
{
	private Product product=new Product();

	public void BuildPartA() 
	{
		product.Add("部件X");
	}

	public void BuildPartB() 
	{
		
		product.Add("部件Y");
		
	}

	public Product GetResult() {
		
		return product;
	}
	


}
