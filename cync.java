import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public final class cync {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final AtomicInteger d;
    public long e;
    public boolean f;
    public long g;
    public int h;
    public boolean i;
    public long j;
    public cust k;
    public final int l;
    public int m;
    private static final SimpleDateFormat n;

    static {
        cync.n = new SimpleDateFormat("HH:mm:ss:SSS", Locale.ENGLISH);
    }

    public cync(int v, boolean z, boolean z1, long v1, AtomicInteger atomicInteger0) {
        this.h = -1;
        this.m = 1;
        this.i = true;
        this.k = cyjh.a;
        this.l = v;
        this.b = z;
        this.c = z1;
        this.a = v1;
        this.d = atomicInteger0;
    }

    public final long a() {
        long v = this.e;
        if(v != 0L) {
            return v <= this.a ? 0L : v - this.a;
        }
        return 0L;
    }

    public final void b(long v, cyql cyql0) {
        String s;
        this.e = v;
        this.f = cyql0.a();
        if(!cyql0.a()) {
            this.m = cyql0.b;
        }
        ggtj ggtj0 = this.k.d();
        int v1 = this.l;
        Boolean boolean0 = Boolean.valueOf(this.b);
        Boolean boolean1 = Boolean.valueOf(this.c);
        Long long0 = this.a();
        if(cyql0.a()) {
            s = "success";
            ggtj0.Z("SwitchLog_switchFinished: switchType=%s, isRevert=%s, switchForA2dp=%s, latency=%s, result=%s", cynd.a(v1), boolean0, boolean1, long0, s);
            return;
        }
        String s1 = cyjv.a(this.m);
        if(this.m == 0) {
            throw null;
        }
        s = s1;
        ggtj0.Z("SwitchLog_switchFinished: switchType=%s, isRevert=%s, switchForA2dp=%s, latency=%s, result=%s", cynd.a(v1), boolean0, boolean1, long0, s);
    }

    @Override
    public final String toString() {
        String s4;
        String s = cync.n.format(Long.valueOf(this.a));
        String s1 = cync.n.format(Long.valueOf(this.e));
        long v = this.a();
        String s2 = "";
        String s3 = Long.compare(this.g, 0L) <= 0 ? "" : a.u(this.g, "ms, connectAclLatency:");
        if(this.f) {
            s4 = "Succeed";
        }
        else {
            String s5 = cyjv.a(this.m);
            if(this.m == 0) {
                throw null;
            }
            s4 = "Failed: " + s5;
        }
        int v1 = this.l;
        boolean z = this.b;
        if(!z) {
            s2 = ", " + (this.c ? "A2DP" : "HFP");
        }
        return s + " - " + s1 + ", latency " + v + s3 + "ms, " + s4 + ", " + cynd.a(v1) + ", " + (z ? "Revert" : "SASS switch") + s2;
    }
}

