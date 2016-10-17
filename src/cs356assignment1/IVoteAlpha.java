package cs356assignment1;
import java.util.ArrayList;
import java.util.Hashtable;

public class IVoteAlpha implements IVote {
	
	//fields
	Hashtable<Integer, ArrayList<Integer>> voteHistory = new Hashtable<Integer, ArrayList<Integer>>();
	private Question qdata; //storing Question object for this instance
	private int[] ansCount; //number of vote for each answer choice
	private int voteRevision = 0; //number of vote revision (or repeated vote)
	
	//methods
	@Override
	public Question getQuestionData() {
		return qdata;
	}
	
	@Override
	public void setQuestionData(Question q) {
		qdata = q;
		ansCount = new int[q.getAnswers().length];
	}
	
	@Override
	public void resetQuestionData(){
		qdata = null;
	}
	
	@Override
	public void submission(Student student, ArrayList<Integer> answers) {
		//if hashtable already contains key, subtract the vote(s) from previous key and remove from hashtable
		if(voteHistory.containsKey(student.getStudentID())) {
			//System.out.println("repeat found"); //debug code
			for (int i = 0; i < voteHistory.get(student.getStudentID()).size(); i++) {
				ansCount[voteHistory.get(student.getStudentID()).get(i)] --;
			}
			voteHistory.remove(student.getStudentID());
			voteRevision++; //voteRevision count triggered here
		}
		//counts the vote and stores the student and the vote(s) into hashtable
		for (int i = 0; i < answers.size(); i++) {
			ansCount[answers.get(i)] ++;
		}
		voteHistory.put(student.getStudentID(), answers);
	}

	@Override
	public void displayVote() {
		System.out.println(qdata.getQuestion());
		System.out.println();
		for (int i = 0; i < ansCount.length; i++) {
			System.out.println((i+1)+". "+qdata.getAnswers()[i]+": "+ansCount[i]+" votes");
		}
		System.out.println();
		System.out.println("Unique student vote count: "+voteHistory.size());
		System.out.println("Vote revision count: "+voteRevision);
	}
	
}
