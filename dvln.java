import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dvln implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    final Provider l;
    final Provider m;
    final Provider n;
    final Provider o;
    private final domv p;
    private final dola q;

    public dvln(dola dola0, edor edor0, domv domv0) {
        this.p = domv0;
        this.q = dola0;
        dvll dvll0 = new dvll(domv0);
        this.a = dvll0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(dvll0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(dvll0, dole0);
        this.e = ears0;
        earp earp0 = new earp(dvll0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(dvll0, dmgj0, earp0));
        dmkm dmkm0 = new dmkm(dvll0);
        this.h = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.i = edrr0;
        this.j = DoubleCheck.b(new edrz(edrr0));
        edsf edsf0 = new edsf(dvll0);
        this.k = edsf0;
        dvlm dvlm0 = new dvlm(edor0);
        this.l = dvlm0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dvlm0);
        this.m = edrn0;
        this.n = DoubleCheck.b(new edrj(edrn0));
        this.o = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.p.a();
        return new dmgi(dolf.b(this.q), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.p.a(), dolf.b(this.q), dole.b(this.q), dmgy.a(), null, Optional.empty());
    }

    final dmkl c() {
        return new dmkl(this.p.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvlu dvlu0 = (dvlu)object0;
        Context context0 = this.p.a();
        dvma dvma0 = new dvma(dole.b(this.q), dmgy.a(), ((eaqx)this.g.get()));
        dydx dydx0 = new dydx(dydy.a(), dmgy.a(), dolf.b(this.q), this.p.a());
        dvlp dvlp0 = new dvlp(dolc.b(this.q), this.p.h(), this.a());
        dvlr dvlr0 = new dvlr(this.p.h(), dolf.b(this.q));
        Context context1 = this.p.a();
        this.b();
        dvlu0.c = new dvlt(context0, dvma0, new dvmd(dydx0, dvlp0, dvlr0, context1));
        dvlu0.d = new dvgv(new dvfu(this.a(), new dmgm(dmgy.a())), this.c(), this.b(), dvga.b(((edrp)this.j.get())), new edmu(this.c(), ((edrk)this.n.get()), ((edrg)this.o.get())));
    }
}

