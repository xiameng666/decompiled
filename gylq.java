import android.os.SystemClock;
import j..util.Objects;

final class gylq extends gxum {
    final gylu a;

    public gylq(gylu gylu0) {
        Objects.requireNonNull(gylu0);
        this.a = gylu0;
        super("ShutDownNearbyDirect");
    }

    @Override
    public final void run() {
        gylu gylu0 = this.a;
        if(gylu0.i()) {
            gylu0.h();
            return;
        }
        if(SystemClock.elapsedRealtime() - gylu0.g > 5000L) {
            gylu0.h();
            return;
        }
        gxuf gxuf0 = gylu0.c;
        if(gxuf0 != null) {
            gxuf0.g(this, 100L);
        }
    }
}

