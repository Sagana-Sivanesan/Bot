package bot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Output {
	static Scanner scan = new Scanner(System.in);
	static String nameRobot, typeRobot;
	static Integer typeRobotNum, numOption, total;
	static HashMap<String, String> listOfRobots = new HashMap<String, String>();
	static List<Integer> listOfTasks = new ArrayList<Integer>();
	static Integer[] arr;
	static Integer b = 0;
	static Integer c = 1;
	
	public static void main(String[] args) {
		Integer option;
		Boolean exit = false;
		
		System.out.println("Welcome to BOT-O-MAT!");
		System.out.println("----------------");
		System.out.println("Main Menu: ");
		
		// Create Robot w/ name and type
		while (exit == false) {
		option = mainMenu();
		if (option == 1) {
			System.out.println("Enter Robot's Name: ");
			nameRobot = scan.next();
			System.out.println("Enter Number of Robot's Type (1: Unipedal, 2: Bipedal, 3: Quadrupedal, 4: Arachnid, 5: Radial, 6: Aeronautical): ");
			typeRobotNum = scan.nextInt();
			switch(typeRobotNum) {
			case 1:
				typeRobot = "Unipedal";
				break;
			case 2:
				typeRobot = "Bipedal";
				break;
			case 3:
				typeRobot = "Quadrupedal";
				break;
			case 4:
				typeRobot = "Arachnid";
				break;
			case 5:
				typeRobot = "Radial";
				break;
			case 6:
				typeRobot = "Aeronautical";
				break;
			}
			
			// Add Robot into list and assign five random tasks
			listOfRobots.put(nameRobot, typeRobot);
			System.out.println(nameRobot + " with type " + typeRobot + " is ADDED to the List of Robots");
			System.out.println("----------------");
			System.out.println(nameRobot + " is ASSIGNED five tasks to complete in a duration of time.");
			System.out.println("----------------");
			for (int i=1; i<=10; i++) {
				listOfTasks.add(i);
			}
			for (int s=0; s<5; s++) {
				Collections.shuffle(listOfTasks);
					if (listOfTasks.get(b) == listOfTasks.get(c)) {
						listOfTasks.remove(b);
						b++;
						c++;
					}
				}
			for (int k=0; k<5; k++) {
				switch(listOfTasks.get(k)) {
				case 1:
					System.out.println(nameRobot + " was assigned to do the dishes.");
					dishes(1000);
					System.out.println(nameRobot + " finished cleaning the dishes!");
					System.out.println("----------------");
					break;
				case 2:
					System.out.println(nameRobot + " was assigned to do sweep the house.");
					sweep(3000);
					System.out.println(nameRobot + " finished sweeping the house!");
					System.out.println("----------------");
					break;
				case 3:
					System.out.println(nameRobot + " was assigned to do the laundry.");
					laundry(10000);
					System.out.println(nameRobot + " finished doing the laundry!");
					System.out.println("----------------");
					break;
				case 4:
					System.out.println(nameRobot + " was assigned take out the recycling");
					recycle(4000);
					System.out.println(nameRobot + " finished taking out the recycling!");
					System.out.println("----------------");
					break;
				case 5:
					System.out.println(nameRobot + " was assigned to make a sammich.");
					sammich(7000);
					System.out.println(nameRobot + " finished making a sammich!");
					System.out.println("----------------");
					break;
				case 6:
					System.out.println(nameRobot + " was assigned to mow the lawn.");
					mow(20000);
					System.out.println(nameRobot + " finished mowing the lawn!");
					System.out.println("----------------");
					break;
				case 7:
					System.out.println(nameRobot + " was assigned to rake the leaves.");
					rake(18000);
					System.out.println(nameRobot + " finished raking the leaves!");
					System.out.println("----------------");
					break;
				case 8:
					System.out.println(nameRobot + " was assigned to give the dog a bath.");
					dog(14500);
					System.out.println(nameRobot + " finished give the dog a bath!");
					System.out.println("----------------");
					break;
				case 9:
					System.out.println(nameRobot + " was assigned to bake some cookies.");
					bake(8000);
					System.out.println(nameRobot + " finished baking some cookies!");
					System.out.println("----------------");
					break;
				case 10:
					System.out.println(nameRobot + " was assigned to wash the car.");
					wash(20000);
					System.out.println(nameRobot + " finished washing the car!");
					System.out.println("----------------");
					break;
				}
			}
		}
		
		if (option == 2) {
			System.out.println(listOfRobots);
			} 
	
		if (option == 3) {
			System.out.println("Program Ended");
			exit = true;
			}
		}
	}
	
	// Methods()
	public static Integer mainMenu() {
		System.out.println("----------------");
		System.out.println("1: Create Robot");
		System.out.println("2: List of Robots");
		System.out.println("3: Terminate Program");
		System.out.println("----------------");

		System.out.println("Select a Number from Main Menu: ");
		
		Integer option = scan.nextInt();
		return option;
	}
	
	private static void wash(int millis) {
		System.out.println(nameRobot + " is washing the car...");	
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void bake(int millis) {
		System.out.println(nameRobot + " is baking some cookies...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void dog(int millis) {
		System.out.println(nameRobot + " is giving the dog a bath...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void rake(int millis) {
		System.out.println(nameRobot + " is raking the lawn...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void mow(int millis) {
		System.out.println(nameRobot + " is mowing the lawn...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void sammich(int millis) {
		System.out.println(nameRobot + " is making a sammich...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void recycle(int millis) {
		System.out.println(nameRobot + " is taking out the recycling...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void laundry(int millis) {
		System.out.println(nameRobot + " is doing the laundry...");	
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void sweep(int millis) {
		System.out.println(nameRobot + " is sweeping the house...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void dishes(int millis) {
		System.out.println(nameRobot + " is doing the dishes...");
		try {
			Thread.sleep(millis);
			System.out.println(millis + " milliseconds passed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
