package log; //logging 전용 패키지 추가

//필요한 logging, file, 예외처리 호출
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

//evnet log 생성하고 기록하는 클래스 생성
public class EventLogger {
	FileHandler filehandler;
	PrintWriter fileout;
	LogManager logmanager;
	Logger logger;
	
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager(); //전역 로그 기록기 생성
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME); //전역 로거 GLOBAL_LOGGER_NAME 사용
			filehandler = new FileHandler(fileName);//filehandler로 로그를 파일에 기록
			filehandler.setFormatter(new SimpleFormatter()); //간단한 형식으로 로그 메시지 포맷
			logger.addHandler(filehandler); //로거에 filehandler 추가
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage); //로그 메시지 기록
	}
}
