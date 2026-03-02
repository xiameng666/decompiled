import android.net.nsd.NsdManager.DiscoveryListener;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

public final class bwir implements NsdManager.DiscoveryListener {
    final bwiu a;
    final ichm b;

    public bwir(bwiu bwiu0, ichm ichm0) {
        this.a = bwiu0;
        this.b = ichm0;
        super();
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStarted(String s) {
        ibuq.f(s, "regType");
        ((ggtj)bwiu.a.h()).x("GHP Hub discovery started");
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStopped(String s) {
        ibuq.f(s, "serviceType");
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo0) {
        ibuq.f(nsdServiceInfo0, "service");
        String s = nsdServiceInfo0.getServiceType();
        ibuq.e(s, "getServiceType(...)");
        if(!ibzk.W(s, "_ghp._tcp")) {
            ((ggtj)bwiu.a.j()).B("Discovered service %s which is NOT a GHP Hub", nsdServiceInfo0);
            return;
        }
        bwiq bwiq0 = new bwiq(this.b);
        NsdManager nsdManager0 = this.a.b;
        if(nsdManager0 != null) {
            nsdManager0.resolveService(nsdServiceInfo0, bwiq0);
        }
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo0) {
        ibuq.f(nsdServiceInfo0, "service");
        ((ggtj)bwiu.a.h()).B("Service lost: %s", nsdServiceInfo0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStartDiscoveryFailed(String s, int v) {
        ibuq.f(s, "serviceType");
        ((ggtj)bwiu.a.j()).z("Starting Hub discovery failed: Error code:%d", v);
        ichp.a(this.b);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStopDiscoveryFailed(String s, int v) {
        ibuq.f(s, "serviceType");
        ((ggtj)bwiu.a.j()).z("Stopping Hub discovery failed: Error code:%d", v);
    }
}

