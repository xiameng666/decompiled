import com.google.android.gms.auth.folsom.SharedKey;

public final class bnwi implements glzn {
    public final bnwo a;
    public final gfsx b;

    public bnwi(bnwo bnwo0, gfsx gfsx0) {
        this.a = bnwo0;
        this.b = gfsx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbu.i(((gfsx)object0));
        }
        gfsx gfsx0 = this.b;
        bnwe bnwe0 = (bnwe)((gfsx)object0).d();
        bnwk bnwk0 = new bnwk();
        if(!fray.b(((boolean)(gfsx0.i() ^ 1)), bnwk0)) {
            gged_interceptors gged0 = bnwe0.a;
            if(!gged0.isEmpty()) {
                gfsx gfsx1 = gfqx.a;
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    SharedKey sharedKey0 = (SharedKey)gged0.get(v1);
                    if(gfsx1.i()) {
                        int v2 = (int)(((Integer)gfsx1.d()));
                        if(sharedKey0.a > v2) {
                            gfsx1 = gfsx.m(Integer.valueOf(sharedKey0.a));
                        }
                    }
                    else {
                        gfsx1 = gfsx.m(Integer.valueOf(sharedKey0.a));
                    }
                }
                if(((int)(((Integer)gfsx0.d()))) <= ((int)(((Integer)gfsx1.d())))) {
                    ((ggtj)bnwo.a.h()).x("No reason to believe that the available Keychain domain keys are stale.");
                    return gdta.g(gmbu.i(bnwe0)).h(new bnwn(), gmap.a);
                }
                ((ggtj)bnwo.a.h()).R("Domain key #%d (> max locally available #%d) known to exist, refreshing", gfsx0.d(), gfsx1.d());
                return gdta.g(gdta.g(this.a.b.h()).i(new bnwl(this.a), this.a.c).h(new bnwm(), gmap.a)).h(new bnwn(), gmap.a);
            }
        }
        return gdta.g(gmbu.i(bnwe0)).h(new bnwn(), gmap.a);
    }
}

