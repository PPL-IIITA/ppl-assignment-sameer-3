import java.util.*;
import java.io.*;
public class allocation {
	public static String generateString(String characters)
	{
	    	char[] text = new char[10];
	    	String temp = characters;
	    	text = temp.toCharArray();
	    	return new String(text);
	}
	public static void main(String args[],int b,int g) throws IOException
	{
		Random r = new Random();
		String bname;
		int atrb;
		int ri;
		int intelb;
		int i;
		File filename = new File("dat1.txt");
		FileWriter wb = null;
		FileWriter wg = null;
		try{
			wb = new FileWriter(filename);
			BufferedWriter bo = new BufferedWriter(wb);
			for(i=0;i<b;i++){
				String charac1[] = {"Rahul","Sanjeev","Amit","Sumit","Harsh","Raghav","Shobit","Abhishek","Manish","Sameer","Rajat","Indresh","Ashwin","Amit","Arpit","vipul","Risabh","Alok","Adarsh","pankaj","Asmit"};
				String output;
				output = generateString(charac1[i]);
				bname = output;
				atrb = r.nextInt(100)+1;
				ri = r.nextInt(100000)+10000;
				intelb = r.nextInt(10)+1;
				bo.write(bname+" "+atrb+" "+ri+" "+intelb);
				bo.newLine();
	        }
			bo.close();
		}
		catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + filename + "'");
        }
		String gname;
		int atrg;
		int mbudget;
		int intelg;
		int j;
		File filename1 = new File("dat2.txt");
		try{
			wg = new FileWriter(filename1);
			BufferedWriter go = new BufferedWriter(wg);
			for(j=0;j<g;j++){
				String charac2[] = {"Amrita","rekha","Pooja","Seema","Akanksha","Priyanka","Sonali","Ritika","Ayushi","Neha","Nishtha","Richa","Sulekha","Asmita","Rupali"};
				String output;
				output = generateString(charac2[j]);
				gname = output;
				atrg = r.nextInt(100)+1;
				mbudget = r.nextInt(100000)+1000;
				intelg = r.nextInt(10)+1;
				go.write(gname+" "+atrg+" "+mbudget+" "+intelg);
				go.newLine();
	        }
			go.close();
		}
		catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + filename1 + "'");
        }
		
		
	}
}
