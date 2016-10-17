package cs356assignment1;

public class multChoiceQuestion implements Question {
	
	//fields
	boolean allowMultAns = false;
	private String question;
	private String[] answers;
	
	//methods
	@Override
	public boolean getAllowMultAns() {
		return allowMultAns;
	}
	
	@Override
	public void setAllowMultAns() {
		allowMultAns = true;
	}
	
	@Override
	public void resetAllowMultAns() {
		allowMultAns = false;
	}
	
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
