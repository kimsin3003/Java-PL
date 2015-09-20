package exception;

import junit.framework.TestCase;
import logging.MyLogger;

public class StudentTest extends TestCase{

	public void testStudent(){
		
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		try{
			Student student = new Student(name);
			fail();
		} catch(StudentNameFormatException e){
			myLogger.warning(e.getMessage());
			assertEquals("name must not be null.", e.getMessage());
		}
		
		try {
			Student student = new Student("Edward Jon Kim Test");
			fail();
		} catch(StudentNameFormatException e){
			myLogger.warning(e.getMessage());
			assertEquals("name must not exceed three words.", e.getMessage());
		}
		
		
		
		Student student = new Student("James");
		assertEquals("James", student.getStudentName());
		
	}

}
