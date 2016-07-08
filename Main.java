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

class Poker{

	Hand h1;
	Hand h2;
	
	Poker(){
	
		h1 = new Hand();
		h2 = new Hand();
	
	}
	
public static boolean flush (Hand hand) {
	for (int i=0;i<4;i++) {
	if (hand.get(i).getCardSuit()! = hand.get(i+1).getCardSuit() )
		return false;
	}
}
public static boolean fourofakind (Hand hand) {
	int count=0;
	int i=0;
	while (int i=0;i<4;i++) {
	if (hand.get(x).getCardNumber() = hand.get(x+1).getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	if(Count!==4)
 	fourofakind= false;
}
public static boolean straightflush (Hand hand) {
	for(int i=4;i<=0;i--) { 
	if(hand.get(i).getCardSuit()= hand.get(i+1).getCardSuit() && hand.get(i).getCardNumber() < hand.get(i+1).getCardNumber() )
		return false;
	}
}
public static boolean royalflush (string h1) {
	for(int i=0;i<4;i++) { 
	if(hand.get(i).getCardSuit()= hand.get(i+1).getCardSuit() && hand.get(i).getCardNumber()  > hand.get(i+1).getCardNumber() )
		return false;
	}
}

public static boolean straight (Hand hand) {
	for(int i=0;i<4;i++) { 
	if(hand.get(i).getCardNumber() < hand.get(i+1).getCardNumber() )
		return false;
	}
public static boolean threeofakind (Hand hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (hand.get(i).getCardNumber() = hand.get(i+1).getCardNumber() && hand.get(i+1) = Cards[i+2] ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 1)
 	return true;
}
public static boolean twopair (Hand hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (hand.get(x).getCardNumber() = hand.get(x+1).getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 2)
 	return true;
}
public static boolean onepair (Hand hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (hand.get(x).getCardNumber() = hand.get(x+1).getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 1)
 	return true;
}
public static boolean fullhouse (Hand hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (hand.get(x).getCardNumber() = hand.get(x+1).getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 3)
 	return true;
}
public static boolean High (Hand hand) {
	for (int i=0;i<4;i++) {
	if (hand.get(i).getCardNumber() > hand.get(i+1).getCardNumber() )
		return false;
	}
}


}	
	
public class Main{
	public static void main(String[] args){
		System.out.println("Good");	
	}

}

