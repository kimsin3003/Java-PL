package GradeComputer;
public class Math extends Class{
	
	@Override
	public void setScore(Student st, int score) {
		st.setMathScore(score);
	}

	@Override
	char computeGrade(Student student) {
		if(student.getMajor() == "수학")
			return getMajorGrade(student.getMathScore());
		
		else
			return getNonMajorGrade(student.getMathScore());
		
	}

	@Override
	void setGrade() {
		for(int i = 0; i < students.size(); i++)
			students.get(i).setMathGrade(computeGrade(students.get(i)));
	}

}
