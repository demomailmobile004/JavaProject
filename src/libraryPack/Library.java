package libraryPack;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
	
	private Map<String, Book> books = new HashMap<>();
	
	public void gitMethod(){

}
	
	public void addBook(Book book) {
				
		books.put(book.getId(), book);
		System.out.println("Book added Successfully");
	}
	
	public void displayBooks() {
		
		for (Book book : books.values()) {
			System.out.println(book.getTitle());
		}
		
	}
	
	public void issueBook(String id) {
		
		Book book = books.get(id);
		
		if(book.isIssued()) {
			System.out.println("Book is already issued");
		}else {
			book.issue();
			System.out.println("Book issued successfully");
		}
		

	}

	public void returnBook(String id) {
		
		Book book = books.get(id);
		if(!book.isIssued()) {
			System.out.println("Book was not issued");
			
		}else {
			book.returnBook();
			System.out.println("Book returned successfully");
		}
		
	}
	
	
	public void searchBookByTitle(String title) {
		
		for (Book book : books.values()) {
			
			if(book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				System.out.println(" Book found");
				break;
			}else {
				System.out.println(" Book Not found");
			}
		}
			
	}
}
