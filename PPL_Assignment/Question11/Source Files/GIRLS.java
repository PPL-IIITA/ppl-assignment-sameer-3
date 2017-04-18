/**
 * 
 * @author jolly
 *
 */
public class GIRLS {
		/** 
		 * Name of Girl
		 */ 
		public String girl_nameg;
		/** 
		 * Attractiveness of Girl
		 */
		public int girl_atrg;
		/**
		 *  Maintenance Budget of Girl
		 */
		public int girl_mbudget;
		/** 
		 * intelligence level of Girl 
		 */
		public int girl_intelg;
		/** 
		 * Girl Status either commited or single 
		 */
		public String girl_status;
		/**
		* Description of Constructor
		 * @param ng (Girl Name)
		 * @param arg (Girl Attractiveness)
		 * @param bud (Girl Maintenance Budget)
		 * @param inte (Girl Intelligence level)
		 * @param sta (Girl Status)
		 */
	GIRLS(String ng,int arg,int bud,int inte,String sta){
		girl_nameg = ng;
		girl_atrg = arg;
		girl_mbudget = bud;
		girl_intelg = inte;
		girl_status = sta;
	}
}

