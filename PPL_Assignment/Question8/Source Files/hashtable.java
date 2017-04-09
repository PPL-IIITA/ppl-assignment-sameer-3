

import java.util.*;
import java.util.Map.Entry;


/**
 * 
 * @author jolly
 *
 */
public class hashtable extends coupling{
	/**
	 * Create an Hash table with key(Boy Name) and value (Girlfriend of that boy) 
	 */
	public Hashtable<String, String> ht = new Hashtable<String, String>();
	/*
	 * Number of total couples
	 */
	public int tc;
	/**
	 * An abstract method to retain couples
	 * @param commit (An object of array of class COMMITED)
	 * @param totalcouple (Number of total couples)
	 */
	public void couple(COMMITED[] commit, int totalcouple) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<totalcouple;i++){
			ht.put(commit[i].b.boy_nameb,commit[i].g.girl_nameg);
		}
		tc = totalcouple;
	}
	/**
	 * Function to find the girlfriend of boy
	 * @param commit (An object Array of class COMMITED)
	 * @param boy (Boy Name for whom we are looking for a girlfriend)
	 * @param totalcouple (Number of total couples)
	 * @return (Return Name of the Girlfriend of Boy)
	 */
	public String findgirlfriend(COMMITED [] commit,String boy,int totalcouple){
		couple(commit,totalcouple);
		String r = " ";
		for (Iterator<Entry<String, String>> iterator = ht.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, String> m = iterator.next();
			if(boy.equals(m.getKey())){
				r = m.getValue();
			}
		}
		return r;
	}
}
