import android.content.Context;
import android.os.Bundle;
import dagger.internal.InstanceFactory;

public final class aapz {
    public final aapx a;
    public final aaln b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final lqi f;
    public final lqd g;
    public final lqd h;
    public final lqd i;
    public boolean j;
    private final aaon k;

    public aapz(Context context0, lps lps0, Bundle bundle0, aaln aaln0, aaon aaon0, zes zes0) {
        aapx aapx0 = new aapx(zhp.g(bundle0.getByteArray("screenKey")));
        this.a = aapx0;
        this.b = aaln0;
        this.k = aaon0;
        lqd lqd0 = aaln0.a(aapx0.a);
        this.c = lqd0;
        lqd lqd1 = aaln0.b(aapx0.a);
        aapf aapf0 = new aapf(this);
        zhd zhd0 = new zhd(lqd1, aaon0.k, aapf0);
        lqd lqd2 = lsa.b(lqd1, new aapw(context0));
        this.i = hoju.f() && hoju.j() ? lsa.b(lqd0, new aapg()) : new lqi("");
        lqi lqi0 = new lqi("");
        this.f = lqi0;
        lqd lqd3 = lsa.c(lqd0, new aaph(aaln0));
        lqd lqd4 = lsa.b(lqd3, new aapi());
        lqd lqd5 = lsa.b(lqd3, new aapj());
        lqi lqi1 = new lqi(aapz.a(zes0, aaln0));
        aapk aapk0 = new aapk(lqi1, zes0, aaln0);
        aaln0.b.g(lps0, aapk0);
        new zhh(lqi1, lqi0, lqd5, new aapl()).g(lps0, new aapm());
        lqd lqd6 = lsa.c(lqi0, new aapp(lqd4, lsa.b(lsa.c(lqi1, new aapn()), new aapo())));
        this.d = lqd6;
        lqd lqd7 = lsa.c(lqi1, new aapq());
        this.g = new zhd(zhd0, lsa.b(lqd7, new aapr()), new aaps());
        zhd zhd1 = new zhd(lqd2, lsa.b(lqd7, new aapt(context0)), new aapu());
        this.h = zhd1;
        if(hoju.f() && hoju.j()) {
            this.e = new zhd(zhd1, lqd6, new aapv());
            return;
        }
        this.e = new lqi(ggna.a);
    }

    public static zml a(zes zes0, aaln aaln0) {
        aatb aatb0 = aaln0.d();
        zmt zmt0 = ((zmu)((InstanceFactory)((zff)zes0).a.a(aatb0).l).a).a;
        aauo aauo0 = (aauo)zmt0.b.get();
        zjw zjw0 = (zjw)zmt0.c.get();
        zkl zkl0 = (zkl)zmt0.d.get();
        zjt zjt0 = ((zju)zmt0.e).a();
        icck icck0 = zgc.a();
        icck icck1 = zga.a();
        return new zms(aaln0.g, ((aatb)((InstanceFactory)zmt0.a).a), aauo0, zjw0, zkl0, zjt0, icck0, icck1);
    }

    public final grxw b() {
        return this.a.a;
    }

    public final void c() {
        this.b.i(this.a.a);
    }

    public final void d() {
        this.b.i(this.a.a);
        lqi lqi0 = this.f;
        if(!bbqr.d(((String)lqi0.ij()))) {
            lqi0.l(((String)lqi0.ij()));
        }
    }

    public final void e() {
        this.k.h(2);
    }

    public final void f(String s) {
        this.f.l(s);
    }

    public final void g(grxw grxw0) {
        this.k.i(grxw0, 4);
    }
}

