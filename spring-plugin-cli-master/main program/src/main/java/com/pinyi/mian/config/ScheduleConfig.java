package com.pinyi.mian.config;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/**
 * @Description
 * @ClassName ScheduleConfig
 * @Auth wangc
 * @Date 2020-07-08 17:07
 */
public class ScheduleConfig implements SchedulingConfigurer {


    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),new ThreadFactory() {

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"print-hello-schedule");
                    }
            }));
    }
}
