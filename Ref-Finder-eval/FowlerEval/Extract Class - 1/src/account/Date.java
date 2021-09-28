package account;

public class Date {
	
	int _year;
	int _month;
	int _day;
	
	Date(int year, int month, int day){
		_year = year;
		_month = month;
		_day = day;
	}
	
	public int getYear(){
		return _year;
	}
	
	public int getMonth(){
		return _month;
	}
	
	public int getDay(){
		return _day;
	}
}
