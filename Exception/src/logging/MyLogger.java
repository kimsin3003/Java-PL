package logging;

import java.util.logging.Logger;

public class MyLogger {
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instatnce = new MyLogger();
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
}
