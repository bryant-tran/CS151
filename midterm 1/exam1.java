package exam;

import java.util.Scanner;

/*
 * This is the tester class
 */
public class exam1 
{
	public static void main(String[] args)
	{
		/*
		 * uses scanner to take user input
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the TimeOfDay tester");
		
		/*
		 * takes inputs for hour, minute and seconds to make TimeOfDay
		 */
		System.out.println("Please enter the current hour between 0 and 23");
		int hour = in.nextInt();
		while(hour < 0 || hour > 23)
		{
			System.out.println("Invalid please enter a number between 0 and 23");
			hour = in.nextInt();
		}
		System.out.println("Please enter the current minutes between 0 and 60");
		int minute = in.nextInt();
		while(minute < 0 || minute > 60)
		{
			System.out.println("Invalid please enter a number between 0 and 60");
			minute = in.nextInt();
		}
		System.out.println("Please enter the current seconds between 0 and 60");
		int second = in.nextInt();
		while(second < 0 || second > 60)
		{
			System.out.println("Invalid please enter a number between 0 and 60");
			second = in.nextInt();
		}
		
		System.out.println("Creating TimeOfDay");
		TimeOfDay current = new TimeOfDay(hour, minute, second);
		System.out.println("Time is " + current.getTime());
		
		System.out.println("To add seconds type 'add'");
		System.out.println("To get seconds between this time and another time type 'between'");
		System.out.println("To exit type 'exit'");
		String input = in.next();
		
		
			if(input.equals("add"))
			{
				System.out.println("How many seconds would you like to add");
				int secondsToAdd = in.nextInt();
				current.addSeconds(secondsToAdd);
				System.out.println("New time is " + current.getTime());
				
				System.out.println("To add seconds type 'add'");
				System.out.println("To get seconds between this time and another time type 'between'");
				System.out.println("To exit type 'exit'");
				input = in.next();
			}
			if(input.equals("between"))
			{
				System.out.println("Please create the time class to get the number of seconds from");
				System.out.println("Please a hour between 0 and 23");
				int newHour = in.nextInt();
				while(newHour < 0 || newHour > 23)
				{
					System.out.println("Invalid please enter a number between 0 and 23");
					newHour = in.nextInt();
				}
				System.out.println("Please the minutes between 0 and 60");
				int newMinute = in.nextInt();
				while(newMinute < 0 || newMinute > 60)
				{
					System.out.println("Invalid please enter a number between 0 and 60");
					newMinute = in.nextInt();
				}
				System.out.println("Please enter the seconds between 0 and 60");
				int newSecond = in.nextInt();
				while(newSecond < 0 || newSecond > 60)
				{
					System.out.println("Invalid please enter a number between 0 and 60");
					newSecond = in.nextInt();
				}
				
				TimeOfDay newTime = new TimeOfDay(newHour, newMinute, newSecond);
				System.out.println("The time you entered is " + newTime.getTime());
				String difference = Integer.toString(current.secondsFrom(newTime));
				System.out.println("The number of seconds between " + current.getTime() + " and " 
						+ newTime.getTime() + " is " + difference);
				
				System.out.println("To add seconds type 'add'");
				System.out.println("To get seconds between this time and another time type 'between'");
				System.out.println("To exit type 'exit'");
				input = in.next();
			}
			if(input.equals("exit"))
			{
				System.out.println("GoodBye");
				in.close();
				return;
			}
			else
			{
				System.out.println("INVALID");
				System.out.println("To add seconds type 'add'");
				System.out.println("To get seconds between this time and another time type 'between'");
				System.out.println("To exit type 'exit'");
				input = in.next();
			}
		
		in.close();
	}
}
