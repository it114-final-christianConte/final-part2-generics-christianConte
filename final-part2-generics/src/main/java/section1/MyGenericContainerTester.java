/**
 * 
 */
package section1;

/**
 * @author Christian
 *
 */
public class MyGenericContainerTester 
{

	/**
	 * 
	 */
	public MyGenericContainerTester() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass("ilker");
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass(1234);
		
		System.out.println("String Container contains:" + " " + c4String.getContained());
		System.out.println("Integer Container contains:" + " " + c4Integer.getContained());
	}

}
