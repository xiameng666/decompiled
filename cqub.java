import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class cqub {
    public final cqwd a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final gful_cronetEngineProvider d;
    public final gful_cronetEngineProvider e;
    public final boolean f;
    public final long g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    final List n;
    int o;
    boolean p;
    private final gful_cronetEngineProvider q;
    private final gful_cronetEngineProvider r;
    private final cqwc s;

    public cqub(Collection collection0, boolean z, long v) {
        this.a = new cqwd("QueryTaskConfig");
        this.b = gfus.a(((gful_cronetEngineProvider)new cqtv()));
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new cqtw()));
        this.q = gful0;
        gful_cronetEngineProvider gful1 = gfus.a(((gful_cronetEngineProvider)new cqtx()));
        this.c = gful1;
        gful_cronetEngineProvider gful2 = gfus.a(((gful_cronetEngineProvider)new cqty()));
        this.r = gful2;
        this.d = gfus.a(((gful_cronetEngineProvider)new cqtz()));
        this.e = gfus.a(((gful_cronetEngineProvider)new cqua()));
        this.s = cqwc.b();
        this.f = z;
        this.n = new ArrayList(collection0);
        this.h = ((Long)gful2.mr()).intValue();
        this.j = 0;
        this.o = 1;
        this.p = true;
        this.l = true;
        this.g = v;
        if(z) {
            this.m = false;
            this.i = ((Long)gful1.mr()).intValue();
            return;
        }
        this.m = true;
        this.i = ((Long)gful0.mr()).intValue();
    }

    final boolean a(boolean z) {
        boolean z1 = true;
        if(!((Boolean)this.s.b.mr()).booleanValue() && (this.n.size() > 1 || !this.n.contains("%9E5E7C8F47989526C9BCD95D24084F6F0B27C5ED"))) {
            if(z) {
                this.a.a("Discovery is not RCN only - cannot extend query period.");
            }
            return false;
        }
        if(this.m) {
            if(z) {
                this.a.a("Active mode delay ramp in progress - cannot extend query period.");
            }
            return false;
        }
        if(this.l) {
            if(z) {
                this.a.a("First burst is not complete - cannot extend query period.");
            }
            return false;
        }
        if(this.j != 0) {
            if(z) {
                this.a.a("Burst in progress - cannot extend query period.");
            }
            return false;
        }
        if(this.i < ((Long)this.c.mr()).intValue()) {
            z1 = false;
        }
        if(!z1 && z) {
            this.a.a("Active mode Intra-burst period still ramping up - cannot extend query period");
            return false;
        }
        return z1;
    }
}

