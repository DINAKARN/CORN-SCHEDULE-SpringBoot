package com.Schedule.Corn_Schedule.Tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CornScheduleTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(CornScheduleTasksApplication.class, args);
	}

}
