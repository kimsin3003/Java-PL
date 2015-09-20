package common.strategy;

import java.util.ArrayList;

import common.station.Passenger;

public class Strategy_FIFO implements Strategy{

	@Override
	public int getNextIndex(ArrayList<Passenger> passengers) {
		if(passengers.isEmpty())
			return -1;
		return 0;
	}
	
}