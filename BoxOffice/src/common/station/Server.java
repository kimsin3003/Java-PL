package common.station;


public class Server{
	
	private Passenger myPassenger = null;
	private int leftTime;
	
	public int getLeftTime(){
		return leftTime;
	}
	
	public void downLeftTime(){
		leftTime--;
	}

	public Passenger getMyPassenger() {
		return myPassenger;
	}

	public void setMyPassenger(Passenger myPassenger) {
		this.myPassenger = myPassenger;
		if(myPassenger != null)
			this.leftTime = myPassenger.getTicketingTime();
		
	}
	
	
	
	
}
