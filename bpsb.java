import com.google.android.gms.findmydevice.spot.sync.SpotPublicKeysRefreshService;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class bpsb implements glzn {
    public final SpotPublicKeysRefreshService a;
    public final Deque b;
    public final boolean c;
    public final booz d;

    public bpsb(SpotPublicKeysRefreshService spotPublicKeysRefreshService0, Deque deque0, boolean z, booz booz0) {
        this.a = spotPublicKeysRefreshService0;
        this.b = deque0;
        this.c = z;
        this.d = booz0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((Boolean)object0).booleanValue()) {
            return this.a.e(this.b, this.c);
        }
        gmcd[] arr_gmcd = new gmcd[1];
        fqdq fqdq0 = bnll.a(bnlm.a(bopg.a(), ((frii)this.d.a.q.get())), new bnli(this.d.f()), ((fgvt)this.d.a.e.get()), boox.W(), ((Executor)this.d.a.b.get()));
        arr_gmcd[0] = gdta.g(fqdq0.a(true)).h(new fqdn(), fqdq0.d);
        return gdtd.h(arr_gmcd).a(new bpse(), gmap.a);
    }
}

