import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class gaor extends clil {
    final gaot a;

    public gaor(gaot gaot0) {
        Objects.requireNonNull(gaot0);
        this.a = gaot0;
        super("wallet");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        gaot gaot0 = this.a;
        synchronized(gaot0) {
            gaot0.c = new Messenger(iBinder0);
            CountDownLatch countDownLatch0 = gaot0.b;
            if(countDownLatch0 != null) {
                countDownLatch0.countDown();
            }
            gaot0.b = null;
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        gaot gaot0 = this.a;
        synchronized(gaot0) {
            gaot0.c = null;
            if(gaot0.b == null) {
                gaot0.b = new CountDownLatch(1);
            }
        }
    }
}

