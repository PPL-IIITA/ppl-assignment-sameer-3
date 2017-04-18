
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author jolly
 *
 */
public class COMMITED {
	/**
	 * Create an object of Class BOYS
	 */
	BOY b;
	/**
	 * Create an object of Class GIRLS
	 */
	GIRLS g;
	/**
	 * Number of Couples formed
	 */
	int count;
	/**
	 * Happiness of a boy
	 */
	int boy_happiness;
	/**
	 * Happiness of a girl
	 */
	int girl_happiness;
	/**
	 * Happiness of a Couple
	 */
	int happiness;
	/**
	 *  compatibility of a couple
	 */
	int couple_compaitibility;
	/**
	 * Type of boy
	 */
	String boyname_type;
	/**
	 * type of girl
	 */
	String girlname_type;
	ArrayList <Gifttogirl> giftlist = new ArrayList<Gifttogirl>();
	/**
	 * 
	 * @param counter
	 * @param boy
	 * @param girl
	 */
	COMMITED(int counter,BOY boy,GIRLS girl){
		b = boy;
		g = girl;
		count = counter;
	}
	
	Random r = new Random();
	public void Dis(){
		System.out.println("Couple - "+count+"  "+b.boy_nameb+"  ->  "+g.girl_nameg);
	}
	public String BOY_TYPE(){
		int typeb = r.nextInt(3)+1;
		if(typeb == 1){
			boyname_type = "Miser";
		} else if(typeb == 2){
			boyname_type = "Generous";
		} else {
			boyname_type = "Geeks";
		}
		return boyname_type;
	}
	public String GIRL_TYPE(){
		int typeg = r.nextInt(3)+1;
		if(typeg == 1){
			girlname_type = "Choosy";
		} else if(typeg == 2){
			girlname_type = "Normal";
		} else {
			girlname_type = "Desperate";
		}
		return girlname_type;
	}
	
	
	
}
