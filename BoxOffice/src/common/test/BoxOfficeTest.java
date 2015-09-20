package common.test;

import common.strategy.*;

public class BoxOfficeTest {

	public static void main(String[] args){
		Strategy strategies[] = new Strategy[2];
		strategies[0] = new Strategy_FIFO();
		strategies[1] = new Strategy_LTFO();
		Simulator simulator = Simulator.getInstance();
		
		for(int i = 0; i < strategies.length; i++)
			System.out.println("spent time: " + simulator.start(strategies[i], "output" + (i+1) + ".txt"));
		
	}

}
