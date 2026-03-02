import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class epwp implements Runnable {
    final D2DDevice a;
    final epwq b;

    public epwp(epwq epwq0, D2DDevice d2DDevice0) {
        this.a = d2DDevice0;
        Objects.requireNonNull(epwq0);
        this.b = epwq0;
        super();
    }

    @Override
    public final void run() {
        D2DDevice d2DDevice0 = this.a;
        baun baun0 = erky.a;
        baun0.d("Auto connecting to %s", new Object[]{d2DDevice0.c});
        erky erky0 = this.b.a.c.a;
        erkw erkw0 = erky0.b;
        if(erkw0 != null) {
            erky0.ak = true;
            erky0.al = false;
            erkw0.m(d2DDevice0, 1, true);
            return;
        }
        baun0.m("Listener not attached", new Object[0]);
    }
}

