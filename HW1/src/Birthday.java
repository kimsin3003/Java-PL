
public class Birthday {
	private int year;
	private int month;
	private int day;
	
	public Birthday(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isValid(){
		
		if(day > 31 || day < 1)
			return false;
		
		else{
			if(month == 4 || month == 6 || month == 9 || month == 11){
				if(day == 31)
					return false;
			}
			
			else if(month == 2){
				if(this.isLeapYear()){
					if(day > 28)
						return false;
				}
				else{
					if(day > 29)
						return false;
				}
			}
			
		}
		
		return true;
	}
	
	private boolean isLeapYear(){
		if(year % 400 == 0) return true;
		else if(year % 100 == 0) return false;
		else if(year % 4 == 0) return true;
		else return false;
	}
}
