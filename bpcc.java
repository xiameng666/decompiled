import android.location.Location;
import java.util.concurrent.TimeUnit;

public final class bpcc implements glzn {
    public final bpce a;
    public final bpko b;
    public final gfsx c;
    public final boolean d;
    public final Location e;
    public final boolean f;
    public final fqus g;

    public bpcc(bpce bpce0, bpko bpko0, gfsx gfsx0, boolean z, Location location0, boolean z1, fqus fqus0) {
        this.a = bpce0;
        this.b = bpko0;
        this.c = gfsx0;
        this.d = z;
        this.e = location0;
        this.f = z1;
        this.g = fqus0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = this.d;
        gfsx gfsx0 = this.c;
        bpko bpko0 = this.b;
        bpce bpce0 = this.a;
        Boolean boolean0 = Boolean.valueOf(false);
        switch(((bpcm)object0).ordinal()) {
            case 0: {
                ((ggtj)((ggtj)((ggtj)bpce0.b.h()).o(30, TimeUnit.SECONDS)).ar(4900)).x("Dropping a sighting as notable locations not initialized");
                if(!hsxo.e()) {
                    bpbl bpbl0 = new bpbl();
                    bpce0.m.a(bpbl0);
                }
                hadw hadw0 = bpkq.b(gfsx0.a(bpko0.e), z);
                bpce0.p.c(hadx.f, bpko0, hadw0);
                return gmbu.i(boolean0);
            }
            case 1: {
                ((ggtj)((ggtj)((ggtj)bpce0.b.h()).o(30, TimeUnit.SECONDS)).ar(4899)).x("Dropping a sighting in a notable location");
                if(!hsxo.e()) {
                    bpbk bpbk0 = new bpbk();
                    bpce0.m.a(bpbk0);
                }
                hadw hadw1 = bpkq.b(gfsx0.a(bpko0.e), z);
                bpce0.p.c(hadx.e, bpko0, hadw1);
                return gmbu.i(boolean0);
            }
            default: {
                bpjo bpjo0 = new bpjo(gged_interceptors.l(bpko0), this.e, gfsx0);
                return gdta.g(bpce0.g.c(bpjo0)).i(new bpbn(bpce0, this.f, bpko0, this.g), bpce0.r).h(new bpbo(), gmap.a);
            }
        }
    }
}

