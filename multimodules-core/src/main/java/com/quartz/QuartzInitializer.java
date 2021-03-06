package com.quartz;

public class QuartzInitializer {

    public static String JOB_NAME = "动态任务调度";  
    public static String TRIGGER_NAME = "动态任务触发器";  
    public static String JOB_GROUP_NAME = "XLXXCC_JOB_GROUP";  
    public static String TRIGGER_GROUP_NAME = "XLXXCC_JOB_GROUP"; 

    public static void start() {
        try {  
            System.err.println("【系统启动】开始(每1秒输出一次)...");
            QuartzManager.addJob(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME, MyJob.class, "0/1 * * * * ?");    

            Thread.sleep(5000);    
            System.err.println("【修改时间】开始(每5秒输出一次)...");
            QuartzManager.modifyJobTime(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME, "0/5 * * * * ?");    

            Thread.sleep(6000);    
            System.err.println("【移除定时】开始...");
            QuartzManager.removeJob(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME);    
            System.err.println("【移除定时】成功");
        } catch (Exception e) {  
            e.printStackTrace();  
        }
    }
}