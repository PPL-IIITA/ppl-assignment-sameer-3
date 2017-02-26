import java.util.ArrayList;
import java.util.Random;

public class COMMITED {
	BOY b;
	GIRLS g;
	int count;
	int boy_happiness;
	int girl_happiness;
	int happiness;
	int couple_compaitibility;
	String boyname_type;
	String girlname_type;
	ArrayList <Gifttogirl> giftlist = new ArrayList<Gifttogirl>();
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
