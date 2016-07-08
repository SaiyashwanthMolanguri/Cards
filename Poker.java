public static boolean flush (String hand) {
	for (int i=0;i<4;i++) {
	if (Cards[i].getCardSuit()! = Cards[i+1].getCardSuit() )
		return false;
	}
}
public static boolean fourofakind (String hand) {
	int count=0;
	int i=0;
	while (int i=0;i<4;i++) {
	if (Cards[x].getCardNumber() = Cards[X+1].getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	if(Count!==4)
 	fourofakind= false;
}
public static boolean straightflush (string hand) {
	for(int i=4;i<=0;i--) { 
	if(Cards[i].getCardSuit()= Cards[i+1].getCardSuit() && Cards[i].getCardNumber() < Cards[i+1].getCardNumber() )
		return false;
	}
}
public static boolean royalflush (string h1) {
	for(int i=0;i<4;i++) { 
	if(Cards[i].getCardSuit()= Cards[i+1].getCardSuit() && Cards[i].getCardNumber()  > Cards[i+1].getCardNumber() )
		return false;
	}
}

public static boolean straight (string hand) {
	for(int i=0;i<4;i++) { 
	if(Cards[i].getCardNumber() < Cards[i+1].getCardNumber() )
		return false;
	}
public static boolean threeofakind (String hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (Cards[i].getCardNumber() = Cards[i+1].getCardNumber() && Cards[i+1] = Cards[i+2] ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 1)
 	return true;
}
public static boolean twopair (String hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (Cards[x].getCardNumber() = Cards[X+1].getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 2)
 	return true;
}
public static boolean onepair (String hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (Cards[x].getCardNumber() = Cards[X+1].getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 1)
 	return true;
}
public static boolean fullhouse (String hand) {
	int count=0;
	int i=0;
	while (int i<4) {
	if (Cards[x].getCardNumber() = Cards[X+1].getCardNumber() ){
	count++;
	i++;
	}
	else
	i++;
	}
	if(Count == 3)
 	return true;
}
public static boolean High (String hand) {
	for (int i=0;i<4;i++) {
	if (Cards[i].getCardNumber() > Cards[i+1].getCardNumber() )
		return false;
	}
}


	
	

