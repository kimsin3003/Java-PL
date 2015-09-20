package exception;

import logging.MyLogger;

public class Student {

	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName) throws StudentNameFormatException{
		
		if (studentName == null)
			throw new StudentNameFormatException("name must not be null.");

		if (studentName.split(" ").length > 3) // split(" ")에는 구분자를 넣으면 됨.
			throw new StudentNameFormatException("name must not exceed three words.");
		
		this.studentName = studentName;
	}

	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return studentName;
	}
	
	
	
}
