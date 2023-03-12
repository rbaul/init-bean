package com.github.rbaul.initbean;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

@Slf4j
public class BaseInit implements ApplicationRunner, ApplicationListener<ApplicationReadyEvent>, CommandLineRunner {
	
	public BaseInit() {
		log.info("Construct Run: {}", this.getClass().getSimpleName());
	}
	
	@PostConstruct
	public void init() {
		log.info("PostConstruct Run: {}", this.getClass().getSimpleName());
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("ApplicationRunner Run: {}", this.getClass().getSimpleName());
	}
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		log.info("ApplicationListener Event: {}", this.getClass().getSimpleName());
	}
	
	@EventListener
	public void onApplicationStartedEvent(ApplicationStartedEvent event) {
		log.info("EventListener: ApplicationStartedEvent Event: {}", this.getClass().getSimpleName());
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunner: {}", this.getClass().getSimpleName());
	}
}
