package com.Schedule.Corn_Schedule.Tasks.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scdule_Corn {


	@Scheduled(fixedDelay = 10000)
	public void test_ScheduleInterval() {
		System.out.println("This message is printing every 10 seconds");
	}

	// Cron sinature is <second> <minute> <hour> <day-of-month> <month> <day-of-week> <year> <command>
	@Scheduled(cron = "0 * * ? * *")
	public void test_ScheduleIntervalWithCron() {
		System.out.println("This message is printing every 1 minute With cron Config");
	}
}
