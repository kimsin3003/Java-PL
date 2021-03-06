package GradeComputer;
public class English extends Class{
	
	@Override
	public void setScore(Student st, int score) {
		st.setEngScore(score);
	}

	@Override
	char computeGrade(Student student) {
		if(student.getMajor() == "영어")
			return getMajorGrade(student.getEngScore());
		
		else
			return getNonMajorGrade(student.getEngScore());
		
	}

	@Override
	void setGrade(){
		for(int i = 0; i < students.size(); i++)
			students.get(i).setEngGrade(computeGrade(students.get(i)));
		
	}

}
