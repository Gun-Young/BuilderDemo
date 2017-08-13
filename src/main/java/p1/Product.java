package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 产品类，由多个部件组成
 * 
 * */

public class Product 
{
        List parts =new ArrayList();
        
        public void Add(String part)
        {
        	parts.add(part);
        }
        
        public void show()
        {
        	System.out.println("创建的产品组成部分....................");
        	
        	Iterator it=parts.iterator();
        	
        	while(it.hasNext())
        	{
        		System.out.println(it.next());
        	}
        }
	   
	
}
