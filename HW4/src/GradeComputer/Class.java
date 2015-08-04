package GradeComputer;
import java.util.ArrayList;

public abstract class Class implements Strategy{
	
	ArrayList<Student> students = new ArrayList<Student>();

	
	void enroll(Student newStu){
		students.add(newStu);
	}
	
	void drop(Student deadStu){
		students.remove(deadStu);
	}
	
	abstract void setScore(Student st, int score);
	
	abstract void setGrade();
	
	abstract char computeGrade(Student stu);
	

	@Override
	public char getMajorGrade(int score) {
		if(score < 60)
			return 'F';
		
		else if(score < 70)
			return 'D';
		
		else if(score < 80)
			return 'C';
		
		else if(score < 90)
			return 'B';
		
		else if(score < 95)
			return 'A';
		
		else if(score <= 100)
			return 'S';
		
		else{
			System.out.println("Too high as a score");
			return 'X';
		}
	}

	@Override
	public char getNonMajorGrade(int score) {
		if(score < 55)
			return 'F';
		
		else if(score < 70)
			return 'D';
		
		else if(score < 80)
			return 'C';
		
		else if(score < 90)
			return 'B';
		
		else if(score <= 100)
			return 'A';
		
		else{
			System.out.println("Too high as a score");
			return 'X';
		}
	}

}
