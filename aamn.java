import android.os.Bundle;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import java.util.ArrayList;
import java.util.List;

public final class aamn implements aacc {
    public final aami a;
    public final aaln b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final lqd f;
    public final lqd g;
    public final lqd h;
    public final lqh i;
    public final lqd j;
    public final lqh k;
    public final lqd l;
    public final lqd m;
    public boolean n;
    public boolean o;
    private final lqd p;
    private final aaon q;

    public aamn(Bundle bundle0, aaln aaln0, aaon aaon0) {
        this.o = false;
        aami aami0 = new aami(zhp.g(bundle0.getByteArray("screenKey")));
        this.a = aami0;
        this.b = aaln0;
        this.q = aaon0;
        lqd lqd0 = aaln0.a(aami0.a);
        this.p = lqd0;
        lqd lqd1 = aaln0.b(aami0.a);
        lqd lqd2 = lsa.c(lqd0, new aamb(aaln0));
        lqd lqd3 = lsa.c(lqd2, new aamf(this));
        lqd lqd4 = lsa.c(lqd3, new aamg(this));
        lqh lqh0 = new lqh();
        this.k = lqh0;
        if(hoju.p()) {
            lqh0.o(new zhd(lqd2, lqd0, new aalr(aaln0)), new aals(this));
        }
        aalj aalj0 = new aalj();
        this.l = lsa.c(aaln0.i, aalj0);
        aalk aalk0 = new aalk();
        this.m = lsa.c(aaln0.i, aalk0);
        aalt aalt0 = new aalt(this);
        zhh zhh0 = new zhh(lqd3, lqd4, aaln0.e, aalt0);
        this.c = zhh0;
        this.d = lsa.c(lqd0, new aalu(this));
        this.e = lsa.b(lqd0, new aalv());
        this.f = lsa.b(lqd1, new aalw());
        aalx aalx0 = new aalx(this);
        zhd zhd0 = new zhd(lqd1, aaon0.k, aalx0);
        this.h = zhd0;
        this.g = lsa.c(lqd0, new aama(this));
        lqh lqh1 = new lqh();
        this.i = lqh1;
        lqh1.l(fhru.a);
        aamc aamc0 = new aamc(this);
        lqh1.o(aaon0.j, aamc0);
        lqh1.o(zhh0, new aamd(this));
        lqh1.o(zhd0, new aame(this));
        this.j = aaln0.c;
    }

    @Override  // aacc
    public final void a(grxw grxw0) {
        throw null;
    }

    public final aatb b() {
        return this.b.d();
    }

    public final grxw c() {
        return this.a.a;
    }

    public final List d(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(this.b.a(((grxw)object0)));
        }
        return list1;
    }

    public final void e(String s) {
        aaln aaln0 = this.b;
        aaon aaon0 = this.q;
        aaln0.l.l(aaon0.b().c);
        if(!bxic.e(cchj.b(AppContextProvider.a()), s)) {
            return;
        }
        aaon0.c();
        aaln0.m(s);
        aaln0.j();
        aaln0.i(aaon0.b());
    }

    public final void f() {
        this.q.e();
    }

    public final void g() {
        this.b.i(this.a.a);
    }

    public final void h(aape aape0, grwp grwp0, int v) {
        this.q.j(aape0, grwp0, v);
    }

    public final void i() {
        List list0 = (List)this.c.ij();
        Boolean boolean0 = (Boolean)this.h.ij();
        aanx aanx0 = (aanx)this.q.j.ij();
        zho zho0 = (zho)this.p.ij();
        if(boolean0 != null && !boolean0.booleanValue() && list0 != null && !list0.isEmpty() && aanx0 != null && zho0 != null) {
            if(aamn.j(zho0) == aamn.j(aanx0.a)) {
                fhru fhru0 = aanx0.e;
                if(!fhru0.b()) {
                    String s = ((aany)fhru0.a()).a;
                    for(int v = 0; v < list0.size(); ++v) {
                        if(s.equals(((aamh)list0.get(v)).b.d)) {
                            fhru fhru1 = new fhru(new aaml(new aape(v, 0), aanx0.d, true));
                            this.i.l(fhru1);
                            return;
                        }
                    }
                }
                fhru fhru2 = aanx0.f;
                if(!fhru2.b()) {
                    fhru fhru3 = new fhru(new aaml(((aape)fhru2.a()), aanx0.d, false));
                    this.i.l(fhru3);
                }
                return;
            }
            this.i.l(fhru.a);
            return;
        }
        this.i.l(fhru.a);
    }

    private static int j(zho zho0) {
        if(zho0 != null) {
            return zho0.a == null ? -1 : (zho0.a.e == null ? grxw.a : zho0.a.e).c;
        }
        return -1;
    }
}

