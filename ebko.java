import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class ebko implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dola h;
    private final domv i;
    private final dmgr j;
    private final domw k;

    public ebko(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.h = dola0;
        this.i = domv0;
        this.j = dmgr0;
        this.k = domw0;
        ebkm ebkm0 = new ebkm(domv0);
        this.a = ebkm0;
        edsf edsf0 = new edsf(ebkm0);
        this.b = edsf0;
        dmkm dmkm0 = new dmkm(ebkm0);
        this.c = dmkm0;
        ebkn ebkn0 = new ebkn(edor0);
        this.d = ebkn0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebkn0);
        this.e = edrn0;
        this.f = DoubleCheck.b(new edrj(edrn0));
        this.g = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(dolf.b(this.h), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.i.a(), dolf.b(this.h), dole.b(this.h), dmgy.a(), this.j.a, Optional.empty());
    }

    final dypo c() {
        return new dypo(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final dypv d() {
        return new dypv(this.b(), new dlnm(new acqn(this.i.a()), dolf.b(this.h), dole.b(this.h)));
    }

    final dypz e() {
        return new dypz(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final etgl f() {
        return new etgl(this.i.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebrj ebrj0 = (ebrj)object0;
        ebrj0.d = new dyre(dolc.b(this.h), this.c(), new dypx(this.i.a(), dole.b(this.h), dmgy.a()), this.e(), this.d(), this.a(), new ebst(this.i.h()), new dmue(this.f(), new dlmc(this.i.a(), dole.b(this.h), dmgy.a()), new dmtn(this.i.a(), dole.b(this.h), dmgy.a(), new earj(new earo(this.i.a(), dole.b(this.h), dmgy.a(), new earr(this.i.a(), dole.b(this.h), dmgy.a())))), new dmuj(this.b(), new fbio(this.i.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.h))), new edmu(new dmkl(this.i.a()), ((edrk)this.f.get()), ((edrg)this.g.get()))), new bblp(1, 10), easp.a(), this.c(), this.e(), new dypr(this.c()), new dmuh(dolc.b(this.h), this.f(), new eeeg(this.i.a(), dolf.b(this.h), dmgy.a())), new dxzo(dolc.b(this.h), dmgy.a(), new bblp(0x7FFFFFFF, 9))), easp.a());
        ebrj0.e = this.d();
        ebrj0.f = this.e();
        ebrj0.g = new ebwl(this.a(), gfug.c(ecwh.a()));
        ebrj0.h = easp.a();
    }
}

