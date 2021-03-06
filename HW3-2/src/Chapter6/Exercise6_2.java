package Chapter6;

class Exercise6_2{
	public static void main(String args[]){
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}


class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(){
		num = -1;
		isKwang = true;
	}
	
	public SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info(){
		String result = "";
		if(num != -1)
			result += num;
		if(isKwang)
			result += "IK";
		
		return result;
	}
	
}
