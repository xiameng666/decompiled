import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

public final class fwte implements Runnable {
    public final fwtu a;
    public final PrintWriter b;
    public final CountDownLatch c;

    public fwte(fwtu fwtu0, PrintWriter printWriter0, CountDownLatch countDownLatch0) {
        this.a = fwtu0;
        this.b = printWriter0;
        this.c = countDownLatch0;
    }

    @Override
    public final void run() {
        this.a.q.f(this.b);
        this.b.println("CST: liveRil=" + this.a.a.b + ", screenState=" + this.a.a.a);
        long v = this.a.j.e.c() - SystemClock.elapsedRealtime();
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.a.e.c(simpleDateFormat0, v, this.b);
        this.b.println("Wifi timestamps are currently " + (this.a.m.a == 1 ? "untrusted" : "trusted"));
        this.c.countDown();
    }
}

