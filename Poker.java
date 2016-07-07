public static boolean flush (String h1) {
for (int i=0;i<4;i++) {
	if (Cards[i].getsuit()! = Cards[i+1].getSuit() )
		return false;
	}
}
public static boolean fourofakind (String h1) {
int count=0;
int i=0;
while (int i<4) {
	if (Cards[x].getpip() = Cards[X+1].getpip() ){
	count++;
	i++;
	}
	else
	i++;
	if(Count!==4)
 	fourofakind= false;
}
public static boolean straightflush (string h1) {
	for(int i=0;i<4;i++) { 
	if(Cards[i].getsuit()= Cards[i+1].getsuit() && Cards[i].getpip() < Cards[i+1].getpip() )
		return false;
	}
}

