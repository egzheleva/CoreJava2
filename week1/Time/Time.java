package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	private int day;
	private int month;
	private int year;

	
	public Time(int hours, int minutes, int seconds, int day, int month, int year) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public String toString() {
		return String.format("%d:%d:%d  %d.%d.%d", getHours(), getMinutes(), getSeconds(), getDay(), getMonth(), getYear());

	}
	public int getDay() {
		return day;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getMonth() {
		return month;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		if (month != 2 && day >= 1 && day <= 31) {
			this.day = day;
		}

		if (month == 2 && day >= 1 && day <= 29) {
			this.day = day;
		}

	}
	
	public void setHours(int hours) {
		if(hours >= 1 && hours <= 24) {
			this.hours = hours;
		}
	}
	
	public void setMinutes(int minutes) {
		if(minutes >= 1 && minutes <= 60) {
			this.minutes = minutes;
		}
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public void setSeconds(int seconds) {
		if(seconds >= 1 && seconds <= 60) {
			this.seconds = seconds;
		}
	}
	
	public void now() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
	
	public static void main(String args[]) {
		
		Time time = new Time(18, 52, 32, 28, 3, 2015);
		System.out.println(time);
		time.now();
	}
}
