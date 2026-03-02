import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Feature;
import j..util.Collection.-EL;

public final class bpbu implements glzn {
    public final bpce a;
    public final bpjm b;
    public final gfsx c;
    public final boolean d;
    public final long e;
    public final long f;
    public final gfsx g;

    public bpbu(bpce bpce0, bpjm bpjm0, gfsx gfsx0, boolean z, long v, long v1, gfsx gfsx1) {
        this.a = bpce0;
        this.b = bpjm0;
        this.c = gfsx0;
        this.d = z;
        this.e = v;
        this.f = v1;
        this.g = gfsx1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        bpcd bpcd0;
        bpjm bpjm0 = this.b;
        if(((Boolean)object0).booleanValue()) {
            if(!hsxo.h()) {
                return gmbx.a;
            }
            cijq cijq0 = cijq.v();
            bpbs bpbs0 = new bpbs(bpjm0);
            cijq0.j(((ProtoLiteMessage)bnns.a(hadq.c, bpbs0)));
            return gmbx.a;
        }
        gfsx gfsx0 = bpjm0.c;
        if(gfsx0.i()) {
            gsyz gsyz0 = ((fqun)gfsx0.d()).a;
            Account account0 = ((fqun)gfsx0.d()).f;
            bpcd0 = new bpcd(gfsx.m(bpjm0), gfsx.m(gsyz0), gfsx.m(account0));
        }
        else {
            bpcd0 = new bpcd(gfsx.m(bpjm0), gfqx.a, gfqx.a);
        }
        boolean z = hsww.d() && gfsx0.i() && Collection.-EL.stream(((fqun)gfsx0.d()).j).anyMatch(new bpbh());
        long v = this.e;
        gfsx gfsx1 = this.c;
        bpce bpce0 = this.a;
        gmcd gmcd0 = bpce0.c(bpcd0, bpjm0.d, this.f, v, gfsx1, bpjm0.g, z);
        gmcd gmcd1 = gmbx.a;
        if(!this.d) {
            if(bpce.f(bpcd0, gfsx1.i())) {
                return gdtd.h(new gmcd[]{gmcd0, gmcd1, bpce0.d(bpjm0, false)}).a(new bpbi(), gmap.a);
            }
            if(gfsx0.i()) {
                if(gfsx0.i() && ((fqun)gfsx0.d()).c.i()) {
                    gfsx gfsx2 = bpjm0.e;
                    if(gfsx2.i()) {
                        fqex fqex0 = (fqex)((fqun)gfsx0.d()).c.d();
                        long v1 = v - ((long)(((Long)gfsx2.d())));
                        if(v1 < -hsxv.i() || v1 > ((long)(1 << fqex0.a)) + hsxv.i()) {
                            Context context0 = bpce0.q;
                            gsyz gsyz1 = ((fqun)gfsx0.d()).a;
                            long v2 = fqex0.b;
                            Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.FIX_CLOCK_DRIFT");
                            if(intent0 != null) {
                                intent0.putExtra("device_id", gsyz1.b);
                                intent0.putExtra("fixed_clock_offset", v1 + v2);
                                intent0.putExtra("previous_clock_offset", v2);
                            }
                            if(intent0 != null) {
                                context0.startService(intent0);
                            }
                        }
                    }
                }
                gfsx gfsx3 = this.g;
                bnlt bnlt0 = new bnlt(bpce0.j, bpjm0);
                gmcd gmcd2 = bpce0.j.f.e(bnlt0);
                fqun fqun0 = (fqun)gfsx0.d();
                if(gfsx3.i()) {
                    gfsx gfsx4 = fqun0.b;
                    if(gfsx4.i() && ((fqwq)gfsx4.d()).b.i()) {
                        gfsx gfsx5 = fqun0.h;
                        if(gfsx5.i()) {
                            cxxq cxxq0 = new cxxq(((ByteString)((fqwq)gfsx4.d()).b.d()));
                            Object object1 = gfsx3.d();
                            String s = (String)gfsx5.d();
                            azzc azzc0 = new azzc();
                            azzc0.a = new cyhn(cxxq0, ((String)object1), s);
                            azzc0.c = new Feature[]{cumh.m};
                            azzc0.d = 1401;
                            azzd azzd0 = azzc0.a();
                            ((azts)bpce0.o).jn(azzd0).A(new bpbg(bpce0));
                        }
                    }
                }
                return gdtd.h(new gmcd[]{gmcd0, gmcd2, gmcd1}).a(new bpbi(), gmap.a);
            }
        }
        return gdtd.h(new gmcd[]{gmcd0, gmcd1, gmcd1}).a(new bpbi(), gmap.a);
    }
}

