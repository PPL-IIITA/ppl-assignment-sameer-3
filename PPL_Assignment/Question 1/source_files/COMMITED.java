public class COMMITED {
	BOY boyname;
	GIRLS girlname;
	int count;
	COMMITED(int counter,BOY boy,GIRLS girl){
		boyname = boy;
		girlname = girl;
		count = counter;
	}
	public void Dis(){
		System.out.println("Couple - "+count+"  "+boyname.boy_nameb+"  ->  "+girlname.girl_nameg+" got commited");
	}
}
