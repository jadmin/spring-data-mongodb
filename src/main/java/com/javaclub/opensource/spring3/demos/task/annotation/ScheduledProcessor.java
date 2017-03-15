package com.javaclub.opensource.spring3.demos.task.annotation;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.javaclub.opensource.spring3.demos.task.Processor;
import com.javaclub.opensource.spring3.demos.task.Worker;

@Service
public class ScheduledProcessor implements Processor {

	private final AtomicInteger counter = new AtomicInteger();

	@Autowired
	private Worker worker;

	@Scheduled(fixedDelay = 30000)
	public void process() {
		System.out.println("processing next 10 at " + new Date());
		for (int i = 0; i < 10; i++) {
			worker.work(counter.incrementAndGet());
		}
	}

}
