/**
 * 
 */
package section1;

import java.util.List;

/**
 * @author Christian
 *
 */
public class MyGenericStaticMethodUtilityTester 
{

	/**
	 * 
	 */
	public MyGenericStaticMethodUtilityTester() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> string = null;
		String s1 = new String("element_1");
		// TODO Auto-generated method stub
		
		string.add(s1);
		
		System.out.println("added String " + s1 + ", now strings.size:");
		
		List<Integer> integer = null;
		Integer i1 = new Integer("1234");
		
		integer.add(i1);
		
		System.out.println("added Integer " + i1 + ", now integers.size:");
		
	}

}
