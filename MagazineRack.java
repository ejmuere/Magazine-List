import java.util.Scanner;

//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

public class MagazineRack
{
	private static MagazineList rack = new MagazineList();
   //----------------------------------------------------------------
   //  Creates a MagazineList object, adds several magazines to the
   //  list, then prints it.
   //----------------------------------------------------------------
   public static void main (String[] args)
   {    
      
      
      rack.add (new Magazine("Time"));
      rack.add (new Magazine("Woodworking Today"));
      rack.add (new Magazine("Communications of the ACM"));
      rack.add (new Magazine("House and Garden"));
      rack.add (new Magazine("GQ"));
      
      System.out.println (rack); 
      Scanner scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0)
		{
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
   }
 

   public static void printMenu()
	{
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Add a Magazine to the front of the list");
		System.out.println("2: Add a Magazine to the end of the list");
		System.out.println("3: Remove a Magazine from the front of the list");
		System.out.println("4: Remove a Magazine from the end of the list");
		System.out.println("5: Print Magazines in the list");
		
				
				
		System.out.print("\nEnter your choice: ");
	}
   public static void dispatch(int choice)
	{
		String newMag;
		Scanner scan = new Scanner(System.in);
		switch(choice)
		{
		case 0:
			System.out.println("Bye!");
			break;
		case 1: //add to front
			System.out.println("Enter magazine to add to front");
			newMag = scan.nextLine();
			Magazine mag = new Magazine(newMag);
			rack.addToFront(mag);
			break;
		case 2: //add to end
			System.out.println("Enter magazine to add to end");
			newMag = scan.nextLine();
			Magazine mag1 = new Magazine(newMag);
			rack.addToEnd(mag1);
			break;
		case 3: //remove first element
			rack.removeFirst();
			break;
		case 4: //remove last element
			rack.removeLast();
			break;
		case 5: //shows magazine list
			System.out.println(rack);
			break;
	    default:
			System.out.println("Sorry, invalid choice");
		}
	}
}
