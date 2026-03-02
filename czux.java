import android.net.Network;
import com.google.android.gms.nearby.mediums.dct.UsbNcm.1;

public final class czux implements Runnable {
    public final UsbNcm.1 a;
    public final Network b;
    public final gmcu c;

    public czux(UsbNcm.1 usbNcm$10, Network network0, gmcu gmcu0) {
        this.a = usbNcm$10;
        this.b = network0;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        czkq.a.b().i("%s: doAvailable: %s", "[UsbNcm]", this.b);
        this.c.q(Boolean.valueOf(true));
        synchronized(this.a.b) {
            this.a.b.d = this.b;
        }
    }
}

