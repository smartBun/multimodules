package com.listener;

import com.quartz.QuartzInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component("MyApplicationContextListener")
public class MyApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        QuartzInitializer.start();
//        System.out.println("==> Application Context Refreshed.");
    }
}