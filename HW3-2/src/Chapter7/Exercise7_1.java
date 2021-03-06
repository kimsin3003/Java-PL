package Chapter7;

import java.util.Random;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < CARD_NUM/2; i++){
			
			cards[2*i] = new SutdaCard(i+1, false);
			cards[2*i + 1] = new SutdaCard(i+1, false);

			if(i == 0 || i == 2 || i == 8)
				cards[2*i] = new SutdaCard(i+1, true);
		}
		
	}
	
	void shuffle(){
			
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int rand = random.nextInt(cards.length);
			SutdaCard temp = cards[rand];
			cards[rand] = cards[i];
			cards[i] = temp;
		}
	}
	
	SutdaCard pick(int index){
		return cards[index];
	}
		
	
	SutdaCard pick(){
		return cards[(new Random()).nextInt(cards.length)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num +  ( isKwang ? "K":"");
	}
}


public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");

	}

}
