package potluck.domain;

import java.util.Scanner;
/**
 * Implementation of the launcher .
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 
 * @see java.util.Scanner
 * @since 1.8.0_73
 */

public class PotLuckLauncher {
	/**
	 * main method, show login menu for the system
	 * @param args the value of parameter
	 */
	public static void main(String[] args) {
		PotLuckLauncher launcher = new PotLuckLauncher();
		Scanner input = new Scanner(System.in);
		boolean login = false;
		do {
			
			System.out.println("User Name: potluck");
			//String userName = input.next();
			System.out.println("Password: ****");
			//String password = input.next();
			String userName ="potluck";
			String password="1234";
			Member member = MemberBuilder.create().username(userName).password(password).buildNormalUser();
			if (member.confirmMember()) {
				PotLuckDatabase.getInstance().setCurrentMember(member);
				login = true;
				System.out.println("You login as a normal member");
				launcher.showMainMenu();
				
			} else {
				login=false;
				System.out.println("your username or password is not correct, plese login again.");

			}
		} while (!login);
	}

	/**
	 * show the main menu 
	 */
	public void showMainMenu() {
		int menu;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"Please choose an option:\n 1. Member; 2. Recipe; 3. Tag; 4. Category; 5. Comment ; 0 quit\n");
			// System.out
			// .println("Please choose an option:\n 2. Recipe; 0 quit\n");

			menu = input.nextInt();
			switch (menu) {
			case 1:
				//
				// MemberView memberView=new MemberView();
				break;
			case 2:
				RecipeView recipeView = new RecipeView();

				break;
			case 3:
				// TagView tagView=new TagView();
				break;
			case 4:
				// CategoryView categoryView=new CategoryView();
				//
				break;
			case 5:
				// CommentView commentView=new CommentView();

				break;
			case 0:
				break;
			default:
				break;

			}
		} while (menu != 0);
	}

}
