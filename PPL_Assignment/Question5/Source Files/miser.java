/**
 * 
 * @author jolly
 *
 */
public class miser extends BOYS{
	/**
	 * Description of Constructor
	 * @param nb (Number of boys)
	 * @param arb (Boy Attractiveness)
	 * @param rich (Boy Budget)
	 * @param intel (Boy Intelligence) 
	 * @param sta (Boy Status)
	 * @param areq (Required Attractiveness)
	 * @param type (Boy Types)
	 */
	public miser(String nb,int arb,int rich,int intel,String sta,int areq,String type) {
        super(nb,arb,rich,intel,sta,areq,type);
    }
	/**
	 * Calculate Happiness of boy
	 *  @param gf (An object of Class GIRLS)
	 * @return (Return Happiness of a particular boy which is commited to a girl)
	 */
    public double boyhappiness(GIRLS gf) {
    	gf.got_gift = gift_spent;
        double hapi = boy_ri-gift_spent;
        this.boy_happiness = hapi;
        return hapi;
    }
    /**
     *  Calculate gift spent by a Boy on his girlfriend
	 *  @param gift (An object of Class Gifttogirl)
	 * @param totalgift (Parameter that holds total gifts given by boyfriend to his girlfriend) 	 * @param require (Parameter that holds the limit to be spent on gifts given by boyfriends)
	 * @return (Return the gift spent of a boy on his girlfriend)
	 */
    public int calculate_giftspent(Gifttogirl [] gift, int totalgift, int require) {
        int balance = boy_ri;
        int spent = require;
        while(spent>0 && totalgift<100) {
        	spent = spent - gift[totalgift].gift_price;
            balance = balance - gift[totalgift].gift_price;
            totalgift++;
        }
        if(balance<0){
        	balance = balance + gift[totalgift-1].gift_price;
            totalgift--;
        }
        this.gift_spent = boy_ri - balance;
        return totalgift;
    }

}
