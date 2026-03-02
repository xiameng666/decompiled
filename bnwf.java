import com.google.android.gms.common.api.Status;

public final class bnwf implements glzn {
    public final bnwo a;
    public final azuh b;

    public bnwf(bnwo bnwo0, azuh azuh0) {
        this.a = bnwo0;
        this.b = azuh0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((bnvi)object0).b) {
            bnwd bnwd0 = new bnwd(null);
            bnwd0.b(ggna.a);
            return gmbu.i(gfsx.m(bnwd0.a()));
        }
        int v = this.a.b.a().equals(bnxi.a) ? 46500 : 46502;
        if(!((bnvi)object0).a) {
            ((ggtj)bnwo.a.h()).x("Domain keys locally unavailable and cannot be retrieved");
            bnwd bnwd1 = new bnwd(null);
            bnwd1.b(ggna.a);
            bnwd1.a = gfsx.m(Integer.valueOf(v));
            return gmbu.i(gfsx.m(bnwd1.a()));
        }
        ((ggtj)bnwo.a.h()).x("Domain keys locally unavailable but can be retrieved");
        return gmbu.h(new azuh(new Status(v, this.b.a.j, this.b.c())));
    }
}

