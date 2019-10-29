package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskMangerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userQuest =0;
		//String addTask;
		ArrayList<String> taskList = new ArrayList<>();
		taskList.add("1st goal");
		
		
		while (userQuest != 5) {
			
			System.out.println("Please choose one of the following numerical options: ");
			System.out.println(" 1. List Task: \n 2. Add Task \n 3. Delete Task \n 4. Mark Task Complete \n 5. Quit");
			userQuest = scan.nextInt();

			switch (userQuest) {
			
			case 1:
				System.out.println(taskList);
				
				break;

			

			case 2:
				System.out.println("What task would you like to add?");
				String addTask = scan.nextLine();
				taskList.add(addTask);
				
				
				break;
				   
			case 3:
				System.out.println(taskList);
				System.out.println("What task would you like to remove");
				int remIndex = scan.nextInt();
				taskList.remove(remIndex);
				
				break;

			case 4:
				System.out.println(taskList);
				System.out.println("Which task did you complete?");
				int comIndex = scan.nextInt();
				taskList.add(comIndex, "*");
				
				
				break;
				
				
				

			}

		}
scan.close();
		System.out.println("You Have Chosen To Exit This App.");
	}

}
