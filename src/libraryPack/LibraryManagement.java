package libraryPack;

import java.util.Scanner;

public class LibraryManagement {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("1. Add Book");
			System.out.println("2. View All Books");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Search Book By Title");
			System.out.println("6. exit");
			
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch (choice) {
			case 1:
				System.out.println("Enter the Book ID");
				String id = scanner.nextLine();
				
				System.out.println("Enter the Book Title");
				String title = scanner.nextLine();
				
				System.out.println("Enter the Book Author");
				String author = scanner.nextLine();
				
				library.addBook(new Book(id,title,author));

				break;
				
			case 2:
				library.displayBooks();
				break;
				
			case 3:
				System.out.println("Enter Book Id to issue");
				String issueId = scanner.nextLine();
				library.issueBook(issueId);		
				break;		
				
			case 4:
				System.out.println("Enter Book Id to Return");
				String returnId = scanner.nextLine();
				library.returnBook(returnId);		
				break;
				
			case 5:
				System.out.println("Enter Book Title to search");
				String searchTitle = scanner.nextLine();
				library.searchBookByTitle(searchTitle);	
				break;		
				
			case 6:
				exit = false;
				System.out.println("Exising the Library Application");
				break;		
				
				
			default:
				break;
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
