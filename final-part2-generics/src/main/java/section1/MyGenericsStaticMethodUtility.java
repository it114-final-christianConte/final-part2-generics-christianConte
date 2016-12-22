/**
 * 
 */
package section1;

import java.util.Collection;

/**
 * @author Christian
 * @param <T>
 *
 */
public class MyGenericsStaticMethodUtility
{

	/**
	 * 
	 */
	public MyGenericsStaticMethodUtility() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static<T> T add2Collection(T e, Collection<T> collect)
	{
		collect.add(e);
		return e;
	}

}
