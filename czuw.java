import android.net.Network;
import com.google.android.gms.nearby.mediums.dct.UsbNcm.1;

public final class czuw implements Runnable {
    public final UsbNcm.1 a;
    public final Network b;
    public final gmcu c;

    public czuw(UsbNcm.1 usbNcm$10, Network network0, gmcu gmcu0) {
        this.a = usbNcm$10;
        this.b = network0;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        czkq.a.b().i("%s: doLost: %s", "[UsbNcm]", this.b);
        this.c.q(Boolean.valueOf(false));
        synchronized(this.a.b) {
            this.a.b.d = null;
        }
    }
}

