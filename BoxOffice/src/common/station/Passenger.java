package common.station;


public class Passenger {
	private int id;
	private int officeArrivalTime;
	private int ticketingWaitingTime;
	private int ticketingTime;
	private int ticketingStartTime;
	private int trainWaitingTime;
	private int destinationArrivalTime;
	private String startPoint;
	private String endPoint;
	
	public Passenger(int id, int arrivalTime, int ticketingTime,String startPoint, String endPoint){
		this.id = id;
		this.officeArrivalTime = arrivalTime;
		this.ticketingTime = ticketingTime;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public void upTicketingWaitingTime(){
		ticketingWaitingTime++;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOfficeArrivalTime() {
		return officeArrivalTime;
	}
	
	public int getTicketingWaitingTime() {
		return ticketingWaitingTime;
	}
	public void setTicketingWaitingTime(int ticketingWaitingTime) {
		this.ticketingWaitingTime = ticketingWaitingTime;
	}
	public int getTicketingTime() {
		return ticketingTime;
	}
	
	public int getTrainWaitingTime() {
		return trainWaitingTime;
	}
	public void setTrainWaitingTime(int trainWaitingTime) {
		this.trainWaitingTime = trainWaitingTime;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}

	public int getDestinationArrivalTime() {
		return destinationArrivalTime;
	}

	public void setDestinationArrivalTime(int destinationArrivalTime) {
		this.destinationArrivalTime = destinationArrivalTime;
	}

	public int getTicketingStartTime() {
		return ticketingStartTime;
	}

	public void setTicketingStartTime(int ticketingStartTime) {
		this.ticketingStartTime = ticketingStartTime;
	}
	
	
}