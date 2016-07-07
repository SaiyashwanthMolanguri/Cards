import java.util.*;

class Cards implements Comparable<Cards>{

	int pip;
	String suit;
	
	Cards(int pip , String suit){
		this.pip = pip;
		this.suit = suit;
	}
	
	int getCardNumber(){
		return pip;
	}
	
	String getCardSuit(){
		return suit;
	}
	
	public int compareTo(Cards c2){
			return (this.getCardNumber() - c2.getCardNumber()); 	
	}
	
}



class Hand{

	ArrayList<Cards> seq = new ArrayList<Cards>();
	static boolean[] taken = new boolean[52];
	static String[] suit = new String[4];
	 
	
	static{
		suit[0]= "CLUB";
		suit[1]= "DIAMOND";
		suit[2]= "HEARTS";
		suit[3]= "SPADES";
	}
	
	
	Hand(){
		
		int count = 0 ;
		Random rand = new Random();
		int randomNum;
			
		while(count<5){
			randomNum = rand.nextInt(53);
			
			if(!taken[randomNum]){
				taken[randomNum] =true;
				seq.add(new Cards(randomNum%13 ,suit[randomNum/13]));
				++count;	
			}
					
		}
		
		Collections.sort(seq);
	}
	
	
	
}

class Main{
	public static void main(String[] args){
		System.out.println("Good");	
	}

}

