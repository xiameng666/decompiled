import java.util.Objects;

final class cfb extends ibur implements ibts {
    final cfe a;
    final ibq b;

    public cfb(cfe cfe0, ibq ibq0) {
        this.a = cfe0;
        this.b = ibq0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v2;
        long v3;
        cfe cfe0 = this.a;
        cfe0.a = true;
        cgi cgi0 = cfe0.i().a();
        if(!cfe0.b.m()) {
            ibp.y(((ibp)object0), this.b, 0, 0);
            return ibom.a;
        }
        if(cgi0.i()) {
            cgv cgv0 = cgi0.b();
            if(cgv0 != null) {
                long v = 0L;
                hka hka0 = cgi0.c();
                if(hka0 != null) {
                    if(cfe0.i().b.d()) {
                        ibq ibq0 = this.b;
                        hzk hzk0 = ((ibp)object0).o();
                        if(hzk0 == null) {
                            ibp.y(((ibp)object0), ibq0, 0, 0);
                            return ibom.a;
                        }
                        boolean z = cfe0.i().a().f();
                        long v1 = cfe0.j().h(hzk0, 0L);
                        hjz hjz0 = null;
                        if(z) {
                            cfe0.a().d(hka0, cgk.a(cgv0), null);
                        }
                        else {
                            cfe0.a().d(hka0, cgk.a(cgv0), new cfa());
                        }
                        hka hka1 = cfe0.a().c();
                        hjz hjz1 = hka1 == null ? null : new hjz(hjz.d(hjz.c(hka1.c(), cgv0.b()), cgv0.a()));
                        if(cfe0.a().f() || !z) {
                            if(hjz1 == null) {
                                v3 = v1;
                            }
                            else {
                                v3 = hjz1.a;
                                hjz0 = hjz1;
                            }
                            cfe0.i().a().e((hjz0 == null ? hkb.b(v1, jll.b(hzk0.g())) : hkb.b(hjz0.a, hka1.b())));
                            v2 = v3;
                        }
                        else if(hjz1 != null) {
                            v2 = hjz1.a;
                        }
                        else {
                            v2 = hka0.c();
                        }
                        long v4 = hjz.c(v2, v1);
                        ibp.y(((ibp)object0), ibq0, Math.round(Float.intBitsToFloat(((int)(v4 >> 0x20)))), Math.round(Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL)))));
                        return ibom.a;
                    }
                    ibq ibq1 = this.b;
                    if(!cfe0.a().f()) {
                        hzk hzk1 = ((ibp)object0).o();
                        if(hzk1 != null) {
                            v = jlg.b(hjz.c(hka0.c(), cfe0.j().h(hzk1, 0L)));
                        }
                        ibp.y(((ibp)object0), ibq1, jlf.a(v), jlf.b(v));
                        return ibom.a;
                    }
                    ibp.y(((ibp)object0), ibq1, 0, 0);
                    return ibom.a;
                }
                Objects.toString(cgi0);
                throw new IllegalArgumentException("Match State is configured, but current bounds is null. State = " + cgi0);
            }
            Objects.toString(cgi0);
            throw new IllegalArgumentException("Match State is configured, but target data is null. State = " + cgi0);
        }
        ibp.y(((ibp)object0), this.b, 0, 0);
        return ibom.a;
    }
}

