
import java.util.GregorianCalendar;

public class MyDate {
	private int year, day, month;
	
	MyDate(){
		GregorianCalendar calendar = new GregorianCalendar();;
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	MyDate(long timeElapsed) {
        setDate(timeElapsed);
    }
	
	MyDate(int year, int month, int day){
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	public void setYear(int year ) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMonth (int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setDate (long ellapsedTime) {
        GregorianCalendar calendar=  new GregorianCalendar();
        calendar.setTimeInMillis(ellapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH); 
    }
}

