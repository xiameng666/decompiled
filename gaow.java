import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

final class gaow extends clil {
    final gaoy a;

    public gaow(gaoy gaoy0) {
        Objects.requireNonNull(gaoy0);
        this.a = gaoy0;
        super("wallet");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        gaoy gaoy0 = this.a;
        synchronized(gaoy0) {
            gaoy0.c = new Messenger(iBinder0);
            CountDownLatch countDownLatch0 = gaoy0.b;
            if(countDownLatch0 != null) {
                countDownLatch0.countDown();
            }
            gaoy0.b = null;
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        gaoy gaoy0 = this.a;
        synchronized(gaoy0) {
            gaoy0.c = null;
            if(gaoy0.b == null) {
                gaoy0.b = new CountDownLatch(1);
            }
        }
    }
}

