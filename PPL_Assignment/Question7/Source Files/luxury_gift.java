/**
 * 
 * @author jolly
 *
 */
public class luxury_gift extends Gifttogirl{
	/**
	 * Rating of gift
	 */
	public int rating = 500;
	/**
	 * Difficulties to obtain gift
	 */
	public int diff = 100;
	/**
	 * Value of gift
	 */
	public int val = 500;
	/**
	 * Price of gift
	 */
	public int price;
	/**
	 * Description of Constructor
	 * @param gn (Gift Name)
	 * @param gv (Gift Value)
	 * @param gp (Gift Price)
	 * @param gt (Gift type)
	 */
	public luxury_gift(String gn,int gv,int gp,String gt) {
	        super(gn,gv,gp,gt);
	    }

}
