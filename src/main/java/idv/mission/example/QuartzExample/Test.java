package idv.mission.example.QuartzExample;

import java.io.IOException;

import org.quartz.SchedulerException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws SchedulerException, IOException {
		new ClassPathXmlApplicationContext("quartz-config.xml");
		System.out.println("Start - ScheduleController");
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //
		//while (true) {
		//	if( reader.readLine().equals("exit") ) {
		//		System.exit(0);
		//	}
		//}
	}

}