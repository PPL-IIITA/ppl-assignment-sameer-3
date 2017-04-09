/**
 * 
 * @author jolly
 *
 */
public class desperate extends GIRLS{
	/**
	 * Description of Constructor
	 * @param ng (Girl Name)
	 * @param arg (Girl Attractiveness)
	 * @param bud (Girl Maintenance Budget)
	 * @param inte (Girl Intelligence level)
	 * @param sta (Girl Status)
	 */
	public desperate(String ng,int arg,int bud,int inte,String sta){
        super(ng,arg,bud,inte,sta);
    }
	/**
	 * Calculate Happiness of a Girl
     * @param value (Total gift spent on that girl by her boyfriend)
     * @return (Return Happiness of a particular girl which is commited to a boy)
     */
    public double girlhappiness(int value) {
        //double hapi = (Math.pow((double)getGirl_mbudget(),(double)value));
        double hapi = Math.exp(value-getGirl_mbudget())%10000;
        this.setGirl_happiness(hapi);
        return hapi;
    }
}
