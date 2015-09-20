package common.strategy;

import java.util.ArrayList;

import common.station.Passenger;

public interface Strategy{
	public int getNextIndex(ArrayList<Passenger> passengers);
}
