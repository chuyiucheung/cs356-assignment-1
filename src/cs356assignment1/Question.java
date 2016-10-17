package cs356assignment1;


public interface Question {
	
	public boolean getAllowMultAns();
	public void setAllowMultAns();
	public void resetAllowMultAns();
	
	public String getQuestion();
	public void setQuestion(String s);
	public void resetQuestion();
	
	public String[] getAnswers();
	public void setAnswers(String[] s);
	public void resetAnswers();
	
}
