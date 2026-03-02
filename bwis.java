import android.net.nsd.NsdManager.DiscoveryListener;
import android.net.nsd.NsdManager;

public final class bwis implements ibth {
    public final bwiu a;
    public final NsdManager.DiscoveryListener b;

    public bwis(bwiu bwiu0, NsdManager.DiscoveryListener nsdManager$DiscoveryListener0) {
        this.a = bwiu0;
        this.b = nsdManager$DiscoveryListener0;
    }

    @Override  // ibth
    public final Object a() {
        ((ggtj)bwiu.a.h()).x("Stopping Hub discovery");
        NsdManager nsdManager0 = this.a.b;
        if(nsdManager0 != null) {
            nsdManager0.stopServiceDiscovery(this.b);
        }
        return ibom.a;
    }
}

