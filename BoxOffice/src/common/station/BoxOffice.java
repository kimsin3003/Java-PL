package common.station;

import java.util.ArrayList;
import common.strategy.Strategy;

public class BoxOffice {

	Server[] servers;
	private static BoxOffice instance = null;
	private int availiableServers;
	private static ArrayList<Passenger> waitingPassengers;
	
	public void simulate(Strategy strategy, ArrayList<Passenger> passengersWithTicket, int time){
		Server server;
		//update servers
		for(int i = 0; i < servers.length; i++){
			server = servers[i];
			if(server.getLeftTime() == 0){//if ticketing is over,
				if(server.getMyPassenger() != null){
					Passenger passenger = server.getMyPassenger();
					passengersWithTicket.add(passenger);// send passenger to platform
					waitingPassengers.remove(passenger);
					server.setMyPassenger(null);
					availiableServers++;
				}
			
				int nextPassengerIndex = strategy.getNextIndex(waitingPassengers);
				
				if(nextPassengerIndex == -1){
					continue;
				}
				Passenger p = waitingPassengers.get(nextPassengerIndex);
				waitingPassengers.remove(nextPassengerIndex);
				p.setTicketingStartTime(time);
				p.setTicketingWaitingTime(time - p.getOfficeArrivalTime());//set passenger's waiting time
				server.setMyPassenger(p);// give the server one passenger
				availiableServers--;
			}
			server.downLeftTime();//If thread is alive, down serving time by 1.
		}
		
		//keep simulate platform
		//platform.simulation(time);
	}

	private BoxOffice(){
		servers = new Server[3];
		for(int i = 0; i < servers.length; i++)
			servers[i] = new Server();
		waitingPassengers = new ArrayList<Passenger>();
		availiableServers = 3;
	}
	
	public static BoxOffice getInstance(){
		if(instance == null)
			instance = new BoxOffice();
		return instance;
	}
	
	public boolean hasPassenger(){
		if(waitingPassengers.isEmpty() && availiableServers == 3){
			return false;
		}
		return true;
	}
	public void enqueuePassenger(Passenger p){
		waitingPassengers.add(p);
	}
	
	
	public Passenger dequeue(){
		if(waitingPassengers.isEmpty())
			return null;
		Passenger p = waitingPassengers.get(0);
		waitingPassengers.remove(0);
		return p;
	}
	
}
