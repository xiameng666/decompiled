import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class czkx implements cuqp {
    final Executor a;
    final cuqs b;
    final String c;
    final czkv d;
    final czkz e;
    public static final int f;
    private final CountDownLatch g;
    private final CountDownLatch h;
    private boolean i;
    private boolean j;
    private final czkz k;

    public czkx(czkz czkz0, Executor executor0, cuqs cuqs0, String s, czkv czkv0, czkz czkz1) {
        this.a = executor0;
        this.b = cuqs0;
        this.c = s;
        this.d = czkv0;
        this.e = czkz1;
        super();
        this.g = new CountDownLatch(1);
        this.h = new CountDownLatch(1);
        this.i = false;
        this.j = false;
        this.k = czkz0;
    }

    public final boolean a(String s) {
        try {
            czkz czkz0 = this.k;
            if(!this.g.await(czkz0.c, TimeUnit.SECONDS)) {
                czke.m(czkz0.a, s, 6, gymr.d, gymd.y);
                return false;
            }
            if(this.i) {
                czkw czkw0 = new czkw();
                czlc.a.put(s, czkw0);
                return true;
            }
            czke.m(czkz0.a, s, 6, gymr.d, gymd.u);
        }
        catch(InterruptedException unused_ex) {
            czke.m(this.k.a, s, 6, gymr.d, gymd.t);
            Thread.currentThread().interrupt();
        }
        return false;
    }

    public final void b(String s) {
        try {
            czlc.a.remove(s);
            czkz czkz0 = this.k;
            if(!this.h.await(czkz0.d, TimeUnit.SECONDS)) {
                czke.m(czkz0.a, s, 7, gymx.a, gymd.y);
                return;
            }
            if(!this.j) {
                czke.m(czkz0.a, s, 7, gymx.a, gymd.u);
            }
        }
        catch(InterruptedException unused_ex) {
            czke.m(this.k.a, s, 7, gymx.a, gymd.t);
            Thread.currentThread().interrupt();
        }
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStarted(String s) {
        this.i = true;
        this.g.countDown();
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStopped(String s) {
        this.j = true;
        this.h.countDown();
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo0) {
        czks czks0 = new czks(this.b, this.c, nsdServiceInfo0, this.d, this.e);
        this.a.execute(czks0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo0) {
        czkt czkt0 = new czkt(this.c, nsdServiceInfo0, this.d, this.e);
        this.a.execute(czkt0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStartDiscoveryFailed(String s, int v) {
        czkq.a.b().h("Failed to start discovery: %s", czkj.a(v));
        this.g.countDown();
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStopDiscoveryFailed(String s, int v) {
        czkq.a.b().h("Failed to stop discovery: %s", czkj.a(v));
        this.h.countDown();
    }
}

