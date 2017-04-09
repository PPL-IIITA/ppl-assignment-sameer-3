

import java.util.*;
/**
 * 
 * @author jolly
 *
 */
public class sorted extends coupling{
	/**
	 * Create an array list that holds the data of class BOYS
	 */
	public ArrayList <BOYS> boylist = new ArrayList<BOYS>();
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
			boylist.add(commit[i].b);
		}
		tc = totalcouple;
	}
	/**
	 * To sort the coupled boys by their names according to lexicographic order
	 */
	public void sort_name(){
		for (int i = 0; i < tc; i++) {
	        for (int j = i + 1; j < tc; j++) {
	            if(boylist.get(i).boy_nameb.compareTo(boylist.get(j).boy_nameb)>0) {
	                String temp = boylist.get(i).boy_nameb;
	                boylist.get(i).boy_nameb = boylist.get(i).boy_nameb;
	                boylist.get(i).boy_nameb = temp;
	            }
	        }
	    }
	}
	/**
	 * Binary Search for given boy in coupled boy
	 * @param boy (Boy Name for whom we are looking for a girlfriend)
	 * @param boylist (Array list of coupled boys)
	 * @param l (lower limit)
	 * @param h (uper limit)
	 * @return (Return the index of that boy in Array list of coupled list)
	 */
	public int bsearch(String boy, ArrayList <BOYS> boylist, int l, int h) {
		if(h <= l)
			return -1;

		if(h - l == 1)
			return boylist.get(l).boy_nameb.equals(boy) ? l : -1;

		int pivot = (l + h)/2;
		if(boy.compareTo(boylist.get(pivot).boy_nameb) < 0) {
			return bsearch(boy, boylist, 0, pivot);
		} else if(boy.compareTo(boylist.get(pivot).boy_nameb) > 0) {
			return bsearch(boy, boylist, pivot, h);
		}

		return pivot;
	}
	/**
	 * Function to find the girlfriend of boy
	 * @param commit (An object Array of class COMMITED)
	 * @param boy (Boy Name for whom we are looking for a girlfriend)
	 * @param totalcouple (Number of total couples)
	 * @return (Return Name of the Girlfriend of Boy)
	 */
	public String findgirlfriend(COMMITED [] commit,String boy,int totalcouple){
		String r = " ";
		couple(commit,totalcouple);
		sort_name();
		int index = bsearch(boy,boylist,0,tc);
		if(index == -1){
			return r;
		}
		return boylist.get(index).hisgirl;
	}
}
