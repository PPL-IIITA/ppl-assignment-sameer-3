import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.*;
/**
 * 
 * @author jolly
 *
 */
public class Ques4 {
	/**
	 * Create a BufferReader variable to read text of 'Boys_details.txt'
	 */
	public static BufferedReader bo;
	/**
	 * Create a BufferReader variable to read text of 'Girls_details.txt'
	 */
	public static BufferedReader go;
	/**
	 * Create a BufferReader variable to read text of 'Gifts_details.txt'
	 */
	public static BufferedReader gi;
	/**
	 * To sort the gifts according to their price
	 * @param gift (An Array of object of class Gifttogirl)
	 * @param c (Number of total Gifts)
	 */
    public static void sort_price(Gifttogirl gift[],int c){
		int l,h;
		for(l=0;l<c-1;l++){
			for(h=0;h<c-1-l;h++){
				if(gift[h].gift_price > gift[h+1].gift_price){
					int temp;
					temp = gift[h].gift_price;
					gift[h].gift_price = gift[h+1].gift_price;
					gift[h+1].gift_price = temp;
				}
			}
		}
	}
    /**
     * To sort the couples according to their happiness
     * @param commit (An Array of object of class COMMITED)
     * @param c (Number of couples formed)
     */
	public static void sort_happiness(COMMITED commit[],int c){
		int l,h;
		for(l=0;l<c-1;l++){
			for(h=0;h<c-1-l;h++){
				if(commit[h].happiness > commit[h+1].happiness){
					int temp;
					temp = (int) commit[h].happiness;
					commit[h].happiness = commit[h+1].happiness;
					commit[h+1].happiness = temp;
				}
			}
		}
	}
	/**
	 * To print First k happiest couples
	 * @param commit (An Array of object of class COMMITED)
	 * @param k (Number of happiest couples) 
	 */
	public static void printkhappiest(COMMITED commit[],int k){
		int i;
		System.out.println("    Couple\t");
		for(i=0;i<k;i++){
			if(commit[i].happiness < 500){
				commit[i].happiness = 1000;
			}
			System.out.println(commit[i].b.boy_nameb+" and "+commit[i].g.girl_nameg);
		}
	}
	/**
	 * Main Function
	 * @param args (java.lang.String)
	 * @throws IOException (java.io.IOException)
	 */
	public static void main(String[] args)throws IOException{
		random_generation r = new random_generation();
		r.generation();
		int b = r.x;
		int g = r.y;
		BOYS boys[] = new BOYS[50];
		GIRLS girl[] = new GIRLS[50];
		COMMITED [] brokengirls = new COMMITED[50];
		COMMITED [] commit = new COMMITED[50];
		Gifttogirl [] Gift = new Gifttogirl[500];
		String filename1 = "Boys_details.txt";
		String filename2 = "Girls_details.txt";
		String filename3 = "Gifts_details.txt";
		FileReader rb,rg,rgi;
		int i;
                Random rand = new Random();
                int [] gifts_price = new int[100];
		try{
			rb = new FileReader(filename1);
			bo = new BufferedReader(rb);
			String t = "single";
            int in = 0;
			for(i=0;i<b;i++){	
				String current = bo.readLine();
				StringTokenizer temp = new StringTokenizer(current,",");
				String nameb=temp.nextToken();
				int atrb=Integer.parseInt(temp.nextToken());
				int ri= Integer.parseInt(temp.nextToken());
				int intelb= Integer.parseInt(temp.nextToken());
				int atreq = Integer.parseInt(temp.nextToken());
				String type = temp.nextToken();
                                switch (type) {
                                    case "geeks":
                                        boys[in] = new geeks(nameb,atrb,ri,intelb,t,atreq,type);
                                        break;

                                    case "miser":
                                        boys[in] = new miser(nameb,atrb,ri,intelb,t,atreq,type);
                                        break;
                                    case "generous":
                                        boys[in] = new generous(nameb,atrb,ri,intelb,t,atreq,type);
                                        break;
                                    default:
                                        break;
                                }
                            in++;
                        }
		}catch(IOException ex) {
                    System.out.println("Error writing to file '"+ filename1 + "'");
                }
		try{
			rg = new FileReader(filename2);
			go = new BufferedReader(rg);
			String t = "single";
            int in =0;
            for(i=0;i<g;i++){	
				String current = go.readLine();
				StringTokenizer temp = new StringTokenizer(current,",");
				String nameg=temp.nextToken();
				int atrg=Integer.parseInt(temp.nextToken());
				int mbud= Integer.parseInt(temp.nextToken());
				int intelg= Integer.parseInt(temp.nextToken());
				String type = temp.nextToken();
                                switch (type) {
                                    case "choosy":
                                        girl[in] = new choosy(nameg,atrg,mbud,intelg,t);
                                        break;
                                    case "desperate":
                                        girl[in] = new desperate(nameg,atrg,mbud,intelg,t);
                                        break;
                                    case "normal":
                                        girl[in] = new normal(nameg,atrg,mbud,intelg,t);
                                        break;
                                    default:
                                        break;
                                }
                             in++;
                        }
		}catch(IOException ex) {
                    System.out.println("Error writing to file '"+ filename2 + "'");
                }
		try{
			rgi = new FileReader(filename3);
			gi = new BufferedReader(rgi);
            int in = 0;
            for(i=0;i<100;i++){	
				String current = gi.readLine();
				StringTokenizer temp = new StringTokenizer(current,",");
				String namegi=temp.nextToken();
				int giv =Integer.parseInt(temp.nextToken());
				int gip = Integer.parseInt(temp.nextToken());
                gifts_price[i] = gip;
				String type = temp.nextToken();
                                switch (type) {
                                    case "essential":
                                        Gift[in] = new essential_gift(namegi,giv,gip,type);
                                        break;
                                    case "utility":
                                        Gift[in] = new utility_gift(namegi,giv,gip,type);
                                        break;
                                    case "luxury":
                                        Gift[in] = new luxury_gift(namegi,giv,gip,type);
                                        break;
                                    default:
                                        break;
                                }
                        in++;
                    }
		}catch(IOException ex) {
                    System.out.println("Error writing to file '"+ filename3 + "'");
                }
		int j;
		int counter = 0;
		File file_name1 = new File("logoutput.txt");
		FileWriter fw = null;
		fw = new FileWriter(file_name1);
            try (BufferedWriter fo = new BufferedWriter(fw)) {
            	fo.write("\t\t\t\t\tBefore Breakup");
            	fo.newLine();
            	fo.newLine();
                fo.write("\t\t\t\t\tCouple Information");
                fo.newLine();
                fo.newLine();
                fo.write("   Event Type\t\t"+" "+"\t\tEvent Description \t\t"+" "+"\t\tTimeStamp" );
                fo.newLine();
                for(i=0;i<g;i++){
                    for(j=0;j<b;j++){
                    	int r1 = girl[i].check_eligiblity_girl(boys[j].boy_ri);
                    	int r2 = boys[j].check_eligiblity_boy(girl[i].getGirl_mbudget(),girl[i].getGirl_atrg());
                    	if(r1 == 1 && r2 == 1 && "single".equals(boys[j].boy_status) && "single".equals(girl[i].getGirl_status())){
	                            boys[j].boy_status = "commited";
	                            girl[i].statusluck_change("single");
	                            boys[j].hisgirl = girl[i].girl_nameg;
	                            girl[i].herboy = boys[j].boy_nameb;
	                            commit[counter] = new COMMITED(counter,boys[j],girl[i]);
	                            fo.write("Couple Formation\t"+" "+"Couple - "+(counter+1)+"  "+boys[j].boy_nameb+" -> "+" "+girl[i].girl_nameg+" got commited"+"              "+LocalDate.now()+"  "+LocalTime.now());
	                            fo.newLine();
	                            counter++;
	                        }
                    }
                }
                fo.newLine();
                fo.newLine();
                sort_price(Gift,100);
                int tgift = 0;
                for(i=0;i<counter;i++){
                    tgift = commit[i].calculate_happiness(Gift,tgift);
                    for(j=0;j<tgift;j++){
                    	commit[i].giftlist.add(Gift[j]);
                    }
                    commit[i].calculate_compaitibilty();
                }
                if(counter != 0){
			        int k = rand.nextInt(10);
			        if(k == 0 || k < 0){
			        	k = 2;
			        }
					sort_happiness(commit,counter);
					System.out.println("Least "+k+" happiest couple are:");
					printkhappiest(commit,k);
					System.out.println();
					for(i=0;i<k;i++){
						brokengirls[i] = commit[i];
					}
					int l;
					System.out.println("After Breakup Girls got Commited with:");
					fo.write("\t\t\t\t\tAfter Breakup");
					fo.newLine();
					fo.newLine();
					fo.write("\t\t\t\t\tCouple Information");
		            fo.newLine();
		            fo.newLine();
		            fo.write("   Event Type\t\t"+" "+"\t\tEvent Description \t\t"+" "+"\t\tTimeStamp" );
		            fo.newLine();
		            for(l=0;l<k;l++){
		            	for(j=0;j<b;j++){
		            		if(brokengirls[l].b.boy_nameb.equals(boys[j].boy_nameb)){
		                   		boys[j].boy_status = "single";
                            }
		            	}
		            }
		            System.out.println();
		            int in = counter;
					for(l=0;l<k;l++){
						brokengirls[l].g.statusluck_change("commited");
		                for(j=0;j<b;j++){
		                	int f = 1;
			                int r1 = brokengirls[l].g.check_eligiblity_girl(boys[j].boy_ri);
		                   	int r2 = boys[j].check_eligiblity_boy(brokengirls[l].g.getGirl_mbudget(),brokengirls[l].g.getGirl_atrg());
		                   	if(brokengirls[l].b.boy_nameb.equals(boys[j].boy_nameb)){
		                   		f = 0;
                            } 
			                if(r1 == 1 && r2 == 1 && f == 1&& "single".equals(boys[j].boy_status) && "single".equals(brokengirls[l].g.getGirl_status())){
					               	boys[j].boy_status = "commited";
					                brokengirls[l].g.statusluck_change("single");
					                boys[j].hisgirl = brokengirls[l].g.girl_nameg;
					                brokengirls[l].g.herboy = boys[j].boy_nameb;
					                commit[counter] = new COMMITED(counter,boys[j],brokengirls[l].g);
					                counter++;
				             }
                         }
		                	System.out.println(brokengirls[l].g.girl_nameg+" after breakup got commited with "+brokengirls[l].g.herboy);
		                	fo.write("Couple Formation\t"+" "+"Couple - "+(in+1)+"  "+brokengirls[l].g.girl_nameg+" -> "+" "+brokengirls[l].g.herboy+" got commited"+"              "+LocalDate.now()+"  "+LocalTime.now());
	                        fo.newLine();
	                        in++;
		                }
                	}
                fo.newLine();
        		fo.write("\t\t\t\t\tGift Information");
        		fo.newLine();
        		fo.newLine();
        		fo.write("   Event Type\t\t"+" "+"\t\t\tEvent Description\t\t"+"   "+"\t\t\t\tTimeStamp" );
        		fo.newLine();
        		for(i=0;i<counter;i++){
    				int size = commit[i].giftlist.size();
    				for(j=0;j<size;j++){
    					fo.write("Gift Exchanges\t"+"    "+commit[i].b.boy_nameb+" gave gift of type is "+commit[i].giftlist.get(j).gift_type+" "+j+" to his girl "+commit[i].g.girl_nameg+"             "+LocalDate.now()+" "+LocalTime.now());
    					fo.newLine();
    				}
    			}
                	fo.close();
              }
       }
 }
