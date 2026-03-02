import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class epwq implements Runnable {
    final epwr a;

    public epwq(epwr epwr0) {
        Objects.requireNonNull(epwr0);
        this.a = epwr0;
        super();
    }

    @Override
    public final void run() {
        epwr epwr0 = this.a;
        D2DDevice d2DDevice0 = epwr0.b;
        if(d2DDevice0 == null) {
            return;
        }
        epwp epwp0 = new epwp(this, d2DDevice0);
        epwr0.a.post(epwp0);
    }
}

