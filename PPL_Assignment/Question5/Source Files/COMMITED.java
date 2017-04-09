import java.util.ArrayList;
/**
 * 
 * @author jolly
 *
 */
public class COMMITED {
	/**
	 * Create an object of Class BOYS
	 */
	public BOYS b;
	/**
	 * Create an object of Class GIRLS
	 */
	public GIRLS g;
	/**
	 * Number of Couples formed
	 */
	public int count;
	/**
	 * Happiness of a Couple
	 */
	public int happiness = 0;
	/**
	 *  compatibility of a couple
	 */
	public int compaitability = 0;
	/**
	 * To store the price of gifts given by boyfriend to his girlfriend
	 */
	public int [] given_gifts = new int [100];
	/**
	 * Create an ArrayList of class Gifttogirl to store the details of the given gifts
	 */
	public ArrayList <Gifttogirl> giftlist = new ArrayList<Gifttogirl>();
	/**
	 * Description of Constructor
	 * @param counter (Number of couples formed)
	 * @param boy (Object of class BOYS)
	 * @param girl (Object of class GIRLS)
	 */
	public COMMITED(int counter,BOYS boy,GIRLS girl){
			b = boy;
			g = girl;
			count = counter;
		}
	/**
	 * Calculate Happiness of a couple
	 * @param Gift (An object of class Gifttogirl)
	 * @param totalgift (Parameter that holds total given gifts)
	 * @return (total given gifts and set the couple happiness)
	 */
	public int calculate_happiness (Gifttogirl [] Gift, int totalgift){
	    int require = g.getGirl_mbudget();
	    int j=0,i;
	    if(b.boy_type.equals("generous")){
	    	require = b.boy_ri;
	    }
	    int total = b.calculate_giftspent(Gift,totalgift,require);
	    for(i=0;i<total;i++) {
	        given_gifts[j] = Gift[i].gift_price;
	        j++;
	    }
	    g.got_gift = b.gift_spent;
	    this.happiness = (int)Math.abs(b.boyhappiness(g)) + (int)Math.abs(g.girlhappiness(b.gift_spent));
	    return total;
	}
	/**
	 * Calculate the compatibility of a couple
	 */
	public void calculate_compaitibilty(){
		this.compaitability =(int) (Math.abs((g.got_gift - b.boy_ri))+ Math.abs((g.getGirl_intelg() - b.boy_intelb))+Math.abs((g.getGirl_atrg() - b.boy_atrb)));
	}
}
