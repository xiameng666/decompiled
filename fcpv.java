import com.google.android.gms.wearable.backup.wear.LockscreenSetIntentListener.LockscreenSetIntentReceiver;
import j..util.Objects;

public final class fcpv implements gmbg {
    final LockscreenSetIntentListener.LockscreenSetIntentReceiver a;

    public fcpv(LockscreenSetIntentListener.LockscreenSetIntentReceiver lockscreenSetIntentListener$LockscreenSetIntentReceiver0) {
        Objects.requireNonNull(lockscreenSetIntentListener$LockscreenSetIntentReceiver0);
        this.a = lockscreenSetIntentListener$LockscreenSetIntentReceiver0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.a.n("Failed to initialize secondary key.", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.a.a.d("Successfully initialized secondary key.", new Object[0]);
    }
}

