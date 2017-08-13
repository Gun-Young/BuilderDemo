package p1;

/*
 * 抽象建造者类，确定产品由两个部件组成PartA和PartB
 * 
 * */

abstract class Builder 
{

	public abstract void BuildPartA();
	
	public abstract void BuildPartB();
	
	public abstract Product GetResult();
}
