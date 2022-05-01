//-------------------------------------------------------
// Assignment 2, Question 2
// Written by Ann-Marie Czuboka (40209452)
// For COMP 248 Section (R) – Fall 2021
// Due date: October 18th by 11:59pm
//--------------------------------------------------------

/* I will create a code that will book a Covid-19 vaccine 
   appointment based on the users choices */

//--------------------------------------------------------

// I will import scanner (class)
import java.util.Scanner;

public class Question2

{
	public static void main (String []args)
	
	{
		// I will do the welcome banner
				System.out.println ("+++++++++++++++++++++++++++++++++++++++++");
				System.out.println("    Welcome to Concordia University");
				System.out.println ("+++++++++++++++++++++++++++++++++++++++++");
				
		// I will display the Covid-19 vaccine menu	
				System.out.println("Here is the Covid-19 vaccine menu:");
				System.out.println("    1. Pfizer");
				System.out.println("    2. Moderna");
				System.out.println("    3. AstraZeneca");
				System.out.println("    4. Johnson&Johnson");
				System.out.println("    5. Sinovac");
				System.out.println("    6. Gamaleya");
				System.out.println("    7. Exit");
				System.out.println ("+++++++++++++++++++++++++++++++++++++++++");
				System.out.println();
				
		// Identifying strings
				   String location, time, shot = null, answer= "";
					   
		// Identifying integers
				   int value; //value is the number associated with the Vaccine in the menu
				   
	    // I will make the scanner
				   Scanner in = new Scanner(System.in);
			
		do 
			
		{
		// I will ask them to enter their choice
				 System.out.print("Please enter your choice (1-7): ");
				 value = in.nextInt();
				 in.nextLine();

	    // Output an answer based on their choice (1-7)
				 
		//Strings for my if statements
				String ordinal=null, spot=null, heure=null;
				
		switch (value)
		{
		
		//output if user chose choice 1 = Pfizer
		case 1:
			{
			//Displaying which choice user chose and asking which location they want
			System.out.println("Your choice is: Pfizer.");
			System.out.println();
			System.out.println("Please choose the location of your vaccine Pfizer:");
			System.out.println("        1- Pharmaprix");
			System.out.println("        2- Jean Coutu");
			System.out.print("Please enter your choice: ");
			location = in.nextLine();
			System.out.println();
			
			//output based on which location the user enters
			if (location.equals("1") || location.equals("2"))
				{
				System.out.println("Please choose the time slots :");
				System.out.println("1 - 2:00 - 2:15" );
				System.out.println("2 - 2:20 - 2:35");
				System.out.println("3 - 2:40 - 2:55");
				System.out.println("4 - 3:00 - 3:15");
				System.out.println("5 - quit");
				System.out.print("Please enter your choice (1-5): ");
				time = in.nextLine();
				
				//output based on which time the user enters
				if (time.equals("1") || time.equals("2") || time.equals("3") || time.equals("4"))
				{	
					//Asking user to enter if 1st or 2nd shot
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
					shot = in.nextLine();
					System.out.println();
				
				//output based on which shot the user enters
				if (shot.equals("1") || shot.equals("2"))
					
					{if (shot.equals("1"))
						ordinal = "st";
					
					if (shot.equals("2"))
						ordinal = "nd";
					
					if (location.equals("1"))
						spot = "Pharmaprix";
					
					if (location.equals("2"))
						spot = "Jean Coutu";
					
					if (time.equals("1"))
						heure = "2:00 - 2:15";
					
					if (time.equals("2"))
						heure = "2:20 - 2:35";
					
					if (time.equals("3"))
						heure = "2:40 - 2:55";
					
					if (time.equals("4"))
						heure = "3:00 - 3:15";}
				
					//output based on if shot was entered badly
					else
					{System.out.println("That is the wrong input. Please try again!");
					answer="yes";
					break;}
					
					//Confirming their appointment (vaccine, time, location, shot)
					{System.out.println("Your booked appointment is: Pfizer, " + shot + ordinal + " dose.");
					System.out.println("Your schedule is: " + heure +  " @" + spot + ".");
					System.out.println();
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");}
					
					answer="no";
					break;
				}
				
				//output if user entered 5 (quit)
				if (time.equals("5"))
				{
					System.out.println();
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					answer = in.nextLine();
					System.out.println();
					
					if (answer.equals("no"))//user wants to quit
						System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
					    
					if (answer.equals("yes"))//user wants to retry booking	
						
				
				break; 
				}
				//output based on if time was entered badly
				else
				{System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;}	
				}
			
			//output if user enters location badly
			else
				System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;
			}
		
		//output if user chose choice 2 = Moderna
		case 2:
		{
		//Displaying which choice user chose and asking which location they want
		System.out.println("Your choice is: Moderna.");
		System.out.println();
		System.out.println("Please choose the location of your vaccine Moderna:");
		System.out.println("        1- Pharmaprix");
		System.out.println("        3- Uniprix Clinique");
		System.out.println("        4- Health Center");
		System.out.print("Please enter your choice: ");
		location = in.nextLine();
		System.out.println();
		
		//output based on which location the user enters
		if (location.equals("1") || location.equals("3") || location.equals("4"))
			{
			System.out.println("Please choose the time slots :");
			System.out.println("1 - 2:00 - 2:15" );
			System.out.println("2 - 2:20 - 2:35");
			System.out.println("3 - 2:40 - 2:55");
			System.out.println("4 - 3:00 - 3:15");
			System.out.println("5 - quit");
			System.out.print("Please enter your choice (1-5): ");
			time = in.nextLine();
			
			//output based on which time the user enters
			if (time.equals("1") || time.equals("2") || time.equals("3") || time.equals("4"))
			{	
				//Asking user to enter if 1st or 2nd shot
				System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				shot = in.nextLine();
				System.out.println();
			
			//output based on which shot the user enters
			if (shot.equals("1") || shot.equals("2"))
				
				{if (shot.equals("1"))
					ordinal = "st";
				
				if (shot.equals("2"))
					ordinal = "nd";
				
				if (location.equals("1"))
					spot = "Pharmaprix";
				
				if (location.equals("3"))
					spot = "Uniprix Clinique";
				
				if (location.equals("4"))
					spot = "Health Center";
				
				if (time.equals("1"))
					heure = "2:00 - 2:15";
				
				if (time.equals("2"))
					heure = "2:20 - 2:35";
				
				if (time.equals("3"))
					heure = "2:40 - 2:55";
				
				if (time.equals("4"))
					heure = "3:00 - 3:15";}
				
				//output based on if shot was entered badly
				else
				{System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;}
				
				//Confirming their appointment (vaccine, time, location, shot)
				{System.out.println("Your booked appointment is: Moderna, " + shot + ordinal + " dose.");
				System.out.println("Your schedule is: " + heure +  " @ " + spot + ".");
				System.out.println();
				System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");}
				
				answer="no";
				break;
			}
			
			//Output if user enters 5 (quit)
			if (time.equals("5"))
			{
				System.out.println();
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				answer = in.nextLine();
				System.out.println();
				
				if (answer.equals("no"))//user wants to quit
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
				    
				if (answer.equals("yes"))//user wants to retry booking	
					
			
			break; 
			}
			//output based on if time was entered badly
			else
			{System.out.println("That is the wrong input. Please try again!");
			answer="yes";
			break;}	
			}
		
		//output based on if location was entered badly
		else
			System.out.println("That is the wrong input. Please try again!");
			answer="yes";
			break;
		}
		
		//output if user chose choice 3 = AstraZeneca
		case 3:
		{
		//Displaying which choice user chose and asking which location they want
		System.out.println("Your choice is: AstraZeneca.");
		System.out.println();
		System.out.println("Please choose the location of your vaccine  AstraZeneca:");
		System.out.println("        2- Jean Coutu");
		System.out.println("        3- Uniprix Clinique");
		System.out.print("Please enter your choice: ");
		location = in.nextLine();
		System.out.println();
		
		//output based on which location the user enters
		if (location.equals("2") || location.equals("3"))
			{
			System.out.println("Please choose the time slots :");
			System.out.println("1 - 2:00 - 2:15" );
			System.out.println("2 - 2:20 - 2:35");
			System.out.println("3 - 2:40 - 2:55");
			System.out.println("4 - 3:00 - 3:15");
			System.out.println("5 - quit");
			System.out.print("Please enter your choice (1-5): ");
			time = in.nextLine();
			
			//output based on which time the user enters
			if (time.equals("1") || time.equals("2") || time.equals("3") || time.equals("4"))
			{	
				//Asking user to enter if 1st or 2nd shot
				System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				shot = in.nextLine();
				System.out.println();
			
			//output based on which shot the user enters
			if (shot.equals("1") || shot.equals("2"))
				
				{if (shot.equals("1"))
					ordinal = "st";
				
				if (shot.equals("2"))
					ordinal = "nd";
				
				if (location.equals("2"))
					spot = "Jean Coutu";
				
				if (location.equals("3"))
					spot = "Uniprix Clinique";
				
				if (time.equals("1"))
					heure = "2:00 - 2:15";
				
				if (time.equals("2"))
					heure = "2:20 - 2:35";
				
				if (time.equals("3"))
					heure = "2:40 - 2:55";
				
				if (time.equals("4"))
					heure = "3:00 - 3:15";}
			
				//output based on if shot was entered badly
				else
				{System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;}
				
				//Confirming their appointment (vaccine, time, location, shot)
				{System.out.println("Your booked appointment is: AstraZeneca, " + shot + ordinal + " dose.");
				System.out.println("Your schedule is: " + heure +  " @ " + spot + ".");
				System.out.println();
				System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");}
				
				answer="no";
				break;
			}
			
			//Output if user enters 5 (quit)
			if (time.equals("5"))
			{
				System.out.println();
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				answer = in.nextLine();
				System.out.println();
				
				if (answer.equals("no"))//user wants to quit
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
				    
				if (answer.equals("yes"))//user wants to retry booking
					
			
			break; 
			}
			//output based on if time was entered badly
			else
			{System.out.println("That is the wrong input. Please try again!");
			answer="yes";
			break;}	
			}
		//output based on if location was entered badly
		else
			{System.out.println("That is the wrong input. Please try again!");
			answer="yes";
			break;}
		}
		
		//output if user chose choice 4 = Johnson & Johnson
		case 4:
			{
			//Displaying which choice user chose and asking which location they want
			System.out.println("Your choice is: Johnson & Johnson.");
			System.out.println();
			System.out.println("Please choose the location of your vaccine Johnson & Johnson:");				
			System.out.println("        4- Health Center");
			System.out.print("Please enter your choice: ");
			location = in.nextLine();
			System.out.println();
			
			//output based on which location the user enters
			if (location.equals("4"))
				{
				System.out.println("Please choose the time slots :");
				System.out.println("1 - 2:00 - 2:15" );
				System.out.println("2 - 2:20 - 2:35");
				System.out.println("3 - 2:40 - 2:55");
				System.out.println("4 - 3:00 - 3:15");
				System.out.println("5 - quit");
				System.out.print("Please enter your choice (1-5): ");
				time = in.nextLine();
				
				//output based on which time the user enters
				if (time.equals("1") || time.equals("2") || time.equals("3") || time.equals("4"))
				{	
					//Asking user to enter if 1st or 2nd shot		
					System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
					shot = in.nextLine();
					System.out.println();
				
				//output based on which shot the user enters
				if (shot.equals("1") || shot.equals("2"))
							
					{if (shot.equals("1"))
						ordinal = "st";
							
					if (shot.equals("2"))
						ordinal = "nd";
							
					if (location.equals("4"))
						spot = "Health Center";
							
					if (time.equals("1"))
						heure = "2:00 - 2:15";
							
					if (time.equals("2"))
						heure = "2:20 - 2:35";
							
					if (time.equals("3"))
						heure = "2:40 - 2:55";
						
					if (time.equals("4"))
						heure = "3:00 - 3:15";}
				
					//output based on if shot was entered badly
					else
					{System.out.println("That is the wrong input. Please try again!");
					answer="yes";
					break;}
					
					//Confirming their appointment (vaccine, time, location, shot)
					{System.out.println("Your booked appointment is: Johnson & Johnson, " + shot + ordinal + " dose.");
					System.out.println("Your schedule is: " + heure +  " @ " + spot + ".");
					System.out.println();
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");}
							
					answer="no";
					break;
				}
				
				//Output if user enters 5 (quit)
				if (time.equals("5"))
				{
					System.out.println();
					System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
					answer = in.nextLine();
					System.out.println();
							
					if (answer.equals("no"))//user wants to quit
						System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
							    
					if (answer.equals("yes"))//user wants to retry booking
								
						
				break; 
				}
				//output based on if time was entered badly
				else
				{System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;}	
				}
			
			//output based on if location was entered badly
			else
				System.out.println("That is the wrong input. Please try again!");
				answer="yes";
				break;
			}
			
		
			//output if user chose choice 5 = Sinovax
			case 5:
				{
				//Displaying which choice user chose and asking if user would like to retry booking
				System.out.println("Sorry, Sinovac is not available now!");
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				answer = in.nextLine();
				System.out.println();
						
				if (answer.equals("no"))//user does not want to retry booking
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
							
							
				if (answer.equals("yes"))//user wants to retry booking
					System.out.println();
					break;
				}
						
			//output if user chose choice 6 = Gamaleya		
			case 6:
				{//Displaying which choice user chose and asking if user would like to retry booking
				System.out.println("Sorry, Gamaleya is not available now!");
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				answer = in.nextLine();
				System.out.println();
						
				if (answer.equals("no"))//user does not want to retry booking
					System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
						
				if (answer.equals("yes"))//user wants to retry booking
					System.out.println();
					break;
				}
					
			//output if user chose choice 7 = Exit
			case 7:
				{//Displaying which choice user chose and asking if user would like to retry booking
				System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
				answer = in.nextLine();
				System.out.println();
						
				if (answer.equals("no"))//user does not want to retry booking
					{System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
					 break;}
						
				if (answer.equals("yes"))//user wants to retry booking
					break;
				
				}
				
			//output if user enters anything than (1-7)
			default:
			{System.out.println();
			System.out.println("That is the wrong input. Please try again!");
			answer="yes";}
			
		}//ending the switch loop
		
		}//ending the do loop
		
		while (answer.equals("yes"));//loop will redo if user enters "yes" to retry booking
		
		
	}
}
					
					
			