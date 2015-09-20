package common.ServiceStrategy;

import java.util.ArrayList;

import common.Station.Passenger;

public interface Strategy{
	public int getNextIndex(ArrayList<Passenger> passengers);
}
