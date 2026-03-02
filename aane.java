import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;

public final class aane {
    public final aaln a;
    public final lqd b;
    public final lqh c;
    public grwy d;
    private final lqd e;
    private final lqd f;
    private final lqd g;
    private final lqd h;
    private final aavx i;

    public aane(aaln aaln0, grxw grxw0, aavx aavx0) {
        this.i = aavx0;
        this.a = aaln0;
        lqd lqd0 = aaln0.a(grxw0);
        this.b = lqd0;
        lqd lqd1 = aaln0.b(grxw0);
        this.f = lqd1;
        lqd lqd2 = lsa.c(lqd0, new aana(aaln0));
        this.e = lqd2;
        lqi lqi0 = aaln0.k.a.b();
        this.g = lqi0;
        lqi lqi1 = aaln0.k.a.a();
        this.h = lqi1;
        lqh lqh0 = new lqh();
        this.c = lqh0;
        lqh0.l(new zhi(1));
        lqh0.o(lqd1, new aanb(this));
        lqh0.o(lqd0, new aanc(this));
        lqh0.o(lqd2, new aanc(this));
        lqh0.o(lqi0, new aand(this));
        lqh0.o(lqi1, new aand(this));
    }

    public final zhi a() {
        zhi zhi0 = (zhi)this.c.ij();
        gftb.check(zhi0);
        return zhi0;
    }

    public final void b() {
        zhi zhi0 = new zhi(4);
        this.c();
        this.c.l(zhi0);
    }

    public final void c() {
        this.c.p(this.f);
        this.c.p(this.b);
        this.c.p(this.e);
        this.c.p(this.g);
        this.c.p(this.h);
    }

    public final void d() {
        gsae gsae0;
        lqd lqd0 = this.f;
        if(lqd0.ij() != null) {
            lqd lqd1 = this.b;
            if(lqd1.ij() != null) {
                lqd lqd2 = this.e;
                if(lqd2.ij() != null) {
                    lqd lqd3 = this.g;
                    if(lqd3.ij() != null) {
                        lqd lqd4 = this.h;
                        if(lqd4.ij() != null) {
                            zhq zhq0 = (zhq)lqd0.ij();
                            gftb.check(zhq0);
                            if(zhq0.c != null) {
                                this.b();
                                return;
                            }
                            Boolean boolean0 = (Boolean)lqd4.ij();
                            gftb.check(boolean0);
                            if(boolean0.booleanValue()) {
                                zho zho0 = (zho)lqd1.ij();
                                gftb.check(zho0);
                                if(zho0.b()) {
                                    zhi zhi0 = new zhi(2);
                                    this.c.l(zhi0);
                                    return;
                                }
                                if(this.a().d != 4) {
                                    Resources resources0 = AppContextProvider.a().getResources();
                                    Configuration configuration0 = resources0.getConfiguration();
                                    int v = aabu.b(configuration0.screenWidthDp, AppContextProvider.a());
                                    int v1 = aabu.b(configuration0.screenHeightDp, AppContextProvider.a());
                                    if(configuration0.orientation != 2 && v <= resources0.getDimensionPixelSize(0x7F0701B9) && v1 <= resources0.getDimensionPixelSize(0x7F0701B8)) {  // dimen:as_ob_max_display_width
                                        grxw grxw0 = zhp.b(zho0.a());
                                        if(grxw0 == null) {
                                            this.b();
                                            return;
                                        }
                                        Boolean boolean1 = (Boolean)lqd3.ij();
                                        gftb.check(boolean1);
                                        if(boolean1.booleanValue()) {
                                            zho zho1 = (zho)lqd2.ij();
                                            gftb.check(zho1);
                                            if(zho1.b()) {
                                                zhi zhi1 = new zhi(2);
                                                this.c.l(zhi1);
                                                return;
                                            }
                                            this.d = zho1.a.c == 11 ? ((grwy)zho1.a.d) : grwy.a;
                                            if(zho1.a.c == 11 && (this.d != null && (this.d.b & 1) != 0 && !this.a.k.a.b.contains(Long.valueOf(this.d.c)) && !this.d.e.isEmpty())) {
                                                this.c();
                                                zhi zhi2 = new zhi(2);
                                                this.c.l(zhi2);
                                                aavx aavx0 = this.i;
                                                grwy grwy0 = this.d;
                                                String s = grwy0.e;
                                                if((grwy0.b & 4) == 0) {
                                                    gsae0 = null;
                                                }
                                                else {
                                                    gsae0 = grwy0.f;
                                                    if(gsae0 == null) {
                                                        gsae0 = gsae.a;
                                                    }
                                                }
                                                clcf clcf0 = clcg.f(gfta.b(ccht.b(s, gsae0)), cjxp.b, clbk.a, clbj.a);
                                                aamy aamy0 = new aamy(this, grxw0);
                                                aamz aamz0 = new aamz(this);
                                                aavw aavw0 = new aavw(aamy0, aamz0, aavx0.b);
                                                clcj clcj0 = aauy.a().e(clcf0, aavw0, aavx0.a, -1, 0x1006);
                                                clcj0.n("GET");
                                                clcn clcn0 = clcj0.e();
                                                try {
                                                    gmcd gmcd0 = aavx0.c;
                                                    if(gmcd0 != null) {
                                                        gmcd0.cancel(false);
                                                    }
                                                    aavx0.c = clcn0.a();
                                                }
                                                catch(Exception unused_ex) {
                                                    aamz0.a();
                                                }
                                                return;
                                            }
                                            this.b();
                                        }
                                    }
                                    else {
                                        this.b();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

