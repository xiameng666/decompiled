import android.uwb.RangingSession;
import j..util.Objects;

public final class kcf implements Runnable {
    public final kcu a;

    public kcf(kcu kcu0) {
        this.a = kcu0;
    }

    @Override
    public final void run() {
        ((RangingSession)Objects.requireNonNull(this.a.g)).stop();
    }
}

