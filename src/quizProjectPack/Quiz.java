package quizProjectPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	
	//Collection//5
	
	private List<Question> questionList = new ArrayList<>();
	//[0,1,2,3,4]
	
	public void loadQuestionsFromFile(String fileName) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		
		while((line = br.readLine())!=null) {
			
			String[] parts = line.split("\\|");	
			String questionsText = parts[0];
			String[] options = Arrays.copyOfRange(parts, 1, 5);
			int correctAnswer = Integer.parseInt(parts[5]);
			
			questionList.add(new Question(questionsText,options,correctAnswer));			
		}
		
	}
	
	public void start() {
		
		int score = 0;
		
		for(int i=0; i<questionList.size();i++) {
			
			Question q = questionList.get(i);
			System.out.println("\n"+q.getQuestionText());
			
			String[] options = q.getOptions();
			
			for(int j=0; j<options.length;j++) {
				
				System.out.println("\n"+options[j]);
			}
			
			
			int userAnswer = 0;
			
			System.out.println("\nEnter your Option");
			Scanner scanner = new Scanner(System.in);
			userAnswer = scanner.nextInt();
			
			if(q.getCorrectAnswer()==userAnswer) {
				
				System.out.println("Correct Answer");
				score++;
			}else {
				
				System.out.println("Wrong Answer");
			}
			
		}
		

		System.out.println("Your final score is "+score);
		
		
	}
	

}
