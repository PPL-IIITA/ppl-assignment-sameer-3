

import java.util.*;

/**
 * 
 * @author jolly
 *
 */
public class linkedlist extends coupling{
	/**
	 * Create a linked list that holds the data of class BOYS
	 */
	public LinkedList<BOYS> link = new LinkedList<BOYS>();
	/**
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
			link.add(commit[i].b);
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
		for(BOYS b:link){
			if(boy.equals(b.boy_nameb)){
				r = b.hisgirl;
			}
		}
		return r;
	}
}
