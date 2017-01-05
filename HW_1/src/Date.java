
public class Date {
	
	 int month;
	 int year; // Initialize variables
	 int day;
	
	void SetMonth(int month){this.month = month;}
	int GetMonth(){return month;}
	
	void SetYear(int year){this.year = year;} // Get and set functions
	int GetYear(){return year;}
	
	void SetDay(int day){this.day = day;}
	int GetDay(){return day;}
	
	public Date ()
	{
		month = 2;
		day = 15; // Constructor
		year = 2016;
	}
	
	public Date(int m, int d, int y)
	{
		m = month;
		d = day; // More specific constructor
		y = year;
	}
	
	String displayDate() 
	{
		String date = month + "/" + day + "/" + year;
		return date;
	}

}
