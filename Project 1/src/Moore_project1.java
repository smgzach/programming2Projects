// Zachary Moore
// n01581640
// <date of submission>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Moore_project1 {
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an int describing the number of times the word "candy" appeared in the array
	 */
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
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an ArrayList of Strings containing the number of one word items in the array
	 */
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
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an ArrayList of Strings containing the number of multi word items in the array
	 */
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
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an ArrayList of Strings containing the items that appear only once in the array
	 */
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
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an ArrayList of Strings containing the items that appear multiple times in the array
	 */
	public static ArrayList<String> getNonUniqueFoodItems(String[] list)
	{
		ArrayList<String> nonUniqueItems = new ArrayList<String>();
		for (int i = 0; i < list.length; i++) 
		{
			for (int j = 0; j < list.length; j++) 
			{
				if(list[i].equalsIgnoreCase(list[j]) && i != j)
				{

					nonUniqueItems.add(list[i]);
					break;
				}
			}
			
		}
		
		for (int i = 0; i < nonUniqueItems.size(); i++) 
		{
			nonUniqueItems.set(i, nonUniqueItems.get(i).toLowerCase());
		}
		
		ArrayList<String> finalNonUniqueItems = new ArrayList<String>();
		for (int i = 0; i < nonUniqueItems.size(); i++)
		{
			if(!finalNonUniqueItems.contains(nonUniqueItems.get(i)))
			{
				finalNonUniqueItems.add(nonUniqueItems.get(i));
			}
		}

		return finalNonUniqueItems;
	}
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return a String describing the item that appears most frequently in the array
	 */
	public static String getMostFrequentFoodItem(String[] list)
	{
		String mostFrequent = "";
		int currentCounter = 0;
		int finalCounter = 0;
		//loop through the list
		//initialize currentCounter and finalCounter
		//loop through the list for each entry in the list
		//if the entries are equal to each other and not at the same index, add one to currentCounter
		//if currentCounter is larger than finalCounter, set finalCounter to currentCounter and set mostFrequent
		// to string at index i
		for (int i = 0; i < list.length; i++) 
		{
			currentCounter = 0;
			for (int j = 0; j < list.length; j++) 
			{

				if (list[i].equalsIgnoreCase(list[j]) && i != j)
				{
					currentCounter++;
				}
			}
			if(currentCounter >= finalCounter)
			{
				mostFrequent = list[i];
				finalCounter = currentCounter;
			}
		}
		
		return mostFrequent;
	}
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return a String describing the item that appears the least frequently in the array
	 */
	public static String getLeastFrequentFoodItem(String[] list)
	{
		String leastFrequent = "";
		int currentCounter = 0;
		int finalCounter = 0;
		//nested loop through the list to compare each item to each other item
		//if the entries are equal to each other, increase current counter by 1
		// 
		for (int i = 0; i < list.length; i++) 
		{
			currentCounter = 0;
			for (int j = 0; j < list.length; j++) 
			{

				if (list[i].equalsIgnoreCase(list[j]) && i != j)
				{
					currentCounter++;
				}
			}
			if(currentCounter >= finalCounter)
			{

				finalCounter = currentCounter;
			}
			if(currentCounter < finalCounter)
			{
				leastFrequent = list[i];

			}
		}
		
		
		return leastFrequent;
	} //not done
	
	/**
	 * 
	 * @param an array of Strings containing food items separated by ", "
	 * @return an integer describing the number of items in the l
	 */
	public static int countMustardsInList(String[] list)
	{
		String[] specialList = list.clone();
		int counter = 0;
		for (int i = 0; i < specialList.length; i++) 
		{
			specialList[i] = specialList[i].toLowerCase();
		}
		
		for (int i = 0; i < specialList.length; i++) 
		{
			if (specialList[i].contains("mustard") && !specialList[i].equals("mustard"))
			{
				counter++;
				System.out.println(specialList[i]);
			}
		}
		return counter;
	} //should be done but double confirm
	
	/**
	 * 
	 * @param a new Scanner object
	 * @return an array of Strings separated by ", " that was inputed by the user
	 */
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
					System.out.println(nonUniqueFoodItems.get(i));
				}
				printMenu();
				choice = scn.nextInt();
			}
			else if (choice == 6)
			{
				
				System.out.println(getMostFrequentFoodItem(foodItems).toLowerCase());
				printMenu();
				choice = scn.nextInt();
				
			}
			else if (choice == 7)
			{
				
				System.out.println(getLeastFrequentFoodItem(foodItems).toLowerCase());
				printMenu();
				choice = scn.nextInt();
				
			}
			else if (choice == 8)
			{
				countMustardsInList(foodItems);
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