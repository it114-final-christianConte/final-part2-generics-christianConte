/**
 * 
 */
package section3;

import section2.HasGovernor;
import section2.HasName;

/**
 * @author Christian
 * @param <T>
 *
 */
public class GovernmentEntity2<T> implements HasGovernor<T>, HasName {

	/**
	 * 
	 */
	public GovernmentEntity2() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getGovernor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}

}
