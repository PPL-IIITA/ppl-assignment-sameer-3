/**
 * 
 * @author jolly
 *
 */
public class BOY {
	/** 
	 * Name of Boy 
	 */ 
	String boy_nameb;
	/** 
	  * Type of Boy either Miser or Geeks or Generous
	  */
	String boy_type;
	/** 
	 * Attractiveness of Boy
	 */
	public int boy_atrb; 
	/** 
	 * Required Attractiveness of Boy 
	 */
	public int boy_atrbreq; 
	/** 
	 * Budget of Boy 
	 */
	public int boy_ri; 
	/** 
	 * intelligence level of Boy 
	 */
	public int boy_intelb; 
	 /** 
	  * Boy Status either commited or single 
	  */
	public String boy_status; 
	/**
	* Description of Constructor
	 * @param nb (Name of boy)
	 * @param arb (Boy Attractiveness)
	 * @param rich (Boy Budget)
	 * @param intel (Boy Intelligence level) 
	 * @param sta (Boy Status)
	 */
	BOY(String nb,int arb,int rich,int intel,String sta){
		boy_nameb = nb;
		boy_atrb = arb;
		boy_ri = rich;
		boy_intelb = intel;
		boy_status = sta;
	}
}
