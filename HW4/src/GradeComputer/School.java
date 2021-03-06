package GradeComputer;
import java.util.ArrayList;

public class School {

	public static void main(String[] args) {
		Math mathClass = new Math();
		English engClass = new English();
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("이승기", "141213", "수학"));
		students.add(new Student("김수현", "141518", "영어"));
		students.add(new Student("주원", "141230", "수학"));
		students.add(new Student("김우빈", "141255", "수학"));
		students.add(new Student("이민호", "141590", "영어"));
		
		for(int i = 0; i < students.size(); i++)
			mathClass.enroll(students.get(i));
		
		mathClass.setScore(students.get(0), 95);
		mathClass.setScore(students.get(1), 90);
		mathClass.setScore(students.get(2), 76);
		mathClass.setScore(students.get(3), 85);
		mathClass.setScore(students.get(4), 90);		
		
		for(int i = 0; i < students.size(); i++)
			engClass.enroll(students.get(i));
		
		engClass.setScore(students.get(0), 20);
		engClass.setScore(students.get(1), 100);
		engClass.setScore(students.get(2), 60);
		engClass.setScore(students.get(3), 89);
		engClass.setScore(students.get(4), 95);
		
		mathClass.setGrade();
		engClass.setGrade();
		
		for(int i = 0; i < students.size(); i++)
			System.out.println("이름: "+ students.get(i).getName() + " 학번: " + students.get(i).getId() + " 학과: " + students.get(i).getMajor() + 
					" Math Grade: " + students.get(i).getMathGrade() + " English Grade: " + students.get(i).getEngGrade());
		

	}

}
