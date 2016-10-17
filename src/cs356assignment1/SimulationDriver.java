package cs356assignment1;
import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {
	
	public static void main(String args[]){
		
		/*
		 * Generating a sample multiple choice question with 4 answer choices,
		 * and multiple answers are accepted.
		 */
		Question questionA = new multChoiceQuestion();
		questionA.setQuestion("Which of the following pet(s) do you prefer?");
		String[] ansA = new String[4];
		ansA[0] = "Sabertooth";
		ansA[1] = "Mammoth";
		ansA[2] = "Megalodon";
		ansA[3] = "Unicorn";
		questionA.setAnswers(ansA);
		
		//Sending question information to IVoteAlpha
		IVote newVoteA = new IVoteAlpha();
		newVoteA.setQuestionData(questionA);
		
		//Randomizing 100 votes for Student with ID ranging from 100-150 (to ensure repeats)
		int voteCountA;
		Random randA = new Random();
		for (voteCountA = 0; voteCountA < 100; voteCountA++) {
			Student s = new Student(randA.nextInt(150 - 100 + 1) + 100);
			ArrayList<Integer> a = new ArrayList<Integer>();
			do {	
				for (int i = 0; i < ansA.length; i++) {

					int v = randA.nextInt(1 - 0 + 1);
					if (v == 1) {
						a.add(i);
					}
				}
			} while(a == null);
			//System.out.print((voteCount+1)+ ": student ID = "+s.getStudentID()); //debug code
			//System.out.println(" voted "+(a.get(0)+1)); //debug code
			newVoteA.submission(s, a);
		}
		
		//Displaying Result
		newVoteA.displayVote();
		System.out.println("****************************************************************");
		System.out.println("Total student vote count: " + voteCountA);
		
		/*
		 * Generating a sample binary question with 2 answer choices,
		 * and only 1 answer is accepted.
		 */
		Question questionB = new binaryQuestion();
		questionB.setQuestion("Who will you vote for on the upcoming presidential election?");
		String[] ansB = new String[2];
		ansB[0] = "Hillary Clinton";
		ansB[1] = "Donald Trump";
		questionB.setAnswers(ansB);
		
		//Sending question information to IVoteAlpha
		IVote newVoteB = new IVoteAlpha();
		newVoteB.setQuestionData(questionB);
		
		//Randomizing 100 votes for Student with ID ranging from 100-150 (to ensure repeats)
		int voteCountB;
		Random randB = new Random();
		for (voteCountB = 0; voteCountB < 100; voteCountB ++) {
			Student s = new Student(randB.nextInt(150 - 100 + 1) + 100);
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(randB.nextInt(ansB.length - 1 + 1));
			//System.out.print((voteCount+1)+ ": student ID = "+s.getStudentID()); //debug code
			//System.out.println(" voted "+(a.get(0)+1)); //debug code
			newVoteB.submission(s, a);
		}
		
		//Displaying Result
		newVoteB.displayVote();
		System.out.println("****************************************************************");
		System.out.println("Total student vote count: " + voteCountB);
	}
	
}
