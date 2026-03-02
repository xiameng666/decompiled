import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fczv implements Runnable {
    public final CountDownLatch a;
    public final long b;
    public final evqp c;

    public fczv(CountDownLatch countDownLatch0, long v, evqp evqp0) {
        this.a = countDownLatch0;
        this.b = v;
        this.c = evqp0;
    }

    @Override
    public final void run() {
        evqp evqp0;
        try {
            long v = this.b;
            evqp0 = this.c;
            this.a.await(v, TimeUnit.SECONDS);
            if(!evqp0.a.m()) {
                Log.e("wearable.Accounts", "Timed out waiting for task to complete");
                evqp0.d(new TimeoutException(a.D(v, "Task timed out after ", " seconds")));
            }
        }
        catch(InterruptedException interruptedException0) {
            Log.e("wearable.Accounts", "Thread interrupted while waiting for task");
            if(!evqp0.a.m()) {
                evqp0.d(interruptedException0);
            }
        }
    }
}

