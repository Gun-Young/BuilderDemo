package p1;

/*
 * 
 * 指挥者类
 * 
 * */

public class Director 
{

	 public void Construct(Builder builder)
	 {
		 builder.BuildPartA();
		 
		 builder.BuildPartB();
		 
	 }
	
}
