class Cards{

	String pip;
	int cardNum;
	int suit;
	String[]  cardSuit = new String[4];
	String[]  cardNumber = new cardNumber[13];
	Cards(int n){
		
		cardSuit[0] = "CLUBS";
		cardSuit[1] ="DIAMOND";
		cardSuit[2] ="HEART";
		cardSuit[3] = "SPADES";
		
		for(int i=0;i<13;++i)
			cardNumber[i]= (i+1).toString();
		
		cardNumber[0]="A";
		cardNumber[10]= "J";
		cardNumber[11]="Q";	
		cardNumber[12]="K";
		
		cardNum = n/13+1;
		pip= cardNumber[n%13]
		suit = cardSuit[n/13];
		
	}
	
	String getPip(){
		return pip;
	}
	
	int getCardNumber(){
		return 
	}
		
	String getSuit(){
		return cardSuit[pip];
	}


}

