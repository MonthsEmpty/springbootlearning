package com.vincent.basic.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dell on 2017/4/12.
 */
public class ExecutorServiceStudy {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();//创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();//创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LightOff());
        }
        executorService.shutdown();//对shutdown方法的调用可以防止新任务被提交给这个Executor
        /*for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0 ; j < 10 ; j++)
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }*/
    }

    public static void testCachedThreadPool(){
        ExecutorService executorService = Executors.newCachedThreadPool();//创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LightOff());
        }
        executorService.shutdown();//对shutdown方法的调用可以防止新任务被提交给这个Executor
    }


}
