package cs356assignment1;
import java.util.ArrayList;

public interface IVote {
	
	public Question getQuestionData();
	public void setQuestionData(Question q);
	public void resetQuestionData();
	
	public void submission(Student student, ArrayList<Integer> answers);
	public void displayVote();
	
}
