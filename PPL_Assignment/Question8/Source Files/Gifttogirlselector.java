
/**
 * 
 * @author jolly
 *
 */

public class Gifttogirlselector {
	/**
	 * To select a gift which is not present n the gift exchanges
	 * @param commit (An array of object of class COMMITED)
	 * @param totalcouple (Number of total couples)
	 * @param Gift (An array of object of class Gifttogirl)
	 */
	public void selector(COMMITED [] commit,int totalcouple,Gifttogirl []Gift){
		int i,j,l;
		int gt1 = 0;
		int gt2 = 0;
		int gt3 = 0;
		String []git = {"luxury","essential","utility"};
		for(i=0;i<totalcouple;i++){
			int size = commit[i].giftlist.size();
			String [] type = new String[100];
			for(j=0;j<size;j++){
					type[j] = commit[i].giftlist.get(j).gift_type;
				}
			for(j=0;j<3;j++){
				switch(git[j]){
					case "luxury":
						for(l=0;l<size;l++){
							if(type[l].equals("luxury")){
								gt1++;
							}
						}
						break;
					case "essential":
						for(l=0;l<size;l++){
							if(type[l].equals("essential")){
								gt2++;
							}
						}
						break;
					case "utility":
						for(l=0;l<size;l++){
							if(type[l].equals("utility")){
								gt3++;
							}
						}
						break;
					default :
						break;
				}
			}
			if(gt1 == 0){
				System.out.println("Gift of type is luxury does not present in gift exchanges:");
				System.out.println("Now we are gonna add this to gift excjhange event:");
				for(j=0;j<100;j++){
					if(Gift[j].gift_type.equals("luxury")){
						commit[i].giftlist.add(Gift[j]);
						System.out.println(commit[i].b.boy_nameb+" gave gift of type is luxury"+" "+j+" to his girl "+commit[i].g.girl_nameg);
					}
				}
			}
			if(gt2 == 0){
				System.out.println("Gift of type is essential does not present in gift exchanges:");
				System.out.println("Now we are gonna add this to gift excjhange even:");
				for(j=0;j<100;j++){
					if(Gift[j].gift_type.equals("essential")){
						commit[i].giftlist.add(Gift[j]);
						System.out.println(commit[i].b.boy_nameb+" gave gift of type is essential"+" "+j+" to his girl "+commit[i].g.girl_nameg);
					}
				}
			}
			if(gt3 == 0){
				System.out.println("Gift of type is utility does not present in gift exchanges:");
				System.out.println("Now we are gonna add this to gift excjhange event:");
				for(j=0;j<100;j++){
					if(Gift[j].gift_type.equals("utility")){
						commit[i].giftlist.add(Gift[j]);
						System.out.println(commit[i].b.boy_nameb+" gave gift of type is utility"+" "+j+" to his girl "+commit[i].g.girl_nameg);
					}
				}
			}
		}
	}
}
