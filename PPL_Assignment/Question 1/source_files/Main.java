import java.util.*;
import java.io.*;
import java.time.*;
public class Main {
	private static BufferedReader ro;
	private static BufferedReader go;

	public static void main(String args[]) throws IOException{
		Random r = new Random();
		int i,j;
		int b = 20;
		int g = r.nextInt(15);
	    String[] arg = new String[0];
	    allocation.main(arg,b,g);
		BOY boys[] = new BOY[b];
		GIRLS girl[] = new GIRLS[g];
		String filename = "dat1.txt";
		String filename1 = "dat2.txt";
		FileReader rb = null;
		FileWriter wb = null;
		try{
			String nameb;
			int atrb;
			int ri;
			int intelb;
			String t = "single";
			rb = new FileReader(filename);
			ro = new BufferedReader(rb);
			for(i=0;i<b;i++){
				String current = ro.readLine();
				StringTokenizer temp = new StringTokenizer(current," ");
				 nameb=temp.nextToken();
				 atrb=Integer.parseInt(temp.nextToken());
				 ri= Integer.parseInt(temp.nextToken());
				 intelb= Integer.parseInt(temp.nextToken());
				 boys[i] = new BOY(nameb,atrb,ri,intelb,t);
			}
		}
		catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + filename + "'");
        }
		try{
			String nameg;
			int atrg;
			int mbudget;
			int intelg;
			String t = "single";
			rb = new FileReader(filename1);
			go = new BufferedReader(rb);
			for(i=0;i<g;i++){
				String current = go.readLine();
				StringTokenizer temp = new StringTokenizer(current," ");
				 nameg=temp.nextToken();
				 atrg=Integer.parseInt(temp.nextToken());
				 mbudget= Integer.parseInt(temp.nextToken());
				 intelg= Integer.parseInt(temp.nextToken());
				 girl[i] = new GIRLS(nameg,atrg,mbudget,intelg,t);
			}
		}
		catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + filename1 + "'");
        }
		int counter=0;
		File filename11 = new File("logoutput.txt");
		wb = new FileWriter(filename11);
		BufferedWriter bo = new BufferedWriter(wb);
		bo.write("   Event Type\t\t"+" "+"\tEvent Description \t\t"+" "+"\t      TimeStamp" );
		bo.newLine();
		for(j=0;j<g;j++){
			for(i=0;i<b;i++){
				if(boys[i].boy_ri > girl[j].girl_mbudget && boys[i].boy_atrb < girl[j].girl_atrg && boys[i].boy_status == "single" && girl[j].girl_status == "single"){
					boys[i].boy_status = "commited";
					girl[j].girl_status = "commited";
					counter++;
					String b1= boys[i].boy_nameb;
					String g1 = girl[j].girl_nameg;
					bo.write("Couple Formation"+"\t"+"Couple - "+counter+"  "+b1+" -> "+" "+g1+" got commited"+"   \t"+LocalDate.now()+"  "+LocalTime.now());
					bo.newLine();
					COMMITED commit = new COMMITED(counter,boys[i],girl[j]);
					//commit.Dis();
					break;
				}
			}
		}
		bo.close();
	}
}
