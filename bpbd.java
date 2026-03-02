import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

public final class bpbd implements glzn {
    public final bpce a;
    public final bpko b;
    public final long c;
    public final boolean d;
    public final double e;
    public final boolean f;
    public final gfsx g;
    public final gfsx h;

    public bpbd(bpce bpce0, bpko bpko0, long v, boolean z, double f, boolean z1, gfsx gfsx0, gfsx gfsx1) {
        this.a = bpce0;
        this.b = bpko0;
        this.c = v;
        this.d = z;
        this.e = f;
        this.f = z1;
        this.g = gfsx0;
        this.h = gfsx1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((Boolean)object0).booleanValue()) {
            return gmbx.a;
        }
        long v = this.c;
        bpce bpce0 = this.a;
        gfsx gfsx0 = bpce0.e.b();
        bpce0.f.b(this.b, v, gfsx0, this.d);
        double f = hsxv.d();
        if(!(this.e <= f)) {
            if(!hsxo.e()) {
                bpbw bpbw0 = new bpbw();
                bpce0.m.a(bpbw0);
            }
            bpce0.e(v, this.h.i());
        }
        else if(this.f) {
            Context context0 = bpce0.q;
            Intent intent0 = boxr.c(context0);
            if(intent0 != null) {
                intent0.putExtra("location", ((Parcelable)this.g.d()));
                context0.startService(intent0);
                return gmbx.a;
            }
        }
        return gmbx.a;
    }
}

