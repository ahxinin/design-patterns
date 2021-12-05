package com.ahxinin.observer.eventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : hexin
 * @date : 2021-12-04
 */
public class UserController {

    private EventBus eventBus;

    public UserController(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
                100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50));
        eventBus = new AsyncEventBus(threadPoolExecutor);
    }

    public void setRegObservers(List<Object> observers){
        for (Object observer: observers){
            eventBus.register(observer);
        }
    }

    public Long register(String phone, String password){
        //用户注册
        long userId = 0;

        eventBus.post(userId);

        return userId;
    }
}
