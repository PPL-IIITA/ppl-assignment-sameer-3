/**
 * 
 * @author jolly
 *
 */
public class BOYS {
	/** 
	 * Name of Boy 
	 */ 
	public String boy_nameb; 
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
	 * Happiness of Boy 
	 */
	public double boy_happiness;  
	/**
	  *  Boy's Girlfriend Name 
	  */
	public String hisgirl;
	/**
	 *  Boy's Gift spent on his girlfriend
	 */
	public int gift_spent; 
	 /** 
	  * Type of Boy either Miser or Geeks or Generous
	  */
	public String boy_type;  
	/**
	 * Description of Constructor
	 * @param nb (Name of boy)
	 * @param arb (Boy Attractiveness)
	 * @param rich (Boy Budget)
	 * @param intel (Boy Intelligence level) 
	 * @param sta (Boy Status)
	 * @param areq (Required Attractiveness)
	 * @param type (Boy Types)
	 */
	public BOYS(String nb,int arb,int rich,int intel,String sta,int areq,String type){
			super();
			this.boy_nameb = nb;
			this.boy_atrb = arb;
			this.boy_atrbreq = areq;
			this.boy_ri = rich;
			this.boy_intelb = intel;
			this.boy_status = sta;
			this.hisgirl = " ";
			this.boy_happiness = 0.0;
			this.gift_spent = 0;
			this.boy_type = type;
		}
	/**
	 * Calculate Happiness of boy
	 * @param gf (An object of Class GIRLS)
	 * @return (Return Happiness of a particular boy which is commited to a girl)
	 */
		public double boyhappiness(GIRLS gf){
			return 0;
		}
		/**
		 * Check eligibility of a boy to form a couple
		 * @param girl_mbudget (Parameter that holds maintenance cost of a girl)
		 * @param girl_atrg (Parameter that holds attractiveness of a girl)
		 * @return (Return a flag that indicates the eligibility of boy)
		 */
		public int check_eligiblity_boy(int girl_mbudget, int girl_atrg) {
            int flag = 0;
            if(this.boy_ri > girl_mbudget) 
            		flag = 1;
            if(girl_atrg > this.boy_atrbreq)
            		flag =  1;
            if(this.boy_status.equals("single"))
                	flag = 1;
            return flag;
		}
		/**
		 * Calculate gift spent by a Boy on his girlfriend
		 * @param gift (An object of Class Gifttogirl)
		 * @param totalgift (Parameter that holds total gifts given by boyfriend to his girlfriend) 
		 * @param require (Parameter that holds the limit to be spent on gifts given by boyfriends)
		 * @return (Return the gift spent of a boy on his girlfriend)
		 */
        public int calculate_giftspent(Gifttogirl [] gift, int totalgift, int require){
        	return 0;
        }

}
