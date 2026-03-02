import android.os.Handler;
import android.os.Looper;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class fvkw extends Thread {
    public final CountDownLatch a;
    public volatile Handler b;
    public volatile boolean c;
    final fvkx d;

    public fvkw(fvkx fvkx0) {
        Objects.requireNonNull(fvkx0);
        this.d = fvkx0;
        super("SensorBatchThread");
        this.a = new CountDownLatch(1);
        this.c = false;
        this.setPriority(4);
    }

    @Override
    public final void run() {
        Looper.prepare();
        this.b = new clht();
        this.a.countDown();
        Looper.loop();
        this.getName();
    }
}

