/**
 * 
 * @author jolly
 *
 */
public class Gifttogirl {
		/**
		 * Name of the Gift
		 */
		public String gift_name;
		/**
		 * Value of the Gift 
		 */
		public int gift_value;
		/**
		 * Price of the Gift
		 */
		public int gift_price;
		/**
		 * Type of the Gift (either Luxury,Utility,Essential)
		 */
		public String gift_type;
		/**
		 * Description of Constructor
		 * @param gn (Gift Name)
		 * @param gv (Gift Value)
		 * @param gp (Gift Price)
		 * @param gt (Gift type)
		 */
			Gifttogirl(String gn,int gv,int gp,String gt){
				this.gift_name = gn;
				this.gift_value = gv;
				this.gift_price = gp;
				this.gift_type = gt;
			}
}
