package potluck.domain;

import java.util.Scanner;

public class PortLuckLauncher {
	public static void main(String[] args) {
		PortLuckLauncher launcher = new PortLuckLauncher();
		Scanner input = new Scanner(System.in);
		System.out.println("User Name: ");
		String userName = input.next();
		System.out.println("Password: ");
		String password = input.next();
		Member member = new Member(userName, password);
		if (member.confirmMember()) {
			launcher.showMainMenu();
		}
	}

	public void showMainMenu() {
		System.out
				.println("Please choose an option:\n 1. Member; 2. Recipe; 3. Tag; 4. Category; 5. Comment ; 0 quit\n");
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		switch (menu) {
		case 1:
			
			MemberView memberView=new MemberView();
			break;
		case 2:
			RecipeView recipeView=new RecipeView();
			break;
		case 3:
			TagView tagView=new TagView();
			break;
		case 4:
			CategoryView categoryView=new CategoryView();

			break;
		case 5:
			CommentView commentView=new CommentView();

			break;
		case 0:
			break;
		default:
			break;

		}
	}
	

	

	

	
	
	
}
