package exam;

public class TimeOfDay 
{
	/*
	 * Constructor to create a TimeOfDay class
	 * takes integers inHours, inMinutes, inSeconds
	 * and initializes them to the instance variables
	 */
	TimeOfDay(int inHours, int inMinutes, int inSeconds)
	{
		hours = inHours;
		minutes = inMinutes;
		seconds = inSeconds;
	}
	
	/*
	 * Accessor to get current hours
	 * Returns int hours
	 */
	public int getHours()
	{
		return hours;
	}
	
	/*
	 * Accessor to get current minutes
	 * Returns int minutes
	 */
	public int getMinutes()
	{
		return minutes;
	}
	
	/*
	 * Accessor to get current seconds
	 * Returns int seconds
	 */
	public int getSeconds()
	{
		return seconds;
	}
	
	/*
	 * Returns the Time in the format hours:minutes:seconds
	 */
	public String getTime()
	{
		return (getHours()+":"+getMinutes()+":"+getSeconds());
	}
	
	/*
	 * Adds a certain amount of seconds to the TimeOfDay
	 * converts seconds to minutes and minutes to hours when needed
	 * Returns a TimeOfDay with the added seconds
	 */
	public TimeOfDay addSeconds(int addSeconds)
	{
		seconds = seconds + addSeconds;
		minutes = minutes + (seconds/60);
		seconds = seconds % 60;
		hours = hours + (minutes/60);
		minutes = minutes % 60;
		hours = hours % 24;
		TimeOfDay result = new TimeOfDay(hours, minutes, seconds);
		return result;
	}
	
	/*
	 * Converts all of the hours and minutes into seconds
	 * Returns an int which is the total seconds of a TimeOfDay
	 */
	public int toSeconds()
	{
		return ((getHours() * 3600) + (getMinutes() * 60) + getSeconds());
	}
	
	/*
	 * Gets the number of seconds between two TImeOfDay
	 * Returns int the seconds in between
	 */
	public int secondsFrom(TimeOfDay other)
	{
		return Math.abs(other.toSeconds() - toSeconds());
	}
	
	private int hours;
	private int minutes;
	private int seconds;
}
