import android.os.Message;
import j..util.Objects;
import java.util.concurrent.locks.Lock;

abstract class azwq implements Runnable {
    final azwr b;

    public azwq(azwr azwr0) {
        Objects.requireNonNull(azwr0);
        this.b = azwr0;
        super();
    }

    protected abstract void a();

    @Override
    public final void run() {
        Lock lock0 = this.b.b;
        lock0.lock();
        try {
            try {
                if(!Thread.interrupted()) {
                    this.a();
                    goto label_12;
                }
                goto label_14;
            }
            catch(RuntimeException runtimeException0) {
                Message message0 = this.b.a.e.obtainMessage(2, runtimeException0);
                this.b.a.e.sendMessage(message0);
            }
        }
        catch(Throwable throwable0) {
            this.b.b.unlock();
            throw throwable0;
        }
    label_12:
        this.b.b.unlock();
        return;
    label_14:
        lock0.unlock();
    }
}

