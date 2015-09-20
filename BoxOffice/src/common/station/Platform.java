package common.station;

import java.io.IOException;
import java.util.ArrayList;

import common.info.FileRW;
import common.path.Path;

public class Platform{
	private static Platform instance = null;
	private static ArrayList<Passenger> waitingPassengers;
	private Path path;
	private Platform(){ 
		waitingPassengers = new ArrayList<Passenger>();	
		path = Path.getInstance();
	}
	
	public static Platform getInstance(){
		if(instance == null)
			instance = new Platform();
		return instance;
	}
	
	public void simulate(ArrayList<Passenger> exitedPassengers, int time){
		if(hasArrivedTrain(time)){
			int officeArrivingTime;
			int ticketingWaitingTime;
			int ticketingTime;
			int platformArrivingTime;
			for(int i = 0; i < waitingPassengers.size(); i++){
				Passenger passenger = waitingPassengers.get(i);
				officeArrivingTime = passenger.getOfficeArrivalTime();
				ticketingWaitingTime = passenger.getTicketingWaitingTime();
				ticketingTime = passenger.getTicketingTime();
				platformArrivingTime = officeArrivingTime + ticketingWaitingTime + ticketingTime;
				passenger.setTrainWaitingTime(time - platformArrivingTime);
				int travelTime = path.getTravelTime(passenger.getStartPoint(), passenger.getEndPoint());
				passenger.setDestinationArrivalTime(time + travelTime);
			}
			
			dequeueAll(exitedPassengers);
		}
	}
	
	public void enqueuePassenger(Passenger p){
		waitingPassengers.add(p);
	}
	
	public boolean hasPassenger(){
		if(waitingPassengers.isEmpty())
			return false;
		return true;
	}
	
	private boolean hasArrivedTrain(int time){
		if(time%3 == 0)
			return true;
		return false;
	}
	
	private void dequeueAll(ArrayList<Passenger> exitedPassengers){
		//for(Passenger p : waitingPassengers){
			//System.out.println(p.getId());
		//}
		for(Passenger p : waitingPassengers)
			exitedPassengers.add(p);
		waitingPassengers.clear();
	}
	
}