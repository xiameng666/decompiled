import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import com.google.android.gms.findmydevice.spot.bleadvertising.OfflineBeaconImpl.1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@ibnh
public final class bnnc implements bnmz {
    public static final bboh a;
    public static final NetworkRequest b;
    public final bnmg c;
    public final bnmn d;
    public final bnne e;
    public final ConnectivityManager f;
    public final Object g;
    public boolean h;
    public int i;
    public boolean j;
    public ByteString k;
    public final ConnectivityManager.NetworkCallback l;
    public int m;
    private final fqxe n;
    private final fgvt o;
    private final Context p;
    private final fguz q;
    private final Executor r;
    private volatile boolean s;

    static {
        bnnc.a = bboh.b("OfflineBeaconImpl", bbcu.eD);
        bnnc.b = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
    }

    public bnnc(bnmg bnmg0, bnmn bnmn0, bnne bnne0, fqxe fqxe0, fgvt fgvt0, fguz fguz0, Context context0, Executor executor0) {
        this.g = new Object();
        this.h = false;
        this.s = false;
        this.m = 2;
        this.c = bnmg0;
        this.d = bnmn0;
        this.e = bnne0;
        this.n = fqxe0;
        this.o = fgvt0;
        this.q = fguz0;
        this.p = context0;
        this.f = (ConnectivityManager)context0.getSystemService("connectivity");
        this.r = executor0;
        this.l = new OfflineBeaconImpl.1(this);
    }

    @Override  // bnmz
    public final gmcd a() {
        return this.c(false);
    }

    @Override  // bnmz
    public final void b() {
        this.s = true;
        if(hsww.i() && this.k != null && this.h) {
            ((ggtj)bnnc.a.h()).x("Starting power off mode.");
            int v = this.m;
            ByteString hfsf0 = this.k;
            long v1 = TimeUnit.MILLISECONDS.toSeconds(this.o.d().toEpochMilli());
            int v2 = (int)TimeUnit.HOURS.toSeconds(0x30L);
            gged_interceptors gged0 = fqvf.l(v, hfsf0, ggnj.a, 10, v1, v2, 0L).b().v();
            this.e.c(gged0);
        }
    }

    public final gmcd c(boolean z) {
        if(this.s) {
            ((ggtj)bnnc.a.h()).x("Already shutting down.");
            return gmbx.a;
        }
        if(this.f == null) {
            ((ggtj)bnnc.a.i()).x("No ConnectivityManager.");
            return gmbx.a;
        }
        if(bpya.a(this.p) && (this.q != null && this.q.d())) {
            return hsww.i() ? gdtf.k(gdtf.j(this.n.f(), new bnnb(), this.r), new bnna(this, z), this.r) : gdtf.k(gmbu.i(gfqx.a), new bnna(this, z), this.r);
        }
        synchronized(this.g) {
            this.e();
            this.j = false;
            this.d();
        }
        return gmbx.a;
    }

    public final void d() {
        this.d.c();
        this.c.b();
    }

    public final void e() {
        synchronized(this.g) {
            if(this.h) {
                ((ggtj)bnnc.a.h()).x("Unregistering network callbacks.");
                batl.s(this.f);
                this.f.unregisterNetworkCallback(this.l);
                this.e.b(false);
                this.h = false;
            }
        }
    }
}

