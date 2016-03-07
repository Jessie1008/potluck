package potluck.domain;

import java.util.Scanner;

public class MemberView {
	public MemberView(){
		showMemberMenu();
		
	}
	private void showMemberMenu() {
		
		System.out.println(
				"Please choose an option:\n 1. Sign up; 2. Login; 3 Logout; 0 quit\n");
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		switch(menu){
		case 1:
			signup();
			break;
		case 2:
			login();
			break;
		case 3:
			logout();
			break;
			default:
				break;
			
			
		}
		
		
	}
	private void signup() {
		// TODO Auto-generated method stub
		
	}

	private void login() {
		// TODO Auto-generated method stub
		
	}
	private void logout() {
		// TODO Auto-generated method stub
		
	}
	
}
