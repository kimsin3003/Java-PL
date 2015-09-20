package common.test;

import common.strategy.*;

public class BoxOfficeTest {

	public static void main(String[] args){
		Strategy strategies[] = new Strategy[2];
		strategies[0] = new Strategy_FIFO();
		strategies[1] = new Strategy_LTFO();
		Simulator simulator = Simulator.getInstance();
		
		
		for(int i = 0; i < strategies.length; i++){
			System.out.println("strategy " + i + " start");
			simulator.start(strategies[i], "output" + (i+1) + ".txt");
		}
		
		System.out.println("\n\n생신 축하드립니다~!");
	}

}
