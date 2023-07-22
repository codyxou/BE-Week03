package com.arrays;

import java.util.Scanner;
public class menuApp {
	
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] team = new String[5];
			
			int decision = 0;
			
			while (decision !=-1) {
				showMenu();
				decision = s.nextInt();
				
				if (decision < -1 || decision > 5 ) {
					System.out.println("Please pick a valid option");
					
				}else if(decision == 1) {
					showTeam(team);
					
				}else if (decision == 2) {
					showTeamMember(team);
				}else if (decision == 3) {
					
				}else if (decision == 4) {
					
				}else (decision == 5) {
					
				}
				
			}
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Members");
	}

}
