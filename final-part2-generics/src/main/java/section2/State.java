/**
 * 
 */
package section2;

/**
 * @author Christian
 * @param <T>
 *
 */
public class State<T, G, C> implements HasCapital<T>, HasGovernor<T>, HasName 
{

	/**
	 * 
	 */
	private String name;
	private C capital;
	private G governor;
	
	public State(String _name, C _Capital, G _Governor) 
	{
		name = _name;
		capital = _Capital;
		governor = _Governor;
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

	public T getGovernor() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getGovernorName() 
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
