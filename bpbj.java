import com.google.android.gms.findmydevice.spot.ScanResult;
import java.util.concurrent.atomic.AtomicReference;

public final class bpbj implements glzn {
    public final bpce a;
    public final gfsx b;
    public final boolean c;
    public final long d;
    public final long e;
    public final ScanResult f;

    public bpbj(bpce bpce0, gfsx gfsx0, boolean z, long v, long v1, ScanResult scanResult0) {
        this.a = bpce0;
        this.b = gfsx0;
        this.c = z;
        this.d = v;
        this.e = v1;
        this.f = scanResult0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ScanResult scanResult0 = this.f;
        gfsx gfsx0 = scanResult0.a.contains(Integer.valueOf(3)) ? gfsx.m(scanResult0.d) : gfqx.a;
        bpce bpce0 = this.a;
        if(!((bpjm)object0).e.i() && gfsx0.i()) {
            AtomicReference atomicReference0 = new AtomicReference();
            botl botl0 = new botl(((boul)bpce0.k), atomicReference0);
            return gdta.g(gdta.g(gdta.g(((boul)bpce0.k).j.b(botl0, gmap.a)).h(new botm(atomicReference0), gmap.a)).h(new bpbt(gfsx0), gmap.a)).i(new bpbv(bpce0, ((bpjm)object0), this.c, gfsx0, this.b, this.d, this.e), bpce0.r);
        }
        return gdta.g(gmbu.i(Boolean.valueOf(false))).i(new bpbv(bpce0, ((bpjm)object0), this.c, gfsx0, this.b, this.d, this.e), bpce0.r);
    }
}

