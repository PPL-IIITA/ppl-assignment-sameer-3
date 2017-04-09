import java.io.*;
import java.util.*;
/**
 * 
 * @author jolly
 *
 */
public class random_generation {
	/**
	 * Number of Boys
	 */
	public int x;
	/**
	 * Number of Girls
	 */
	public int y;
	/**
	 * Create a file with name 'Boys_details.txt' and Write the data of boys
	 */
	File filename1 = new File("Boys_details.txt");
	/**
	 * Create a file with name 'Girls_details.txt' and Write the data of girls
	 */
	File filename2 = new File("Girls_details.txt");
	/**
	 * Create a file with name 'Gifts_details.txt' and Write the data of gifts
	 */
	File filename3 = new File("Gifts_details.txt");
	/**
	 * To generate random String
	 * @param characters (Array of Strings)
	 * @return (Return a random String among all of the Strings present in the Array)
	 */
	public String generateString(String characters)
	{
	    	char[] text = new char[10];
	    	String temp = characters;
	    	text = temp.toCharArray();
	    	return new String(text);
	}
	/**
	 * 
	 * In this method ,we write randomly data on files :
	 * -Boys_details.txt ,
	 * -Girls_details.txt ,
	 * -Gifts_details.txt respectively.
	 */
	public void generation(){
		Random r = new Random();
		Random nob = new Random();
		Random nog = new Random();
		Random nogi = new Random();
		int i,j;
		String [] type_boy = {"generous","geeks","miser"};
		String [] type_girl = {"normal","choosy","desperate"};
		String [] type_gift = {"utility","luxury","essential"};
		FileWriter wboy,wgirl,wgift;
		try{
			wboy = new FileWriter(filename1);
			BufferedWriter bo = new BufferedWriter(wboy);
			x = 20;
			for(i=0;i<x;i++){
				String charac1[] = {"Rahul","Sanjeev","Amit","Sumit","Harsh","Raghav","Shobit","Abhishek","Manish","Sameer","Rajat","Indresh","Ashwin","Amit","Arpit","vipul","Risabh","Alok","Adarsh","pankaj","Asmit"};
				String output;
				output = generateString(charac1[i]);
				String bname = output;
				int atrb = r.nextInt(100)+1;
				int atrbq = r.nextInt(80)+1;
				int ri = r.nextInt(100000)+10000;
				int intelb = r.nextInt(10)+1;
				String btype = type_boy[nob.nextInt(type_boy.length)];
				bo.write(bname+","+atrb+","+ri+","+intelb+","+atrbq+","+btype);
				bo.newLine();
	        }
			bo.close();
			wgirl = new FileWriter(filename2);
			BufferedWriter go = new BufferedWriter(wgirl);
			y = 15;
			for(j=0;j<y;j++){
				String charac2[] = {"Amrita","rekha","Pooja","Seema","Akanksha","Priyanka","Sonali","Ritika","Ayushi","Neha","Nishtha","Richa","Sulekha","Asmita","Rupali","Rupali","Sefali"};
				String output;
				output = generateString(charac2[j]);
				String gname = output;
				int atrg = r.nextInt(100)+1;
				int mbudget = r.nextInt(100000)+1000;
				int intelg = r.nextInt(10)+1;
				String gtype = type_girl[nog.nextInt(type_girl.length)];
				go.write(gname+","+atrg+","+mbudget+","+intelg+","+gtype);
				go.newLine();
	        }
			go.close();
			wgift = new FileWriter(filename3);
            BufferedWriter gi = new BufferedWriter(wgift);
            for(i=0;i<100;i++){
                 	String giname = "Gifttogirl->"+i;
                    int givalue = r.nextInt(10000);
                    int giprice = r.nextInt(100000);
                    String gitype = type_gift[nogi.nextInt(3)];
                    gi.write(giname+","+givalue+","+giprice+","+gitype);
                    gi.newLine();
            }
            gi.close();
		}catch(IOException e){		
			System.out.println( e.getMessage() );
		}
	}
}
