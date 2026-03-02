package com.android.volley;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public abstract class AsyncRequestQueue.ExecutorFactory {
    public abstract ExecutorService createBlockingExecutor(BlockingQueue arg1);

    public abstract ExecutorService createNonBlockingExecutor(BlockingQueue arg1);

    public abstract ScheduledExecutorService createNonBlockingScheduledExecutor();
}

