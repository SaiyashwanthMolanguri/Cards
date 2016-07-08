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
			return (c2.getCardNumber() - this.getCardNumber() ); 	
	}
	
}



class Hand{

	ArrayList<Cards> seq = new ArrayList<Cards>();
	 boolean[] taken = new boolean[52];
	 String[] suit = new String[4];
	 
	
	{
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
			randomNum = rand.neitInt(53);
			
			if(!taken[randomNum]){
				taken[randomNum] =true;
				seq.add(new Cards(randomNum%13 ,suit[randomNum/13]));
				++count;	
			}
					
		}
		
		Collections.sort(seq);
	}
	
	
	
}

class Poker{

	Hand h1;
	Hand h2;
	
	Poker(){
	
		h1 = new Hand();
		h2 = new Hand();
	
	}
	
	public Hand whoIsWinner(){
	
	ArrayList<Boolean> result1 = new ArrayList<Boolean>(10);
	ArrayList<Boolean> result2 = new ArrayList<Boolean>(10);

	result1.add(royalflush(h1));
	result1.add(straightflush(h1));
	result1.add(fourofakind(h1));
	result1.add(fullhouse(h1));
	result1.add(flush(h1));
	result1.add(straight(h1));
	result1.add(threeofakind(h1));
	result1.add(twopair(h1));
	result1.add(onepair(h1));
	result1.add(highCard(h1));
	
	result2.add(royalflush(h2));
	result2.add(straightflush(h2));
	result2.add(fourofakind(h2));
	result2.add(fullhouse(h2));
	result2.add(flush(h2));
	result2.add(straight(h2));
	result2.add(threeofakind(h2));
	result2.add(twopair(h2));
	result2.add(onepair(h2));
	result2.add(highCard(h2));
	}	
	
	public  boolean flush (Hand hand) {
		for (int i=0;i<4;i++) {
			if (hand.get(i).getCardSuit()! == hand.get(i+1).getCardSuit() )
					return false;
		}
	}
	
	public  boolean fourofakind (Hand hand) {
		int count=0;
		int i=0;
		while (int i=0;i<4;i++) {
			if (hand.get(i).getCardNumber() == hand.get(i+1).getCardNumber() ){
					count++;
					i++;
		}
			else
				i++;
		if(Count!==4)
	 		return false;
	}
	
	public  boolean straightflush (Hand hand) {
		for(int i=4;i<=0;i--) { 
			if(hand.get(i).getCardSuit() ==  hand.get(i+1).getCardSuit() && hand.get(i).getCardNumber() < hand.get(i+1).getCardNumber() )
				return false;
		}
	}
	public  boolean royalflush (string h1) {
		for(int i=0;i<4;i++) { 
			if(hand.get(i).getCardSuit() == hand.get(i+1).getCardSuit() && hand.get(i).getCardNumber()  > hand.get(i+1).getCardNumber() )
				return false;
		}
	}

	public  boolean straight (Hand hand) {
		for(int i=0;i<4;i++) { 
			if(hand.get(i).getCardNumber() < hand.get(i+1).getCardNumber() )
				return false;
		}
	
	public  boolean threeofakind (Hand hand) {
		int count=0;
		int i=0;
		while (int i<4) {
			if (hand.get(i).getCardNumber() == hand.get(i+1).getCardNumber() && hand.get(i+1) == Cards[i+2] ){
					count++;
					i++;
			}
			else
				i++;
		}
		if(Count == 1)
	 		return true;
	}
	
	public  boolean twopair (Hand hand) {
		int count=0;
		int i=0;
		while (int i<4) {
			if (hand.get(i).getCardNumber() == hand.get(i+1).getCardNumber() ){
					count++;
					i++;
			}
			else
				i++;
		}
		if(Count == 2)
	 		return true;
	}
	public  boolean onepair (Hand hand) {
		int count=0;
		int i=0;
		while (int i<4) {
			if (hand.get(i).getCardNumber() == hand.get(i+1).getCardNumber() ){
					count++;
					i++;
			}
			else
				i++;
		}
		if(Count == 1)
	 		return true;
	}
	
	public  boolean fullhouse (Hand hand) {
		int count=0;
		int i=0;
		while (int i<4) {
			if (hand.get(i).getCardNumber() == hand.get(i+1).getCardNumber() ){
					count++;
					i++;
			}
			else
				i++;
		}
		if(Count == 3)
	 		return true;
	}
	
	public  boolean highCard (Hand hand) {
		for (int i=0;i<4;i++) {
			if (hand.get(i).getCardNumber() > hand.get(i+1).getCardNumber() )
				return false;
		}
	}


}	
	
public class Main{
	public  void main(String[] args){
		

	}


}

