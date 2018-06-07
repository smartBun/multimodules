package com;
import java.util.concurrent.*;
public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(() -> {
            System.out.println("call");
            TimeUnit.SECONDS.sleep(1);
            return "callable thread done";
        });
        System.out.println(future.get());
        executor.shutdownNow();
    }
}