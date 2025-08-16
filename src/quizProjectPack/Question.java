package quizProjectPack;

public class Question {
	
	private String questionsText;
	private String[] options;
	private int correctAnswer;
	
	
	public Question(String questionsText, String[] options, int correctAnswer) {
		
		this.questionsText = questionsText;
		this.options = options;
		this.correctAnswer = correctAnswer;
		
	}
	
	
	public String getQuestionText() {
		
		return questionsText;		
	}
	
	public String[] getOptions() {
		return options;
	}
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	
	public boolean isCorrect(int userAnswer) {
		
		return userAnswer==correctAnswer;
	}
	

}
