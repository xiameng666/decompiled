import android.net.Network;
import android.net.NetworkCapabilities;

public final class czuv implements Runnable {
    public final Network a;
    public final NetworkCapabilities b;

    public czuv(Network network0, NetworkCapabilities networkCapabilities0) {
        this.a = network0;
        this.b = networkCapabilities0;
    }

    @Override
    public final void run() {
        czkq.a.b().j("%s: doCapabilitiesChanged: %s %s", "[UsbNcm]", this.a, this.b);
    }
}

