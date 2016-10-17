package cs356assignment1;

public class binaryQuestion implements Question {
	
	//fields
	private final boolean ALLOWMULTANS = false; //multiple answer is never allowed in binary question
	private String question;
	private String[] answers;
	
	//methods
	@Override
	public boolean getAllowMultAns() {
		return ALLOWMULTANS;
	}
	
	@Override
	public void setAllowMultAns() {
		System.out.println("Error! Binary questions do not allow multiply answers.");
	}
	
	@Override
	public void resetAllowMultAns() {}
	
	@Override
	public String getQuestion() {
		return question;
	}
	
	@Override
	public void setQuestion(String s) {
		question = s;
	}
	
	@Override
	public void resetQuestion() {
		question = null;
	}
	
	@Override
	public String[] getAnswers() {
		return answers;
	}
	
	@Override
	public void setAnswers(String[] s) {
		answers = s;
	}
	
	@Override
	public void resetAnswers() {
		answers = null;
	}
	
}
