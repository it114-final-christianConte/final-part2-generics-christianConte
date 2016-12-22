/**
 * 
 */
package section2;

/**
 * @author Christian
 * @param <T>
 *
 */
public class Country<C, T> implements HasName, HasCapital<T>
{

	/**
	 * 
	 */
	private String name;
	private C capital;
	
	public Country(String _name, C _Capital) 
	{
		name = _name;
		capital = _Capital;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	public String getName() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T getCapital() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() 
	{
		// TODO Auto-generated method stub
		return null;
	}


}
