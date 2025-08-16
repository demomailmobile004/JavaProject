package quizProjectPack;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Quiz quiz = new Quiz();
		quiz.loadQuestionsFromFile("C:\\Users\\thang\\eclipse-workspace\\JavaMiniProject\\questions.txt");
		quiz.start();
	}
	
	

}
