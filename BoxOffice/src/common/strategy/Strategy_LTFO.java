package common.strategy;

import java.util.ArrayList;

import common.station.Passenger;

public class Strategy_LTFO implements Strategy{

	@Override
	public int getNextIndex(ArrayList<Passenger> passengers) {
		int index = 0;
		int time1;
		int time2;
		if(passengers.isEmpty())
			return -1;
		for(int i = 0; i < passengers.size(); i++){
			time1 = passengers.get(index).getTicketingTime();
			time2 = passengers.get(i).getTicketingTime();
			if(time1 > time2)
				index = i;
		}
		return index;
	}
	
}