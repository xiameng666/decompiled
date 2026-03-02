import android.os.CountDownTimer;
import com.google.android.gms.fido.authenticator.ui.LockscreenChimeraActivity;
import j..util.Objects;

public final class blvb extends CountDownTimer {
    final LockscreenChimeraActivity a;

    public blvb(LockscreenChimeraActivity lockscreenChimeraActivity0, long v) {
        Objects.requireNonNull(lockscreenChimeraActivity0);
        this.a = lockscreenChimeraActivity0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        this.a.k();
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
    }
}

