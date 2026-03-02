import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

final class gcmp implements RejectedExecutionHandler {
    private static final void a(Runnable runnable0) {
        if((runnable0 instanceof gcmw)) {
            ((gcmw)runnable0).c.a.c(((gcmw)runnable0).b);
        }
    }

    @Override
    public final void rejectedExecution(Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) {
        if(!threadPoolExecutor0.isShutdown()) {
            Runnable runnable1 = (Runnable)threadPoolExecutor0.getQueue().poll();
            threadPoolExecutor0.execute(runnable0);
            gcmp.a(runnable1);
            return;
        }
        gcmp.a(runnable0);
    }
}

