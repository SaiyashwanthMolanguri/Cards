import java.util.*;

class Cards{

	int pip;
	String suit;
	
	Cards(int pip , String suit){
		this.pip = pip;
		this.suit = suit;
	}
	
	void string toString(){
		System.out.println("This is "+ pip+" of "+suit);
	
	}

}

class Deck implements Comparator{
	
	int noOfCardsLeft;
	ArrayList<Cards> deck;
	
	Deck(String suit){
		noOfCardsLeft = 13;
		deck = new ArrayList<Cards>();
		
		for(int i=1; i<=13;++i)
			deck.add(i,suit); 
	
	}

	void drawACard(Card c){
		deck.remove(c); 
	}
	
	void sortCards(){
		Collections.sort(deck);
	}
	
	public int compare(Cards c1, Cards c2){
		return (c1.pip- c2.pip);
	}
	
}

class DiamondGame{
	
	String name;
	String playerSuit;
	String computerSuit;
	int playerTurn;
	int computerTurn;
	boolean 
	DiamondGame(String name){
		this.name = name;
		begin();
	}			
	
	void begin(){
		Random rand;
		int randomNum = rand.nextInt((2);
		
		playerTurn = randomNum;
		computerTurn= (randomNum+1)%2;
		
		while(gameContinue){
		
		}
		
		
	}
	
	

}	
	
	

