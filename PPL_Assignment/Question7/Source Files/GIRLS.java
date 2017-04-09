/**
 * 
 * @author jolly
 *
 */
public abstract class GIRLS {
		/** 
		 * Name of Girl
		 */ 
		public String girl_nameg;
		/** 
		 * Attractiveness of Girl
		 */
		private int girl_atrg;
		/**
		 *  Maintenance Budget of Girl
		 */
		private int girl_mbudget;
		/** 
		 * intelligence level of Girl 
		 */
		private int girl_intelg;
		/** 
		 * Girl Status either commited or single 
		 */
		private String girl_status;
		/**
		  *  Girls's Boyfriend Name 
		  */
		public String herboy;
		/**
		 * Happiness of Girl 
		 */
		private double girl_happiness;
		/**
		 * Gifts got from her boyfriend
		 */
		public int got_gift;
		/**
		 * Description of Constructor
		 * @param ng (Girl Name)
		 * @param arg (Girl Attractiveness)
		 * @param bud (Girl Maintenance Budget)
		 * @param inte (Girl Intelligence level)
		 * @param sta (Girl Status)
		 */
		GIRLS(String ng,int arg,int bud,int inte,String sta){
				this.girl_nameg = ng;
				this.setGirl_atrg(arg);
				this.setGirl_mbudget(bud);
				this.setGirl_intelg(inte);
				this.setGirl_status(sta);
				this.herboy = " ";
				this.setGirl_happiness(0.0);
				this.got_gift = 0;
			}
		/**
		 * Calculate Happiness of a Girl
		 * @param value (Total gift spent on that girl by her boyfriend)
		 * @return (Return Happiness of a particular girl which is commited to a boy)
		 */
	    public abstract double girlhappiness(int value);
	    /**
	     * To change the Status of a girl
	     * This function is used to change the status of a girl to single or commited.
	     * @param status (either single or commited)
	     */
		public void statusluck_change(String status) {
				  if(status.equals("single")){
					  this.setGirl_status("commited");
				  }else{
					  this.setGirl_status("single");
				  }
		}
			/**
			 * @return (Return the Intelligence level of a Girl)
			 */
			public int getGirl_intelg() {
				return girl_intelg;
			}
			/**
			 * @param girl_intelg (the Intelligence level of a Girl to set)
			 */
			public void setGirl_intelg(int girl_intelg) {
				this.girl_intelg = girl_intelg;
			}
			/**
			 * 
			 * @param got_gift (the got_gift to set)
			 */
			public void setGot_gift(int got_gift) {
				this.got_gift = got_gift;
			}
			/**
			 * @return (Return the happiness of a Girl)
			 */
			public double getGirl_happiness() {
				return girl_happiness;
			}
			/**
			 * @param girl_happiness (the girl_happiness to set)
			 */
			public void setGirl_happiness(double girl_happiness) {
				this.girl_happiness = girl_happiness;
			}
			/**
			 * @return (Return the Maintenance Budget of a Girl)
			 */
			public int getGirl_mbudget() {
				return girl_mbudget;
			}
			/**
			 * @param girl_mbudget (the girl_mbudget to set)
			 */
			public void setGirl_mbudget(int girl_mbudget) {
				this.girl_mbudget = girl_mbudget;
			}
			/**
			 * @return (Return the status of a girl)
			 */
			public String getGirl_status() {
				return girl_status;
			}
			/**
			 * @param girl_status (the girl_status to set)
			 */
			public void setGirl_status(String girl_status) {
				this.girl_status = girl_status;
			}
			/**
			 * @return (Return the Attractiveness of a girl)
			 */
			public int getGirl_atrg() {
				return girl_atrg;
			}
			/**
			 * @param girl_atrg (the girl_atrg to set)
			 */
			public void setGirl_atrg(int girl_atrg) {
				this.girl_atrg = girl_atrg;
			} 
			/**
			 * Check eligibility of a girl to form a couple
			 * @param b_budget (Budget of her boyfriend)
			 * @return (Return a flag that indicates the eligibility of Girl)
			 */
			public int check_eligiblity_girl(int b_budget) {
				int flag = 0;
				if(b_budget >= this.getGirl_mbudget()) 
					flag = 1;
				return flag;
			}

}
