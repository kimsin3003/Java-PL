package GradeComputer;

public class Student {

	private String name;
	private String id;
	private String major;
	private int mathScore;
	private char mathGrade;
	private int engScore;
	private char engGrade;
	
	Student(String name, String id,	String major){
		this.name = name;
		this.id = id;
		this.major = major;
		this.mathGrade = 'X';
		this.engGrade = 'X';
		
	}
	
	public char getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(char mathGrade) {
		this.mathGrade = mathGrade;
	}

	public char getEngGrade() {
		return engGrade;
	}

	public void setEngGrade(char engGrade) {
		this.engGrade = engGrade;
	}

	
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getMajor() {
		return major;
	}

	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	
	
}
