/**
 * 
 */
package section1;

/**
 * @author Christian
 * @param <T>
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> 
{

	/**
	 * 
	 */
	private T contained;
	
	public MyGenericContainerClass(T _contained) 
	{
		contained = _contained;
		// TODO Auto-generated constructor stub
	}
	
	public T getContained() 
	{
		// TODO Auto-generated method stub
		return contained;
	}
}
