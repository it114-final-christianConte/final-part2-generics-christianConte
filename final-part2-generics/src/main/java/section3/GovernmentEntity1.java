/**
 * 
 */
package section3;

import section2.HasCapital;
import section2.HasName;

/**
 * @author Christian
 * @param <T>
 *
 */
public class GovernmentEntity1<T> implements HasCapital<T>, HasName {

	/**
	 * 
	 */
	public GovernmentEntity1() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getCapital() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}

}
