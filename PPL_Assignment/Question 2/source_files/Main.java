import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
	private static BufferedReader ro;
	private static BufferedReader go;
	public static String generateString(String characters)
	{
	    	char[] text = new char[10];
	    	String temp = characters;
	    	text = temp.toCharArray();
	    	return new String(text);
	}
	public static void bubblesort(Gifttogirl gift[],int c){
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
	public static void bubblesort1(COMMITED gift[],int c){
		int l,h;
		for(l=0;l<c-1;l++){
			for(h=0;h<c-1-l;h++){
				if(gift[h].happiness < gift[h+1].happiness){
					int temp;
					temp = gift[h].happiness;
					gift[h].happiness = gift[h+1].happiness;
					gift[h+1].happiness = temp;
				}
			}
		}
	}
	public static void bubblesort2(COMMITED gift[],int c){
		int l,h;
		for(l=0;l<c-1;l++){
			for(h=0;h<c-1-l;h++){
				if(gift[h].couple_compaitibility < gift[h+1].couple_compaitibility){
					int temp;
					temp = gift[h].couple_compaitibility;
					gift[h].couple_compaitibility = gift[h+1].couple_compaitibility;
					gift[h+1].couple_compaitibility = temp;
				}
			}
		}
	}
	public static void printkhappiest(COMMITED commit[],int k){
		int i;
		for(i=0;i<k;i++){
			System.out.println(commit[i].b.boy_nameb+" and "+commit[i].g.girl_nameg+" are most happiest couple at place "+(i+1)+" and there happiness is "+commit[i].happiness);
		}
	}
	public static void printkcompait(COMMITED commit[],int k){
		int i;
		for(i=0;i<k;i++){
			System.out.println(commit[i].b.boy_nameb+" and "+commit[i].g.girl_nameg+" are most compaitible couple at place "+(i+1)+" and there compaitibility is "+commit[i].couple_compaitibility);
		}
	}

	public static void main(String args[]) throws IOException{
		Random r = new Random();
		int i,j;
		int b = 20;
		int g = 12;
	    String[] arg = new String[0];
	    allocation.main(arg,b,g);
		BOY boys[] = new BOY[b];
		GIRLS girl[] = new GIRLS[g];
		String filename = "dat1.txt";
		String filename1 = "dat2.txt";
		FileReader rb = null;
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
		File file_name = new File("commitboystype.txt");
		File file1_name = new File("commitgirlstype.txt");
		FileWriter wbb = null;
		FileWriter wgg = null;
		wbb = new FileWriter(file_name);
		BufferedWriter bo = new BufferedWriter(wbb);
		wgg = new FileWriter(file1_name);
		BufferedWriter go = new BufferedWriter(wgg);
		COMMITED commit[] = new COMMITED[500];
		File file_name1 = new File("logoutput.txt");
		FileWriter fw = null;
		fw = new FileWriter(file_name1);
		BufferedWriter fo = new BufferedWriter(fw);
		fo.write("\t\t\t\t\tCouple Information");
		fo.newLine();
		fo.newLine();
		fo.write("   Event Type\t\t"+" "+"\tEvent Description \t\t"+" "+"\t\t     TimeStamp" );
		fo.newLine();
		for(j=0;j<g;j++){
			for(i=0;i<b;i++){
				if(boys[i].boy_ri > girl[j].girl_mbudget && boys[i].boy_atrb < girl[j].girl_atrg && boys[i].boy_status == "single" && girl[j].girl_status == "single"){
					boys[i].boy_status = "commited";
					girl[j].girl_status = "commited";
					String bt,gt;
					commit[counter] = new COMMITED(counter,boys[i],girl[j]);
					//commit.Dis();
					bt = commit[counter].BOY_TYPE();
					gt = commit[counter].GIRL_TYPE();
					fo.write("Couple Formation"+"\t"+"Couple - "+counter+"  "+boys[i].boy_nameb+" -> "+" "+girl[j].girl_nameg+" got commited\t"+"      \t"+LocalDate.now()+"  "+LocalTime.now());
					fo.newLine();
					counter++;
					try{

						bo.write(boys[i].boy_nameb+" "+boys[i].boy_atrb+" "+boys[i].boy_ri+" "+boys[i].boy_intelb+" "+bt);
						bo.newLine();
					}
					catch(IOException ex) {
			            System.out.println(
			                "Error writing to file '"
			                + file_name + "'");
			        }
					try{

						go.write(girl[j].girl_nameg+" "+girl[j].girl_atrg+" "+girl[j].girl_mbudget+" "+girl[j].girl_intelg+" "+gt);
						go.newLine();
					}
					catch(IOException ex) {
			            System.out.println(
			                "Error writing to file '"
			                + file1_name + "'");
			        }
					break;
				}
			}
		}
		bo.close();
		go.close();
		fo.newLine();
		fo.write("\t\t\t\t\tGift Information");
		fo.newLine();
		fo.newLine();
		fo.write("   Event Type\t\t"+" "+"\t\tEvent Description \t\t"+"   "+"\t\t\t\t  TimeStamp" );
		fo.newLine();
		if(counter != 0){
			Gifttogirl gift[] = new Gifttogirl[500];
			String giname;
			int givalue;
			int giprice;
			String gitype;
			File giftfile = new File("GiftDetails.txt");
			FileWriter gw = null;
			int c=0;
			try{
				gw = new FileWriter(giftfile);
				BufferedWriter gi = new BufferedWriter(gw);
				for(i=0;i<500;i++){
					giname = "Gifttogirl->"+i;
					givalue = r.nextInt(10000);
					giprice = r.nextInt(100000);
					int temp1 = r.nextInt(3)+1;
					if(temp1 == 1){
						gitype = "Essential Gifts";
					} else if(temp1 == 2){
						gitype = "Luxury Gifts";
					} else {
						gitype = "Utility Gifts";
					}
					gift[c] = new Gifttogirl(giname,givalue,giprice,gitype);
					c++;
					gi.write(giname+" "+givalue+" "+giprice+" "+gitype);
					gi.newLine();
				}
				gi.close();
			}
			catch(IOException ex) {
	            System.out.println(
	                "Error writing to file '"
	                + giftfile + "'");
	        }
			
			int total;
			bubblesort(gift,c);
			for(i=0;i<counter;i++){
				total = 0;
				if(commit[i].boyname_type == "Miser"){
					for(j=0;j<c;j++){
						total += gift[j].gift_price;
						if(total < commit[i].g.girl_mbudget){
							commit[i].giftlist.add(gift[j]);
						}
						else{	//if(total >= commit[i].g.girl_mbudget)
							commit[i].giftlist.add(gift[j]);
							break;
						}
					}
				}
				if(commit[i].boyname_type == "Generous"){
					for(j=0;j<c;j++){
						total += gift[j].gift_price;
						if(total < commit[i].b.boy_ri){
							commit[i].giftlist.add(gift[j]);
						}
						else {	//if(total >= commit[i].b.boy_ri)
							break;
						}
					}
				}
				/*Collections.sort(commit[i].giftlist  , new Comparator <Gifttogirl>() {
                    @Override
                    public int  compare(Gifttogirl o1, Gifttogirl o2) {
                    if ((o1.gift_type).equalsIgnoreCase("Luxury Gifts") )//sort w r t luxury 
                    return -1;
                    return  1;  //ob1.compareTo(o2)
                    }
				});*/
				if(commit[i].boyname_type == "Geeks"){
					ArrayList <Integer> ar=new ArrayList<>();
					for(j=0;j<c;j++){
						total += gift[j].gift_price;
						if(total < commit[i].g.girl_mbudget){
							commit[i].giftlist.add(gift[j]);
							ar.add(j);
						}
						else {		//if((total >= commit[i].g.girl_mbudget))
							commit[i].giftlist.add(gift[j]);
							ar.add(j);
							break;
						}
					}
					int y,flag;
					for(j=0;j<c;j++){
						if((gift[j].gift_type.equals("Luxury Gifts")) && ((Math.abs(commit[i].b.boy_ri-total) >= gift[j].gift_price) )) {
							//(total > commit[i].g.girl_mbudget)&&
							y=0;
							flag=1;
							for(y=0;y<ar.size();y++)
							{
								if(ar.get(y)==j)
								{
									flag=0;
									break;
								}
							}
							if(flag==1)
							{
								commit[i].giftlist.add(gift[j]);
								break;
							}
						}
					}
						
						
						
					}
			}
			/*for(i=0;i<counter;i++){
				System.out.println(commit[i].giftlist.size());
			}*/
			int gtotal,gtotal1;
			for(i=0;i<counter;i++){
				gtotal = 0;
				gtotal1 = 0;
				if(commit[i].girlname_type == "Choosy"){
					for(j=0;j<c;j++){
						gtotal += gift[j].gift_price;
					}
					for(j=0;j<c;j++){
						if(gift[j].gift_type == "Luxury Gifts"){
							gtotal1 += gift[j].gift_price;
						}
					}
					commit[i].girl_happiness = (int) Math.log(gtotal-commit[i].g.girl_mbudget+2*gtotal1)%10000;
				}
				if(commit[i].girlname_type == "Desperate"){
					for(j=0;j<c;j++){
						gtotal += gift[j].gift_price;
					}
					commit[i].girl_happiness = (int) Math.exp(gtotal-commit[i].g.girl_mbudget)%10000;
				}
				if(commit[i].girlname_type == "Normal"){
					for(j=0;j<c;j++){
						gtotal += gift[j].gift_price;
					}
					commit[i].girl_happiness = (int)(gtotal-commit[i].g.girl_mbudget)%10000;
				}
			}
			for(i=0;i<counter;i++){
				gtotal = 0;
				if(commit[i].boyname_type == "Miser"){
					for(j=0;j<c;j++){
						gtotal += gift[j].gift_price;
					}
					commit[i].boy_happiness = (gtotal-commit[i].b.boy_ri)%10000;
				}
				if(commit[i].boyname_type == "Generous"){
					commit[i].boy_happiness = (commit[i].girl_happiness)%10000;
				}
				if(commit[i].boyname_type == "Geeks"){
					commit[i].boy_happiness = (commit[i].g.girl_intelg)%10000;
				}
			}
			for(i=0;i<counter;i++){
				commit[i].happiness = (commit[i].boy_happiness+commit[i].girl_happiness)%10000;
			}
			bubblesort1(commit,counter);
			int k = r.nextInt(counter);
			//printkhappiest(commit, k);
			System.out.println();
			for(i=0;i<counter;i++){
				commit[i].couple_compaitibility = Math.abs(commit[i].b.boy_atrb-commit[i].g.girl_atrg)+Math.abs(commit[i].b.boy_intelb-commit[i].g.girl_intelg)+Math.abs(commit[i].b.boy_ri-commit[i].g.girl_mbudget);
			}
			bubblesort2(commit,k);
			//printkcompait(commit,k);
			//System.out.println();
			for(i=0;i<counter;i++){
				int size = commit[i].giftlist.size();
				//System.out.println(commit[i].b.boy_nameb+" gave "+size+" Gifts to his girlfriend "+commit[i].g.girl_nameg+":");
				//System.out.println("Gift description are -");
				for(j=0;j<size;j++){
					fo.write("Gift Distribution"+"\t"+commit[i].b.boy_nameb+" gave gift of type is "+commit[i].giftlist.get(j).gift_type+" "+j+" to his girl "+commit[i].g.girl_nameg+"    \t\t"+LocalDate.now()+" "+LocalTime.now());
					fo.newLine();
					//System.out.println(commit[i].giftlist.get(j).gift_name +" "+ commit[i].giftlist.get(j).gift_price + " "+commit[i].giftlist.get(j).gift_value + " " + commit[i].giftlist.get(j).gift_type);
				}
				//System.out.println();
			}
		} else {
			System.out.println("No couples are formed");
		}
		fo.close();
	}
}
