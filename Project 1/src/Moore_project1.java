// Zachary Moore
// n01581640
// <date of submission>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Moore_project1 {
	
	public static int countCandy(String[] list) 
	{
		String[] specialList = list.clone();
		int counter = 0;
		for (int i = 0; i < specialList.length; i++) 
		{
			specialList[i] = specialList[i].toLowerCase();
		}
		
		for (int i = 0; i < specialList.length; i++) 
		{
			if (specialList[i].contains("candy"))
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static ArrayList<String> getOneWordFoodItems(String[] list)
	{
		ArrayList<String> oneWordItems = new ArrayList<String>();
		
		for (int i = 0; i < list.length; i++) 
		{
			if (!list[i].contains(" "))
			{
				oneWordItems.add(list[i]);
			}
		}
		
		return oneWordItems;
	}
	
	public static ArrayList<String> getMultiWordFoodItems(String[] list)
	{
		ArrayList<String> multiWordItems = new ArrayList<String>();
		
		for (int i = 0; i < list.length; i++) 
		{
			if (list[i].contains(" "))
			{
				multiWordItems.add(list[i]);
			}
		}
		
		return multiWordItems;
	}
	
	public static ArrayList<String> getUniqueFoodItems(String[] list)
	{

		ArrayList<String> uniqueItems = new ArrayList<String>();
		for (int i = 0; i < list.length; i++) 
		{
			boolean isUnique = true;
			for (int j = 0; j < list.length; j++) 
			{

				if(list[i].equalsIgnoreCase(list[j]) && i != j)
				{
					j = 0;
					isUnique = false;
					break;
					
				}
			}
			if(isUnique == true)
			{
				uniqueItems.add(list[i]);
				
			}
			
		}
		return uniqueItems;
	} 
	
	public static ArrayList<String> getNonUniqueFoodItems(String[] list)
	{
		ArrayList<String> nonUniqueItems = new ArrayList<String>();
		for (int i = 0; i < list.length; i++) 
		{
			for (int j = 0; j < list.length; j++) 
			{
				if(list[i].equalsIgnoreCase(list[j]) && i != j)
				{
					j = 0;
					nonUniqueItems.add(list[i]);
					break;
				}
			}
			
		}
		return nonUniqueItems;
	}
	
	public static String getMostFrequentFoodItem(String[] list)
	{
		String mostFrequent = "";
		//loop through the list
		//check for 
		
		return mostFrequent;
	} //not done
	
	public static String getLeastFrequentFoodItem(String[] list)
	{
		//TODO: complete method
		return null;
	} //not done
	
	public static int countMustardsInList(String[] list)
	{
		int mustards = 0;
		for (int i = 0; i < list.length; i++) 
		{
			
		}
		return 0;
	} //not done
	
	public static String[] getNewList(Scanner scn)
	{
		String list = "";
		while (list.equals(""))
		{
			list = scn.nextLine();
		}
		String[] listFinished = list.split(", ");
		return listFinished;
	}
	
	public static void printMenu()
	{
		System.out.println("What do you want to do?");
		System.out.println("1 = Count Candy");
		System.out.println("2 = Get One Word Food Items");
		System.out.println("3 = Get Multi-Word Food Items");
		System.out.println("4 = Get Unique Food Items");
		System.out.println("5 = Get Non-Unique Food Items");
		System.out.println("6 = Get Most Frequent Food Item");
		System.out.println("7 = Get Least Frequent Food Item");
		System.out.println("8 = Count Mustards");
		System.out.println("9 = Enter New List");
		System.out.println("0 = Quit");
	}
		
	public static void main(String[] args) {
		//TODO: complete method
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter list of food items: ");
		String foodItems[] = getNewList(scn);
		printMenu();
		int choice = scn.nextInt();
		
		while(choice != 0)
		{
		
			if (choice == 1)
			{
				System.out.println("Number of Candy: " + countCandy(foodItems));
				printMenu();
				choice = scn.nextInt();
			}
			else if (choice == 2)
			{
				ArrayList<String> finalFoodItems = getOneWordFoodItems(foodItems);
				for (int i = 0; i < finalFoodItems.size(); i++) 
				{
					System.out.println(finalFoodItems.get(i));
				}
				printMenu();
				choice = scn.nextInt();
				
			}
			else if (choice == 3)
			{
				ArrayList<String> finalFoodItems = getMultiWordFoodItems(foodItems);
				for (int i = 0; i < finalFoodItems.size(); i++) 
				{
					System.out.println(finalFoodItems.get(i));
				}
				printMenu();
				choice = scn.nextInt();
				
			}
			else if (choice == 4)
			{
				ArrayList<String> uniqueFoodItems = getUniqueFoodItems(foodItems);
				for (int i = 0; i < uniqueFoodItems.size(); i++) 
				{
					System.out.println(uniqueFoodItems.get(i).toLowerCase());
				}
				printMenu();
				choice = scn.nextInt();
			}
			else if (choice == 5)
			{
				ArrayList<String> nonUniqueFoodItems = getNonUniqueFoodItems(foodItems);
				for (int i = 0; i < nonUniqueFoodItems.size(); i++) 
				{
					System.out.println(nonUniqueFoodItems.get(i).toLowerCase());
				}
				printMenu();
				choice = scn.nextInt();
			}
			else if (choice == 9)
			{
				foodItems = getNewList(scn);
				printMenu();
				choice = scn.nextInt();
			}
			
			
		}

	}

}