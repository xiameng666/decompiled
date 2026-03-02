import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.List;

@ibnh
public final class bnqg implements fquu {
    public static final bboh a;
    public final Context b;
    private final frli c;

    static {
        bnqg.a = bboh.b("DeviceCacheImpl", bbcu.eD);
    }

    public bnqg(frli frli0, Context context0) {
        this.c = frli0;
        this.b = context0;
    }

    public final gfsx a(gfsx gfsx0) {
        gfsx gfsx4;
        gfsx gfsx2;
        gfsx gfsx1;
        if(!gfsx0.i()) {
            return gfqx.a;
        }
        fqxl fqxl0 = (fqxl)gfsx0.d();
        try {
            gfsx1 = bpsq.d(this.b, fqxl0.l);
            if(!gfsx1.i()) {
                return gfqx.a;
            }
        }
        catch(IOException | acse exception0) {
            a.ae(bnqg.a.i(), "Failed getting account from Oid list", exception0);
            return gfqx.a;
        }
        fqum fqum0 = new fqum(null);
        fqum0.a(ggna.a);
        gsyz gsyz0 = fqxl0.c == null ? gsyz.a : fqxl0.c;
        if(gsyz0 == null) {
            throw new NullPointerException("Null canonicDeviceId");
        }
        fqum0.a = gsyz0;
        if((fqxl0.b & 2) == 0) {
            gfsx2 = gfqx.a;
        }
        else {
            try {
                fqzw fqzw0 = fqxl0.d == null ? fqzw.a : fqxl0.d;
                gfsx2 = gfsx.m(((fqwq)new fqul().ic().kt(fqzw0)));
            }
            catch(IllegalStateException unused_ex) {
                gfsx2 = gfqx.a;
            }
        }
        fqum0.b = gfsx2;
        if((fqxl0.b & 8) != 0 && (fqxl0.b & 16) != 0 && (fqxl0.b & 0x20) != 0) {
            fqew fqew0 = fqex.a();
            fqew0.d(fqxl0.f);
            fqew0.b(fqxl0.g);
            fqew0.f((gtac.b(fqxl0.h) == 0 ? 2 : gtac.b(fqxl0.h)));
            fqew0.e((gszr.b(fqxl0.i) == null ? gszr.a : gszr.b(fqxl0.i)));
            gfsx gfsx3 = (fqxl0.b & 0x200) == 0 ? gfqx.a : gfsx.m((fqxl0.m == null ? gtai.a : fqxl0.m));
            fqew0.c(gfsx3);
            gfsx4 = gfsx.m(fqew0.a());
        }
        else {
            gfsx4 = gfqx.a;
        }
        fqum0.c = gfsx4;
        fqum0.d = fqxl0.j;
        fqum0.e = fqxl0.k;
        fqum0.k = 3;
        fqum0.f = (Account)gfsx1.d();
        fqum0.g = gfsx.l(gfta.a(fqxl0.e));
        fqum0.h = gfsx.l(gfta.a(fqxl0.n));
        gfsx gfsx5 = (fqxl0.b & 0x800) == 0 ? gfqx.a : gfsx.m((gszv.b(fqxl0.o) == null ? gszv.a : gszv.b(fqxl0.o)));
        fqum0.i = gfsx5;
        fqum0.a(gged_interceptors.i(fqxl0.p));
        if(fqum0.k == 3) {
            gsyz gsyz1 = fqum0.a;
            if(gsyz1 != null) {
                Account account0 = fqum0.f;
                if(account0 != null) {
                    gged_interceptors gged0 = fqum0.j;
                    if(gged0 != null) {
                        return gfsx.m(new fqun(gsyz1, fqum0.b, fqum0.c, fqum0.d, fqum0.e, account0, fqum0.g, fqum0.h, fqum0.i, gged0));
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(fqum0.a == null) {
            stringBuilder0.append(" canonicDeviceId");
        }
        if((fqum0.k & 1) == 0) {
            stringBuilder0.append(" lastLowBatteryNotificationTimeMillis");
        }
        if((fqum0.k & 2) == 0) {
            stringBuilder0.append(" lastCriticalBatteryNotificationTimeMillis");
        }
        if(fqum0.f == null) {
            stringBuilder0.append(" account");
        }
        if(fqum0.j == null) {
            stringBuilder0.append(" lostInfo");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    @Override  // fquu
    public final gmcd b(Account account0, fquw fquw0) {
        return this.v(account0, gged_interceptors.l(fquw0), true);
    }

    @Override  // fquu
    public final gmcd c() {
        bnpn bnpn0 = new bnpn(this);
        return this.c.b(bnpn0, gmap.a);
    }

    @Override  // fquu
    public final gmcd d() {
        bnqa bnqa0 = new bnqa();
        return this.c.b(bnqa0, gmap.a);
    }

    @Override  // fquu
    public final gmcd e(gsyz gsyz0, long v) {
        return gdtf.j(this.c.a(), new bnpu(gsyz0, v), gmap.a);
    }

    @Override  // fquu
    public final gmcd f(ByteString hfsf0) {
        return gdta.g(this.c.a()).h(new bnpo(this, hfsf0), gmap.a);
    }

    @Override  // fquu
    public final gmcd g() {
        return gdta.g(this.c.a()).h(new bnpi(this), gmap.a);
    }

    @Override  // fquu
    public final gmcd h() {
        return this.u(gfqx.a);
    }

    @Override  // fquu
    public final gmcd i(Account account0) {
        return this.u(gfsx.m(account0));
    }

    @Override  // fquu
    public final gmcd j(gsyz gsyz0) {
        return gdta.g(this.c.a()).h(new bnpr(this, gsyz0), gmap.a);
    }

    @Override  // fquu
    public final gmcd k(String s) {
        return gdtf.j(this.c.a(), new bnpl(this, s), gmap.a);
    }

    @Override  // fquu
    public final gmcd l() {
        return gdtf.j(this.c.a(), new bnpy(), gmap.a);
    }

    @Override  // fquu
    public final gmcd m(gsyz gsyz0) {
        bnpa bnpa0 = new bnpa(gsyz0);
        return this.c.b(bnpa0, gmap.a);
    }

    @Override  // fquu
    public final gmcd n(gsyz gsyz0, String s) {
        bnpt bnpt0 = new bnpt(gsyz0, s);
        return this.c.b(bnpt0, gmap.a);
    }

    @Override  // fquu
    public final gmcd o(gsyz gsyz0, boolean z) {
        bnpm bnpm0 = new bnpm(z, gsyz0);
        return this.c.b(bnpm0, gmap.a);
    }

    @Override  // fquu
    public final gmcd p(gsyz gsyz0, long v) {
        bnpj bnpj0 = new bnpj(gsyz0, v);
        return this.c.b(bnpj0, gmap.a);
    }

    @Override  // fquu
    public final gmcd q(gsyz gsyz0, fqus fqus0) {
        bnpc bnpc0 = new bnpc(gsyz0, fqus0);
        return this.c.b(bnpc0, gmap.a);
    }

    @Override  // fquu
    public final gmcd r(Account account0, List list0) {
        return this.v(account0, list0, false);
    }

    @Override  // fquu
    public final gmcd s(List list0) {
        bnqc bnqc0 = new bnqc(ggkm.f(list0, new bnqb()));
        return this.c.b(bnqc0, gmap.a);
    }

    @Override  // fquu
    public final gmcd t(gsyz gsyz0, int v, long v1) {
        bnpp bnpp0 = new bnpp(gsyz0, v, v1);
        return this.c.b(bnpp0, gmap.a);
    }

    private final gmcd u(gfsx gfsx0) {
        gfsx gfsx1;
        try {
            gfsx1 = gfqx.a;
            if(gfsx0.i()) {
                String s = ((Account)gfsx0.d()).name;
                gfsx1 = gfsx.m(acso.e(this.b, s));
                return gdtf.j(this.c.a(), new bnpd(this, gfsx1), gmap.a);
            }
        }
        catch(IOException | acse exception0) {
            a.ae(bnqg.a.i(), "Failed getting Obfuscated Gaia Id when storing devices", exception0);
            return gmbu.h(exception0);
        }
        return gdtf.j(this.c.a(), new bnpd(this, gfsx1), gmap.a);
    }

    private final gmcd v(Account account0, List list0, boolean z) {
        String s;
        gftb.checkTrue(!z || list0.size() == 1);
        try {
            s = acso.e(this.b, account0.name);
        }
        catch(IOException | acse exception0) {
            a.ae(bnqg.a.i(), "Failed getting Obfuscated Gaia Id when storing devices", exception0);
            return gmbu.h(exception0);
        }
        bnpk bnpk0 = new bnpk(ggkm.f(list0, new bnqb()), z, s, list0);
        return this.c.b(bnpk0, gmap.a);
    }
}

