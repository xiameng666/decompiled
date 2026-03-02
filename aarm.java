import android.content.Context;
import android.os.Bundle;

public final class aarm {
    public final Context a;
    public final aaln b;
    public final aaqk c;
    public final lqd d;
    public final lqi e;
    public final lqd f;
    public final lqd g;
    public final lqd h;
    public final lqd i;
    public final lqd j;
    public final lqd k;
    public Integer l;
    public final aaon m;
    private final lqd n;
    private final lqd o;
    private final lqd p;
    private final lqi q;

    public aarm(Context context0, Bundle bundle0, aaln aaln0, aaon aaon0) {
        ibuq.f(bundle0, "arguments");
        lqd lqd5;
        ibuq.f(aaln0, "accountModel");
        ibuq.f(aaon0, "navStackModel");
        super();
        this.a = context0;
        this.b = aaln0;
        this.m = aaon0;
        ibuq.f(bundle0, "bundle");
        aaqk aaqk0 = new aaqk(zhp.h(bundle0.getByteArray("welcomeHeaderKey")), zhp.h(bundle0.getByteArray("simpleHeaderKey")), bundle0.getBoolean("isPlaceholder"), bundle0.getBoolean("isTrampoline"), bundle0.getBoolean("hasNav"));
        this.c = aaqk0;
        grxw grxw0 = aaqk0.a;
        lqd lqd0 = grxw0 == null ? new lqi() : lsa.a(lsa.b(aaln0.a(grxw0), new aarl(this)));
        this.d = lqd0;
        grxw grxw1 = aaqk0.b;
        lqd lqd1 = grxw1 == null ? new lqi() : lsa.a(lsa.b(aaln0.a(grxw1), new aark(this)));
        this.n = lqd1;
        ibuq.e(aaln0.c, "getDisplayEmail(...)");
        lqd lqd2 = lsa.a(aaln0.c);
        this.o = lqd2;
        ibuq.e(aaln0.d, "getParticleDiscData(...)");
        lqd lqd3 = lsa.a(aaln0.d);
        this.p = lqd3;
        lqi lqi0 = new lqi(fhru.a);
        this.e = lqi0;
        this.f = new lqi((aaqk0.e ? aaqz.a : aaqz.b));
        lqd lqd4 = aaqk0.b != null && aaqk0.a == null ? lsa.b(lqd1, new aaql(this)) : new lqi(this.a(null));
        this.g = lqd4;
        this.h = new lqi((aaqk0.d || aaqk0.c ? aara.b : aara.a));
        if(aaqk0.a != null) {
            lqd5 = lsa.b(lqd0, new aaqm());
        }
        else if(aaqk0.b == null) {
            lqd5 = new lqi();
        }
        else {
            lqd5 = lsa.b(lqd1, new aaqn());
        }
        this.i = lqd5;
        lqd lqd6 = aaqk0.a == null ? lsa.b(lqd3, new aaqp(this)) : new zhh(lqd0, lqd2, lqd3, new aaqo(this));
        this.j = lqd6;
        lqi lqi1 = new lqi();
        this.q = lqi1;
        lsa.a(lqi1);
        this.k = lqi0;
        aarj aarj0 = new aarj(new aaqr(this));
        aaon0.j.ih(aarj0);
    }

    public final aarf a(grzb grzb0) {
        if(grzb0 != null && (grzb0.b != null && grzb0.b.length() > 0)) {
            String s = grzb0.b;
            ibuq.e(s, "getTitle(...)");
            return new aarc(s);
        }
        return this.c.d ? aard.a : aare.a;
    }

    public final void b(grxw grxw0) {
        this.m.i(grxw0, 6);
    }

    public final void c(String s) {
        if(s != null) {
            aaln aaln0 = this.b;
            aaon aaon0 = this.m;
            aaln0.l.l(aaon0.b().c);
            if(bxic.e(cchj.b(this.a), s)) {
                aaon0.c();
                aaln0.m(s);
                aaln0.j();
                aaln0.i(aaon0.b());
            }
        }
    }

    public final void d() {
        String s = this.b.d().b;
        ibuq.e(s, "getAccountName(...)");
        fhru fhru0 = new fhru(new aarh(s));
        this.e.l(fhru0);
        this.m.e();
    }
}

