package common.info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import common.Station.Passenger;

public class FileRW {
	static public void dataLoad(ArrayList<Passenger> passengers) throws IOException{

		int id;
		int arrival;
		int ticketingTime;
		String startPoint;
		String endPoint;
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader br = null;
		StringTokenizer st;
		String thisLine;
		
		try {
			fis = new FileInputStream(FileRW.class.getResource("").getPath() + "./passengerInfo.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
	        while ((thisLine = br.readLine()) != null) {
	            st = new StringTokenizer(thisLine);
	            id = Integer.parseInt(st.nextToken());
	            arrival = Integer.parseInt(st.nextToken());
	            ticketingTime = Integer.parseInt(st.nextToken());
	            startPoint = st.nextToken();
	            endPoint = st.nextToken();
	            //System.out.println(id + ", " + arrival + ", " + ticketingTime + ", " + startPoint + ", " + endPoint);
            	passengers.add(new Passenger(id, arrival, ticketingTime, startPoint, endPoint));
            	
	        }
		} catch (NumberFormatException | IOException e) {
			System.out.println("Cannot open file");
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
	
	static public void fileWrite(ArrayList<Passenger> passengers, String outputFileName) throws IOException{

		FileOutputStream fos;
		OutputStreamWriter osr;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream(FileRW.class.getResource("").getPath() + "/"+ outputFileName);
			osr = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osr);
			String strToWrite;
			int id;
			int ticketingWaitingTime;
			int ticketingStartTime;
			int trainWaitingTime;
			int destinationArrivalTime;
			int averageWaitingTime = 0;
			for(Passenger p : passengers){
				id = p.getId();
				ticketingWaitingTime = p.getTicketingWaitingTime();
				ticketingStartTime = p.getTicketingStartTime();
				trainWaitingTime = p.getTrainWaitingTime();
				destinationArrivalTime = p.getDestinationArrivalTime();
				strToWrite = "id:\t" + id +  ",\tticketingWaitingTime:\t" + ticketingWaitingTime + ",\tticketingStartTime:\t" 
				+ ticketingStartTime + ",\ttraingWaitingTime:\t" + trainWaitingTime + ",\tdestinationArrivalTime:\t" + destinationArrivalTime + "\n";
				bw.write(strToWrite);
				averageWaitingTime += ticketingWaitingTime;
			}
			System.out.println("average ticketing waiting time: " + averageWaitingTime/passengers.size());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Cannot open file");
			e.printStackTrace();
		} finally {
			bw.close();
		}
	}
}
