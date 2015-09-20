package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	Logger logger = Logger.getLogger("mylogger");
	
	
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	
	private MyLogger() {
	
		try {
		
			logFile = new FileHandler(errorLog, true); // 로그를 뒤에 이어서 계속 붙여쓰기
//			logFile = new FileHandler(errorLog); // 새로 덮어쓰기
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL); // all 로 지정해야 각각의 핸들러 안의 레벨을 핸들링할 수 있음.

		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
		
	}
	
	//File
	
	public static MyLogger getLogger() {
		if (instance == null)
			new MyLogger();
		return instance;
	}

	public void log(String message){
		
		logger.finest(message);
		logger.finer(message);
		logger.fine(message);
		logger.config(message);
		logger.info(message);
		logger.warning(message);
		logger.severe(message);
		
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
}
